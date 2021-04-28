// Shuohe Ren
// sh1999@bu.edu
// U11807977
package hw1;
import java.util.Scanner;
public class Statistics { 
    public static void main(String[] args) {
    	Scanner in=new Scanner(System.in); 
        int numOne=in.nextInt();  
        int numTwo=in.nextInt();  
        int numThree=in.nextInt();  
        //read three numbers
       display_statistics(numOne,numTwo,numThree);
       in.close();
    }
    public static void display_statistics( int num1, int num2, int num3 ) {
        int sum = num1+num2+num3;
        System.out.println(sum);
        // Print sum
        int max12= Math.max(num1,num2);
        int max=Math.max(max12, num3);
        System.out.println(max);
        // Print max
        int min12= Math.min(num1,num2);
        int min=Math.min(min12, num3);
        System.out.println(min);
        int range = max-min;
        System.out.println(range);
        //Print range
        double mean=(num1+num2+num3)/3.0;
        String mean2 = String.format("%.4f", mean);
        System.out.println(mean2);
        //Print mean
        double SD = Math.sqrt(((mean-num1)*(mean-num1)+(mean-num2)*(mean-num2)+(mean-num3)*(mean-num3))/3);
        String sd2 = String.format("%.4f", SD);
        System.out.println(sd2);
        //Print the standard deviation of the three numbers;
        System.out.print(min);
        System.out.print(sum-min-max);
        System.out.print(max);
        // Print the three numbers in sequence.
   }
}