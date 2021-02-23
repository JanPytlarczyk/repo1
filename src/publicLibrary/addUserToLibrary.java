package publicLibrary;

public class addUserToLibrary {

    public static void main(String[] args) {


        class user {
            String imie;
            String nazwisko;
            int numerKarty;
            int iloscKsiazek;
            char status;

            public user (String i, String n, int nk, int ik, char s) {
                imie = i;
                nazwisko = n;
                numerKarty = nk++;
                iloscKsiazek = ik;
                status = s;


                user nowy1 = new user ("Wlodek", "Zięba", 1, 2, 'L');
                user nowy2 = new user ("Jan", "Kowalski", 2, 4, 'S');
                user nowy3 = new user("Kasia", "Kornik", 1, 0, 'S');




            }
        }
    }
}
