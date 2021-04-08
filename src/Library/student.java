package Library;

import java.util.ArrayList;

public class student extends publicUser {

   private String name;
    private String lastName;

     {
    }


     String getName() {
        return this.name;

    }

     String getLastName() {
        return this.lastName;
    }

    private student(String name, //to jest konstruktor
                   String lastName){
        this.name = name;
        this.lastName = lastName;

    }



    student student0 = new student("Jan", "Pytlarczyk");//to sa obiekty
    student student1 = new student("Michał", "Pytla");
    student student2 = new student("Ania", "Kobyłka");
    student student3 = new student("Ola", "Piwko");


}
