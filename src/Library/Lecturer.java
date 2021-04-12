package Library;

public class Lecturer extends User {
    String name;
    String lastName;



    public Lecturer(String name, String lastName){
        this.name = name;
        this.lastName = lastName;

    }

    public String getName() {

        return name;
    }

    public String getLastName() {

        return lastName;
    }




}
