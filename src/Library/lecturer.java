package Library;

public class lecturer extends publicUser {
    String name;
    String lastName;


    public lecturer (String name, String lastName){
        this.name = name;
        this.lastName = lastName;

    }

    lecturer lecturer0 = new lecturer("Jacek", "Wojciechowksi");
    lecturer lecturer1 = new lecturer("Anna", "Miła");

}
