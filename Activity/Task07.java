public class Task07 {
    public static void main(String[] args) {
        
        PrintedBook printedBook = new PrintedBook("The Great Gatsby", "F. Scott Fitzgerald");
        EBook eBook = new EBook("Digital Fortress", "Dan Brown");
        AudioBook audioBook = new AudioBook("Harry Potter", "J.K. Rowling");
        
        
        System.out.println("===== Library Books =====");
        printedBook.displayDetails();
        System.out.println();
        eBook.displayDetails();
        System.out.println();
        audioBook.displayDetails();
        
        
        System.out.println("\n===== Checking Out Books =====");
        printedBook.checkOut();
        
        
        System.out.println("\n===== Updated Book Status =====");
        printedBook.displayDetails();
    }
}


class Book {
    
    private String title;
    private String author;
    private boolean available;
    
    
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }
    
    
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public boolean isAvailable() {
        return available;
    }
    
    
    public void checkOut() {
        if (available) {
            available = false;
            System.out.println(title + " has been checked out.");
        } else {
            System.out.println(title + " is not available.");
        }
    }
    
    public void returnBook() {
        if (!available) {
            available = true;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " is already in the library.");
        }
    }
    
    
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + (available ? "Yes" : "No"));
    }
}


class PrintedBook extends Book {
    public PrintedBook(String title, String author) {
        super(title, author);
    }
    
    
    @Override
    public void displayDetails() {
        System.out.println("PRINTED BOOK:");
        super.displayDetails();
        System.out.println("Type: Physical copy");
    }
}


class EBook extends Book {
    public EBook(String title, String author) {
        super(title, author);
    }
    
    
    @Override
    public void displayDetails() {
        System.out.println("E-BOOK:");
        super.displayDetails();
        System.out.println("Type: Digital format");
    }
}


class AudioBook extends Book {
    public AudioBook(String title, String author) {
        super(title, author);
    }
    
    
    @Override
    public void displayDetails() {
        System.out.println("AUDIO BOOK:");
        super.displayDetails();
        System.out.println("Type: Audio recording");
    }
}