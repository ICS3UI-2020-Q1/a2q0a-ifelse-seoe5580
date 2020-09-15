import java.util.Scanner;

/**
 * Lets the user know if they can drive or not
 * @author Eric Seo
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create a scanner for user input
    Scanner input = new Scanner(System.in);

    // define the minimum age
    final int MIN_DRIVER_AGE = 16;

    //define the minimum voting age
    final int VOTING_AGE = 18;

    // prompt the user for their age
    System.out.println("Please enter your age");

    // get the age from the user
    int age = input.nextInt();

    // check to see if they can vote or drive
    if (age >= VOTING_AGE){
      System.out.println("You can vote");
      System.out.println("You can legally drive");
    } else if(age >= MIN_DRIVER_AGE){
      // tell them they can drive
      System.out.println("You can legally get your license");
    } else {
      // not old enough to drive
      System.out.println("Sorry, you cant drive yet!");
    }


    // boolean logical operators
    // between 18 and 30
    if (age >= 18 && age <= 30){
      // age is bigger than 18 or equal to 18 AND
      // age is less than or equal to 18
      System.out.println("Time to go to college");
    }

    if (age < 18 || age > 60){
      
    }
    
  }
}
