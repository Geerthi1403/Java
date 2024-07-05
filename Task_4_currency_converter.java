import java.util.Scanner;

public class NumberGuess
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter the amount in USD : ");
        double usd=scan.nextDouble();

        System.out.print("Enter the exchage rate (USD to target currency) : ");
        double exchange=scan.nextDouble();

        double converted=usd*exchage();
        System.out.print("Converted Amount : " + converted);
    }
}