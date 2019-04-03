import java.util.Scanner;
import java.util.Random;
//Made by Cyrus @technophyte.com. Feel free to contact me at cyrusschwarz@gmail.com.
//Simple program to create a password of a specify link. 

/*
 * This is a simple program whose purpose is to generate a random string of a specified length.
 * A password manager like dashlane or lastpass is recommended. If you can somehow remember a random string of 128 characters, feel free to contact me.
 * TODO
 * Add write to file functions
 * Handle exceptions
*/

class Main {
  public static void main(String[] args) 
  {

    Scanner scan = new Scanner(System.in);
    
    //initialize variables
    boolean confirm;
    int length, i;
    String letset = "1234567890qwertyuiopasdfghjklzxcvbnm,./;'[]!@#$%^&*()_+{}:<>?|'";
    
    confirm = false;

    while(confirm == false)
    {

      System.out.println("How long would you like the string to be? \n(2 to 10000 characters)");
      
      //asks user for string length. Gives error if less/more than the specified range

      
      length = scan.nextInt();


      if (length > 10000 || length < 2)
      {
        System.out.println("Invalid Input - Try Again!");
        
      }
      else
      
      {

        StringBuilder sb = new StringBuilder();
        Random ran = new Random(); 
        for (i= 0; i < length; i++) 
        {
          int random = ran.nextInt(43);
          //Random number between 1 and 43. Selects the character to append.
          sb.append(letset.charAt(random));
          //This appends the random character that was selected at the end of the string
          }
        //This converts the stringbuilder string to a string, and outputs the result.
        String result = sb.toString();
        System.out.println(result);




        

      }  




    }
    




  }
}
