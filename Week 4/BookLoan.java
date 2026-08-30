public class BookLoan {
  public void BookLoan_main() {
    Book b1 = new Book("python ", "Scott", "001");
    System.out.println(b1);

    System.out.println("\nBorrowing b1: " + b1.borrowBook());
    System.out.println("Borrowing b1 again: " + b1.borrowBook());

    System.out.println("\nReturning b1: " + b1.returnBook());
    System.out.println("Returning b1 again : " + b1.returnBook());

    System.out.println("\nStatus of b1 available? " + b1.isAvailable());
  }

  public class Book {
    private String title;
    private String author;
    private String bookCode;
    private boolean loaned;

    Book(String title, String author, String bookCode) {
      if (title == null) {
        System.err.println("Title cannot be blank");
        this.title = "Default Title";
      } else {
        this.title = title;
      }

      if (author == null) {
        System.err.println("Author cannot be blank");
        this.author = "No Author";
      } else {
        this.author = author;
      }

      if (bookCode == null)

      {
        System.err.println("Book code cannot be blank");
        this.bookCode = "Default book code";
      } else {
        this.bookCode = bookCode;
      }
      this.loaned = false;
    }

    public boolean borrowBook() {
      if (loaned) {
        return false;
      }
      loaned = true;
      return true;
    }

    public boolean returnBook() {
      if (!loaned) {
        return false;
      }
      loaned = false;
      return true;
    }

    public boolean isAvailable() {
      return !loaned;
    }

    public String getTitle() {
      return title;
    }

    public String getAuthor() {
      return author;
    }

    public String getBookCode() {
      return bookCode;
    }

    public String toString() {
      return ("Book: Code=" + bookCode + ", Title=" + title + ", Author=" + author + ", Available=" + isAvailable());
    }
  }
}
