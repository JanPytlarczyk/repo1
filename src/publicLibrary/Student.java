package publicLibrary;

public class Student extends User {
    public Student(String name, String lastName, char  status, int lastCardNumber, int liczbaKsiazek){
    this.name =name;
    this.lastName = lastName;
    this.status = status;
    this.lastCardNumber = lastCardNumber;
    this.liczbaKsiazek = liczbaKsiazek;
    }
    public String name() {
        return name;
    }
    public String lastName() {
        return lastName;
    }
    public char status() {
        return status;
    }
    public int lastCardNumber() {
        return lastCardNumber;
    }
    public int liczbaKsiazek() {
        return liczbaKsiazek;
    }
}
