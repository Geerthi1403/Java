import java.util.Scanner;

public class studentgrade
{
    public static void main(String[] args)
    {
       Scanner scan = new Scanner(System.in);
       int sub=5;
       int[] marks = new int[sub];
       int total=0;
       
       for(int i=0;i<sub;i++)
       {        
        System.out.print("Enter marks for subject "+ (i+1)+ " :");
        marks[i]=scan.nextInt();
        total += marks[i];
       }

    double average = (double) total/sub;
    String grade;

        if(average>=75)
        {
            grade="A";
        }
        else if(average>=65)
        {
            grade="B";
        }
        else if(average>=55)
        {
            grade="C";
        }
        else
        {
            grade="F";
        }

        System.out.println("Total Marks : "+total);
        System.out.println("Average Percentage : "+average);
        System.out.println("Grade : "+ grade);
    }
}