package qa.agh.edu;

public class Items {
    public static void main(String[] args) {

        Book book0 = new Book("J. Kamiński", "Przygody w Amazonii");
        Book book1 = new Book("J.J. Martin", "Gra o tron");
        Book book2 = new Book("W. Cejrowski", "Rio Anaconda");
        Book book3 = new Book("J.K. Rowling", "Harry Potter");
        Magazine magazine0 = new Magazine("6", "Newsweek");
        Magazine magazine1 = new Magazine("2", "Gazeta");
        Magazine magazine2 = new Magazine("12", "CyberMycha");
        Magazine magazine3 = new Magazine("3", "Times");

        System.out.println("pojedyńcze czasopismo: " + magazine1.title + " numer " + magazine1.number);



      // public void printListOfMagazines () {


       //}

       // public void printListOfBooks () {


             //   System.out.println(book0.author)

      //  }

    }
}