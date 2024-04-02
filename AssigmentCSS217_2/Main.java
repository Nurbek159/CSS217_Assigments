// Main.java
public class Main {
    public static void main(String[] args) {
        LibraryCatalog catalog = new LibraryCatalog();
        LibraryCLI cli = new LibraryCLI(catalog);
        cli.start();
    }
}
