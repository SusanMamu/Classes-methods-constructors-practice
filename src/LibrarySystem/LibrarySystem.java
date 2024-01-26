package LibrarySystem;

import java.util.ArrayList;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book: " + title + " by " + author;
    }
}

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User: " + name + " (Age: " + age + ")";
    }
}

class Library {
    private ArrayList<Book> books;
    private ArrayList<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void displayBooks() {
        System.out.println("Library Books:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void displayUsers() {
        System.out.println("Library Users:");
        for (User user : users) {
            System.out.println(user);
        }
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        // Create books
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

        // Create users
        User user1 = new User("Alice", 25);
        User user2 = new User("Bob", 30);

        // Create a library
        Library library = new Library();

        // Add books and users to the library
        library.addBook(book1);
        library.addBook(book2);

        library.addUser(user1);
        library.addUser(user2);

        // Display library information
        library.displayBooks();
        System.out.println();
        library.displayUsers();
    }
}
