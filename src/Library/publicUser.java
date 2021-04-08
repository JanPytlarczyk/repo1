package Library;

import java.util.ArrayList;
import java.util.LinkedList;

public class publicUser {

    public static void main(String[] args){


        LinkedList<student> student = new LinkedList<student>();
        student.getFirst();




        ArrayList<Integer> cardNumber = new ArrayList<Integer>();

        for (int i = 0; i < student.size(); i++){
            cardNumber.add(i);

        }
        System.out.println(student.getFirst());

    }


}
