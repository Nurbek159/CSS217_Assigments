// Magazine.java
public class Magazine extends Item {
    public Magazine(String title, String author) {
        super(title, author);
    }

    @Override
    public String getType() {
        return "Magazine";
    }
}
