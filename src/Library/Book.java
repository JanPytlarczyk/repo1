package Library;

public class Book extends Items {

    String author;
    String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }


        Book book0 = new Book("J. Kamiński", "Przygody w Amazonii");
        Book book1 = new Book("J.J. Martin", "Gra o tron");
        Book book2 = new Book("W. Cejrowski", "Rio anaconda");
        Book book3 = new Book("J.K. Rowling", "Harry Potter");




}
