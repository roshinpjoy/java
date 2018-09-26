package superr;

public class Superx {
    int bookId=101;
    String author="James";
    String bookName="Java";

    Superx(){
        System.out.println("Default Constructor...");
    }

    Superx(int bookId,String bookName,String author){
        this.bookId=bookId;
        this.bookName=bookName;
        this.author=author;
    }

    public void display(){
        System.out.println("Book Id:"+bookId);
        System.out.println("Book Author:"+author);
        System.out.println("Book Name:"+bookName);
    }

    public void message(){
        System.out.println("Message in Parent Class..");
    }

}

 class BaseEx2 extends Superx {
    int bookId = 201;
    String bookName = "Advance Java";
    String author = "Gosling";

    BaseEx2() {
        //this();
        super(301, "Hadoop", "Doug");

    }

    public void display() {

        super.display();
        System.out.println("Author of Super Class:" + super.author);

        System.out.println("Book Id:" + bookId);
        System.out.println("Book Name:" + bookName);
        System.out.println("Book Author:" + author);
    }

}
