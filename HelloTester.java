import java.util.Scanner;

public class HelloTester
{
    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

System.out.println("please enter your name: ");
String name = input.nextLine();

Hello hi = new Hello(name);
// step three
hi.english();
hi.spanish();
hi.french();
    }
}