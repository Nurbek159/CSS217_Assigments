import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Item.java
public abstract class Item {
    private String title;
    private String author;

    public Item(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public abstract String getType();
}

// LibraryCLI.java


