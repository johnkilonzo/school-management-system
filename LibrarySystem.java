import java.util.*;
public class LibrarySystem {
    Stack<String> borrowedBooks = new Stack<>();
    HashMap<String, String> books = new HashMap<>();
    void addBook(String isbn, String title) { books.put(isbn, title); }
    void borrowBook(String isbn) { if (books.containsKey(isbn)) borrowedBooks.push(books.get(isbn)); }
    void returnBook() { if (!borrowedBooks.isEmpty()) System.out.println(borrowedBooks.pop() + " returned"); }
    void viewBooks() { for (String b : books.values()) System.out.println(b); }
}