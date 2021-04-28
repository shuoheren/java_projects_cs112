// Shuohe Ren
// U11807977
// sh1999@bu.edu
package hw1;
import java.util.Arrays;
import java.util.Scanner;
public class WordPalindromeTest {
	public static boolean isWordPalindrome(String s) {  
			boolean TF= true;
			// suppose this is initially true
		   s=s.toLowerCase();
		   // Change all the Capital letters into small letters 
		   String newS =s.replaceAll("[^A-Za-z0-9_ ]", "");
		   String Words[] = newS.split(" ");  
	        for(int i = 0; i <(Words.length)/2; i++){
	        	if (Words[i].equals(Words[Words.length-i-1])==false) {
				TF=false;
	        	}
	        }
	        System.out.println(Arrays.deepToString(Words));
		   return TF;
		   // return if this line is WordPalidrome
		}
	  public static void main(String[] args) {
	    System.out.println("\nWelcome to the Word Palindrome Test Program!");
	    Scanner userInput = new Scanner(System.in);
	    System.out.println("\nType in a sentence to be tested or quit to end:");
	    //read a sentence
	    while (userInput.hasNextLine()) {
	      String line = userInput.nextLine();
	          if (line.equals("quit")) {
	            break;
	            //if the sentece is "quit", just quit the function.
	            } 
	          else{
	    	     if (isWordPalindrome(line)){
	    		  String result="Palindrome!";
	    		  System.out.println(result);
	    		  // Print "Palindrome!" if it is Palindrome.
	    	    }
	    	     else {
	    		  String result="Not a palindrome";
	    		  System.out.println(result);
	    		// Print "Not a palindrome!"if it is not Palindrome.
	              }
	          }
	    }
	    System.out.println("bye!");
	    userInput.close();
	    //When finishing the program, println"bye".
	    }  
	}