package qa.agh.edu;

public class Student extends Library {

     String name; // deklaracja zmeinnej
     String lastName;


    public Student(String name, //to jest konstruktor (setter)
                   String lastName) {
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
