package publicLibrary;

public class Tester {
    public static void main(String[] args) {
        Lecturer grzegorz = new Lecturer("Grzegorz", "Szczutkowski", 'L', 0, 2);
        Lecturer tomek = new Lecturer("Marek", "Koźmiński", 'L', 1, 3 );
        Lecturer kasia = new Lecturer("Kasia", "Kowalska", 'L', 5, 0);
        Student jan = new Student("Jan", "Pytlarczyk", 'S', 0, 3);
        Student marek = new Student("Marek", "Woda", 'S', 0, 2);
       /* Library biblioteka = new Library();
       biblioteka.addUserToLibrary(grzegorz, tomek, kasia);

        biblioteka.printUsers(grzegorz, marek, kasia);*/
    }
}
