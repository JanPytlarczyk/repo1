package qa.agh.edu;

public class Magazine extends Items {

    String number;
    String title;



    public Magazine(String number, String title) {
        this.number = number;
        this.title = title;
    }

    public String getNumber() {
        return number;
    }

    public String getTitle() {
        return title;
    }



}