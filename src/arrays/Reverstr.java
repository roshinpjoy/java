package arrays;// Java program to Reverse a String  by
// converting string to characters  one
// by one


// Class of arrays.ReverseString
class ReverseString
{
    public static void main(String[] args)
    {
        String input = "eretrtttreeethhhhhqw";

        // convert String to character array
        // by using toCharArray
        char[] arra = input.toCharArray();
        System.out.println(arra.length);

        for (int i = arra.length-1; i>=0; i--)
            System.out.print(arra[i]);
    }
}