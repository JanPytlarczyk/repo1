package qa.agh.edu;

public class Magazine extends Item {

    private String number;

    public Magazine(String number, String title) {
        super(number,title);
        this.number=number;
    }

    public String getField() {
        return number;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "number='" + number + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}