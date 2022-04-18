import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */    
    //Question 2
    //Create scanner Object
    Scanner sc = new Scanner(System.in);

    //Prompt user for height
    System.out.print("Enter your height in meters: ");
    //Get user height 
    double height = sc.nextDouble();
    //Prompt user for weight
    System.out.print("Enter your weight in kilograms: ");
    //Get user weight
    double weight = sc.nextDouble();

    //Calculate and print the bmi
    System.out.println("Your BMI is: " + (weight/(height*height)));

  }
}
