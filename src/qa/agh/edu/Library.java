package qa.agh.edu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;


public class Library {

    private HashMap<User, String> userWithCardNumbers = new HashMap<>();
    private HashMap<User, List<Item>> userAndRents = new HashMap<>();
    private Map<Item, Integer> itemAndQuantity = new ConcurrentHashMap<Item,Integer>(); //TODO: why concurrent?
    private ArrayList<Item> itemsList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        new Library();
    }

    public Library() throws IOException {
        User user1 = new Student("Jan", "Mickiewicz");//to sa obiekty (muszą być w User)
        User user2 = new Student("Michał", "Pytla");
        User user3 = new Student("Ania", "Kobyłka");
        User user4 = new Student("Ola", "Piwko");
        User user5 = new Lecturer("Jacek", "Wojciechowksi");
        User user6 = new Lecturer("Anna", "Miła");

        addUserToLibrary(user1, user2, user3, user4, user5, user6);

        Item book0 = new Book("J. Kamiński", "Przygody w Amazonii");
        Item book1 = new Book("J.J. Martin", "Gra o tron");
        Item book2 = new Book("W. Cejrowski", "Rio Anaconda");
        Item book3 = new Book("J.K. Rowling", "Harry Potter");
        Item magazine0 = new Magazine("6", "Newsweek");
        Item magazine1 = new Magazine("2", "Gazeta");
        Item magazine2 = new Magazine("12", "CyberMycha");
        Item magazine3 = new Magazine("3", "Times");

        addItemToLibrary(book0, book1, book2, book3, magazine0, magazine1, magazine2, magazine3);

        printListOfUsers();

        rentItemToUser(book0, user1);

        printListOfMagazines();

        printListOfBooks();


        String pathToCurrentFile = System.getProperty("user.dir") + "/items.csv";
//        String pathToCurrentFile = "C:\\Users\\User\\nazwaProgramu\\items.csv";
        importItemsFromFile(pathToCurrentFile);

        String projectRoot = System.getProperty("user.dir");
        String filename = String.format("output.csv");

        exportUsersWithItemsToFile(projectRoot + "/" + filename);
    }

    public void addUserToLibrary(User... users) {

        int counter = 0;
        for (User user : users) {
            userWithCardNumbers.put(user, "ID" + counter++);
        }

    }

    public void addItemToLibrary(Item... items) {
        for (Item item : items) {
            for (Map.Entry<Item, Integer> entry : itemAndQuantity.entrySet()) {
                if (entry.getKey().getTitle().equalsIgnoreCase(item.getTitle())) {
                    entry.setValue(entry.getValue() + 1);
                }
                continue;
            }
            itemAndQuantity.put(item, 1);
        }
    }

    public boolean rentItemToUser(Item item, User user) {
        if (itemAndQuantity.keySet().contains(item)) {
            if (userAndRents.containsKey(user)) {
                Integer quantityOfRents = userAndRents.get(user).size();
                if (user instanceof Student) {
                    if (quantityOfRents == 4 || itemAndQuantity.get(item) == 0) {
                        return false;
                    }
                }
                if (user instanceof Lecturer) {
                    if (quantityOfRents == 10 || itemAndQuantity.get(item) == 0) {
                        return false;
                    }
                } else {
                    userAndRents.get(user).add(item);
                    itemAndQuantity.put(item, itemAndQuantity.get(item) - 1);
//                  List<Item> items = userAndRents.get(user);
//                  userAndRents.put(user, items);
                    return true;
                }
            } else {
                userAndRents.put(user, Collections.singletonList(item));
                return true;
            }
        }
        return false;
    }

    public void printListOfMagazines() {
        System.out.println("=================MAGAZINES=================");
        for (Map.Entry<Item, Integer> entry : itemAndQuantity.entrySet()) {
            if (entry.getKey() instanceof Magazine) {
                Integer rented = 0;
                String title = entry.getKey().getTitle();
                String number = entry.getKey().getField();
                Integer available = entry.getValue();
                for (Map.Entry<User, List<Item>> userEntry : userAndRents.entrySet()) {
                    List<Item> values = userEntry.getValue();
                    for (Item value : values) {
                        if (value.getTitle().equalsIgnoreCase(title)) {
                            rented++;
                        }
                    }
                }
                Integer allCopies = rented + available;
                System.out.printf("%s;%s;%d;%d", title, number, allCopies, available);
                System.out.println();
            }
        }
    }

    public void printListOfBooks() {
        System.out.println("=================BOOKS=================");
        for (Map.Entry<Item, Integer> entry : itemAndQuantity.entrySet()) {
            if (entry.getKey() instanceof Book) {
                Integer rented = 0;
                String title = entry.getKey().getTitle();
                String number = entry.getKey().getField();
                Integer available = entry.getValue();
                for (Map.Entry<User, List<Item>> userEntry : userAndRents.entrySet()) {
                    List<Item> values = userEntry.getValue();
                    for (Item value : values) {
                        if (value.getTitle().equalsIgnoreCase(title)) {
                            rented++;
                        }
                    }
                }
                Integer allCopies = rented + available;
                System.out.printf("%s;%s;%d;%d", title, number, allCopies, available);
                System.out.println("");
            }
        }
    }

    public void printListOfUsers() {
        System.out.println("=================USERS=================");
        for (Map.Entry<User, String> entry : userWithCardNumbers.entrySet()) {
            String firstName = entry.getKey().getFirstName();
            String lastName = entry.getKey().getLastName();
            String id = entry.getValue();
            String type = entry.getKey() instanceof Student ? "S" : "L";
            System.out.printf("%s;%s;%s;%s", firstName, lastName, id, type);
            System.out.println("");
        }

    }

    public void importItemsFromFile(String csvFile) throws FileNotFoundException {
        File file = new File(csvFile);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String[] split = scanner.nextLine().split(";");
            String title = split[0];
            String authorOrNumber = split[1];
            Integer quantity = Integer.parseInt(split[2]);
            String typeOfItem = split[3];
            Item item = null;
            if (typeOfItem.equals("B")) {
                item = new Book(authorOrNumber, title);
            } else if (typeOfItem.equals("M")) {
                item = new Magazine(authorOrNumber, title);
            }
            for (Map.Entry<Item, Integer> entry : itemAndQuantity.entrySet()) {
                if (entry.getKey().getTitle().equalsIgnoreCase(item.getTitle())) {
                    entry.setValue(entry.getValue() + quantity);
                } else {
                    itemAndQuantity.put(item, quantity);
                }
            }
        }

    }

    public void exportUsersWithItemsToFile(String csvFile) throws IOException {
        File file = new File(csvFile);
        FileWriter fileWriter = new FileWriter(file);

        for (Map.Entry<User, List<Item>> userEntry : userAndRents.entrySet()) {
            StringBuilder stringBuilder = new StringBuilder();
            String userId = userWithCardNumbers.get(userEntry.getKey());
            stringBuilder.append(userId + "[");
            List<Item> userRentedItems = userEntry.getValue();
            for (Item item : userRentedItems) {
                stringBuilder.append(item.getTitle() + "-" + item.getField() + ";");
            }
            stringBuilder.append("]");
            fileWriter.write(stringBuilder.toString());
        }
        fileWriter.close();
    }

}


