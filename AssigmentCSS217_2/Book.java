// Book.java
public class Book extends Item {
    public Book(String title, String author) {
        super(title, author);
    }

    @Override
    public String getType() {
        return "Book";
    }
}
