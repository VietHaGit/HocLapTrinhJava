package OOP;
//relationship between author and book
public class Book {
    private String name;
    public Author[] authors;
    private  double price;

    public Book(String name , Author[] authors,double price){
        this.name = name;
        this.price = price;
        this.authors = authors;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public String getAuthorNames(){
            String authorNames = "";
            for (int i  = 0; i < authors.length- 1; i++){
                authorNames += authors[i].getName() + ",";
            }
       authorNames +=authors[authors.length -1].getName(); // lấy tên cuối trong mảng
            return authorNames;
    }
}

class entry201{
    public static void main(String[] args){
        Author[] authors = new Author[3];
        authors[0] = new Author("Ha","ha123");
        authors[1] = new Author("Thanh","thanh123");
        authors[2] = new Author("Viet","Viet23");
        Book book = new Book("C++ boook",authors,2100);
        System.out.println(book.getAuthorNames());
    }
}
