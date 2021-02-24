package publicLibrary;

public class User {
    private static int lastCardNumber = 0;
    private int usersCardNumber;

    public User() {
        usersCardNumber = lastCardNumber++;
    }
}
