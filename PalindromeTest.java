// Shuohe Ren
// sh1999@bu.edu
package hw1;
import java.util.Scanner;
public class PalindromeTest {
	public static boolean isPalindrome(String s) {
		   boolean isPal = false;  
		   s=s.toLowerCase();
		   // make sure that all letters in s are small letters.
		   String newS =s.replaceAll("[^A-Za-z0-9_]", "");
		   // remove the other elements, leaving only digits and numbers
		   String reverse="";
		   // create a new String, and compared to s, all the elements in this string are reversed.
		   for (int i = 0; i<newS.length(); i++){
			   String m=newS.substring(newS.length()-1-i,newS.length()-i);
			   reverse=reverse+m;			   
		   }
		   if (reverse.equals(newS)){
			   isPal=true;
		   }
		   return(isPal);
		   //check if this line is Palindrome
		}
	  public static void main(String[] args) {
	    System.out.println("\nWelcome to the Palindrome Test Program!");
	    Scanner userInput = new Scanner(System.in);
	    System.out.println("\nType in a sentence to be tested or Control-d to end:");
	    // read in the variable in. 
	    while (userInput.hasNextLine()) {
	      String line = userInput.nextLine();
	      if (line.equals("quit")) {
	          break;
	      }
	      else {
	    	  if (isPalindrome(line)){
	    		  String result="Palindrome!";
	    		  System.out.println(result);
	    		// If it is a Palinedrome, print "Palindrome!"
	    	  }
	    	  if (isPalindrome(line)!=true) {
	    		  String result="Not a palindrome";
	    		  System.out.println(result);
	    	  // If it is not a palindrome, print "Not a palindrome"
	        }
	        }
	    }
	    System.out.println("bye!");
	    userInput.close();
	    // when finishing the function, print "bye".
	  }

	}