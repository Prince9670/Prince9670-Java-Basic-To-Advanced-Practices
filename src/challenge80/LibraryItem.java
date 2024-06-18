package challenge80;

public class LibraryItem {

    private String itemId;

    private String tittle;

    private String author;

    public void checkout() {
        System.out.println("checkout");
    }

    public void returnItem() {
        System.out.println("returning the item");
    }
}
