import java.util.ArrayList;
import java.util.List;

// LibraryCatalog.java
public class LibraryCatalog {
    private List<Item> catalog;

    public LibraryCatalog() {
        catalog = new ArrayList<>();
    }

    public void addItem(Item item) {
        catalog.add(item);
    }

    public void removeItem(Item item) {
        catalog.remove(item);
    }

    public List<Item> getCatalog() {
        return catalog;
    }
}
