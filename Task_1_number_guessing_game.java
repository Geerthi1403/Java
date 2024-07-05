import java.util.Scanner;
import java.util.Random;

public class NumberGuess
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Random ran = nea Random();
        int a = ran.nextInt(100)+1;
        int b = 0;
        int guess;
        boolean win = false;

        System.out.println("Guess a number between 1 and 100:");
    
    while(!win)
        {
            guess = scan.nextInt();
            b++;

            if(guess<1 || guess>100)
            {
                System.out.println("Invalid guess.");
            }
            else if(guess<a)
            {
                System.out.println("Too low!");
            }
            else if(guess>a)
            {
                System.out.println("Too high!");
            }
            else
            {
                win = true;        
                System.out.println("Correct! You win");
                System.out.println("It took you " + b + " guesses.");
            }
        }
    }
}