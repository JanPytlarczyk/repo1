package Library;

public class Student extends User {

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



    Student student0 = new Student("Jan", "Pytlarczyk");//to sa obiekty
    Student student1 = new Student("Michał", "Pytla");
    Student student2 = new Student("Ania", "Kobyłka");
    Student student3 = new Student("Ola", "Piwko");


}
