package qa.agh.edu;

public class Item {

    protected String field;
    protected String title;

    public Item(String number, String title) {
        this.field = number;
        this.title = title;
    }

    public String getField() {
        return field;
    }

    public String getTitle() {
        return title;
    }
}
