import java.util.Random;
import java.util.Scanner;

public class Game
{
    private static final Random r = new Random();
    private static final int NUMBER = r.nextInt(100) + 1;
    private static int guess = 0;

    public static void main(String[] args)
    {
        String Name;
        Scanner sc = new Scanner(System.in);
        Scanner name = new Scanner(System.in);


        System.out.println("Plese Enter Your Name:- ");
        Name = name.nextLine();
        System.out.println("Hello " + Name + " Welcome");

        System.out.println("Answer is " + String.valueOf(NUMBER)); //For Answer

        while (guess != NUMBER)
        {
            System.out.println("Guess a Number between 1 and 100");
            guess = sc.nextInt();
            if (guess > NUMBER)
            {
                System.out.println("Less Then");
            }
            else if (guess < NUMBER)
            {
                System.out.println("More Then");
            }
            else
            {
                System.out.println("That's Right");
                System.out.println("CONGRATULATIONS FOR CORRECT GUESSES " + Name);
                System.exit(0);
            }

        }
    }
}



// STUDENT DETAILS

// PRAHLAD BISWAS
// SILIGURI INSTITUTE OF TECHNOLOGY