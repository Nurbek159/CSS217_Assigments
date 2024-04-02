// CD.java
public class CD extends Item {
    public CD(String title, String author) {
        super(title, author);
    }

    @Override
    public String getType() {
        return "CD";
    }
}
