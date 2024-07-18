class Author {

    private String name;

    private String email;

    private char gender;



    // Constructor to initialize the name, email, and gender

    public Author(String name, String email, char gender) {

        this.name = name;

        this.email = email;

        this.gender = gender;

    }



    // Getter methods

    public String getName() {

        return name;

    }



    public String getEmail() {

        return email;

    }



    public char getGender() {

        return gender;

    }



    // Setter method for email

    public void setEmail(String email) {

        this.email = email;

    }



    // toString method

    @Override

    public String toString() {

        return "Author[name=" + name + ",email=" + email + ",gender=" + gender + "]";

    }

}





class Book {

    private String name;

    private Author author; // An instance of Author

    private double price;

    private int qty;



    // Constructor with three parameters

    public Book(String name, Author author, double price) {

        this.name = name;

        this.author = author;

        this.price = price;

        this.qty = 0; // Default quantity

    }



    // Constructor with four parameters

    public Book(String name, Author author, double price, int qty) {

        this.name = name;

        this.author = author;

        this.price = price;

        this.qty = qty;

    }



    // Getter methods

    public String getName() {

        return name;

    }



    public Author getAuthor() {

        return author;

    }



    public double getPrice() {

        return price;

    }



    public int getQty() {

        return qty;

    }



    // Setter methods

    public void setPrice(double price) {

        this.price = price;

    }



    public void setQty(int qty) {

        this.qty = qty;

    }



    // toString method

    @Override

    public String toString() {

        return "Book[name=" + name + "," + author.toString() + ",price=" + price + ",qty=" + qty + "]";

    }

}



public class AuthorClass {


	public static void main(String[] args) {

	

		        Author author = new Author("JemsGohsling", "gems@somewhere.com", 'm');



		        Book book1 = new Book("Java for Beginners", author, 29.95);

		        Book book2 = new Book("Advanced Java", author, 39.95, 10);



		        System.out.println(book1.toString());

		        System.out.println(book2.toString());



		        book1.setPrice(25.95);

		        book1.setQty(5);


		        System.out.println(book1.toString());

		    }

		}