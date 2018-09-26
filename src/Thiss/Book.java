package Thiss;

public class Book {
    int bookid;
    String bukname;
    String author;

    public Book(int bookid ,String bukname,String author)
    {
       this.bookid=bookid;
       bukname=bukname;
       author=author;

    }

    void display()
    {    this.message();
        System.out.println(bookid);
        System.out.println(bukname);
        System.out.println(author);
        //System.out.println(this);
    }

    void  message()
    {
        System.out.println("inside message");
    }

    public static void main(String[] args) {
        Book b=new Book(10,"aaa","bbb");
        b.display();
        System.out.println(b);
    }



}
