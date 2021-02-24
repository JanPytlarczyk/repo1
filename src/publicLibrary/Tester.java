package publicLibrary;

public class Tester {
    public static void main(String[] args) {
        Lecturer grzegorz = new Lecturer("Grzegorz", "Szczutkowski");
        Lecturer tomek = new Lecturer("Tomek", "Sojer");
        Library biblioteka = new Library();
       // biblioteka.addUserToLibrary(grzegorz, tomek);

        biblioteka.printUsers();
    }
}
