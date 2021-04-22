package qa.agh.edu;

public class Book extends Item {

    protected String author;

    public Book(String author, String title) {
        super(author,title);
        this.author=author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
