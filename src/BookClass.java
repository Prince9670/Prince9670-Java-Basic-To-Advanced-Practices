public class BookClass {
    static int totalNoOfBooks;
    String author;
    String title;
    String isbn;
    boolean isBorrowed;

    static {
        totalNoOfBooks = 0;
    }
    { // Object Init
        totalNoOfBooks++;
    }

    BookClass(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    BookClass(String isbn) {
        this(isbn, "Unknown", "Unknown");
    }

    static int getTotalNoOfBooks() {
        return totalNoOfBooks;
    }

    void borrowBook() {
        if (isBorrowed) {
            System.out.println("Book is already borrowed");
        } else {
            this.isBorrowed = true;
            System.out.println("Enjoy " + this.title);
        }
    }

    void returnBook() {
        if (isBorrowed) {
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed, Please leave a review");
        } else {
            System.out.println("This book is already in the library");
        }
    }

    public static void main(String[] args) {
        BookClass designOfThings = new BookClass("1", "Design", "Author");
        BookClass myBook = new BookClass("2");
        System.out.println(BookClass.getTotalNoOfBooks());
        designOfThings.borrowBook();
        myBook.borrowBook();
        designOfThings.borrowBook();
        designOfThings.returnBook();
        designOfThings.returnBook();
    }
}