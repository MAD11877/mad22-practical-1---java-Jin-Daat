import java.util.Scanner;
import java.util.*;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    //Create an empty list to store the numbers
    List<Integer> numList = new ArrayList<Integer>();
    //Maximum count
    int maxCount = 0;
    //Modal number
    int mode = 0;
    
    //Get user input for the number of prompts
    System.out.print("Number of prompts: ");
    int promptNum = in.nextInt();
    
    //Start the loop to key in number depending on number of prompt
    for (int i = 0; i < promptNum; i ++){
        //Ask user for a number
        System.out.print("\nEnter a number: ");
        int num = in.nextInt();
        //Add the number to the list
        numList.add(num);
    }
    
    //Start to check and fine modal number
    //Use an outer loop to choose the number to iterate through
    for (int i = 0; i < numList.size(); i ++){
        //Set constant count
        //Reset Count
        int count = 0;
        //Inner loop to run through all varaibles in the list 
        for (int j = 0; j < numList.size(); j++){
            //Condition if values are equal
            if (numList.get(i) == numList.get(j)){
                count ++;
            }
        }
        //Condition to check maxCount and modal number. Reassign if neccessary.
        if (count > maxCount){
            maxCount = count;
            mode = numList.get(i);
        }
    }
    //Print the final result 
    System.out.println("Modal number is : " + mode);
    
  }
}
