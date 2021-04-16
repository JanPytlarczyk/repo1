package qa.agh.edu;

import java.util.ArrayList;
import java.util.Scanner;


public class Library {
    public Library() {
        

        Student student0 = new Student("Jan", "Mickiewicz");//to sa obiekty (muszą być w User)
        Student student1 = new Student("Michał", "Pytla");
        Student student2 = new Student("Ania", "Kobyłka");
        Student student3 = new Student("Ola", "Piwko");
        Lecturer lecturer0 = new Lecturer("Jacek", "Wojciechowksi");
        Lecturer lecturer1 = new Lecturer("Anna", "Miła");

        ArrayList<String> allUsers = new ArrayList<String>();//wypisuje wszystkich
        allUsers.add(student0.name + " " + student0.lastName + " " + Status.status(false));
        allUsers.add(student1.name + " " + student1.lastName + " " + Status.status(false));
        allUsers.add(student2.name + " " + student2.lastName + " " + Status.status(false));
        allUsers.add(student3.name + " " + student3.lastName + " " + Status.status(false));
        allUsers.add(lecturer0.name + " " + lecturer0.lastName + " " + Status.status(true));
        allUsers.add(lecturer1.name + " " + lecturer1.lastName + " " + Status.status(true));


        ArrayList<Integer> cardNumber = new ArrayList<Integer>();

        for (int i = 0; i < allUsers.size(); i++) {
            cardNumber.add(i);

        }


        for (int j = 0; j < allUsers.size(); j++) { //to jest argument, trzeba dodać go do funkcji
            //System.out.println(cardNumber.get(j) + " " + allUsers.get(j));
        }

        public void printAllUsers() {


            System.out.println(cardNumber.get(j) + " " + allUsers.get(j));
        }
    }


}





