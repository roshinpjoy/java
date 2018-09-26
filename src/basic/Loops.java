package basic;

public class Loops {

    public static void main(String[] args) {
        int number = 5;

        while (number<10)  {
            System.out.println("Number is Greater Than 10");
            break;
        }
        System.out.println("This Statement is Coming from Outside of while loop");
    }
}