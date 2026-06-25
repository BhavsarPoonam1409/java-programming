class Book {
    
    private String title;
    private String author;
    private double price;

    
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    
    public void setPrice(double p) {
        this.price = p;
    }

    public double getPrice() {
        return this.price;
    }

    
    public void displayBook() {
        System.out.println("This is a Title: " + title);
        System.out.println("This is a Author: " + author);
        System.out.println("This is a Price: " + price);
        
    }
}

public class Qus_3 {
    public static void main(String[] args){
    


        Book book1 = new Book("poor dad rich dad", "abc", 500.0);
        Book book2 = new Book("habits for succcess", "xyz", 600.0);

        
        book1.setPrice(550.0);
        System.out.println("This is a book 1 details..!!");
        book1.displayBook();
        System.out.println();
        System.out.println("This is a book 2 details..!!");
        book2.displayBook();


        
       
        
    }
}


