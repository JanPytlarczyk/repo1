package publicLibrary;

public class User {
    protected static int lastCardNumber = 0;
    protected String name;
    protected String lastName;
    protected char status;
    protected int liczbaKsiazek;
    private int usersCardNumber;
    public User() {
        usersCardNumber = lastCardNumber++;
    }
}
