QUESTION:-1
public class Demo {
    public static void main(String[] args) {
        int[] a = new int[]{1,22,333,4444,55555,666666};
        System.out.println(display(a));
    }
    private static int display(int[] a) {
        int count = 0;
        for(int i = 0; i < a.length; i++) {
            int len = String.valueOf(a[i]).length();
            if(len%2 == 0)
                count++;
        }
        return count;
    }
}
QUESTION:-2
  
   public static void main(String[] args) {  
       Scanner s = new Scanner(System.in);  
       System.out.print("Enter a number : ");  
       int n = s.nextInt();  
       if (isPrime(n)) {  
           System.out.println(n + " is a prime number");  
       } else {  
           System.out.println(n + " is not a prime number");  
       }  
   }  
  
   public static boolean isPrime(int n) {  
       if (n <= 1) {  
           return false;  
       }  
       for (int i = 2; i < Math.sqrt(n); i++) {  
           if (n % i == 0) {  
               return false;  
           }  
       }  
       return true;  
   }  
}  
Output:

Use image PrimeExample1
Find prime numbers between two numbers
You can also find prime numbers between two specified numbers.

import java.util.Scanner;  
public class PrimeExample4 {  
   public static void main(String[] args) {  
       Scanner s = new Scanner(System.in);  
       System.out.print("Enter the first number : ");  
       int start = s.nextInt();  
       System.out.print("Enter the second number : ");  
       int end = s.nextInt();  
       System.out.println("List of prime numbers between " + start + " and " + end);  
       for (int i = start; i <= end; i++) {  
           if (isPrime(i)) {  
               System.out.println(i);  
           }  
       }  
   }  
   public static boolean isPrime(int n) {  
       if (n <= 1) {  
           return false;  
       }  
       for (int i = 2; i <= Math.sqrt(n); i++) {  
           if (n % i == 0) {  
               return false;  
           }  
       }  
       return true;  
   }  
}  
QUESTION:-4
public class RollTheDice {
   
    /*  This program simulates rolling a pair of dice.
        The number that comes up on each die is output,
        followed by the total of the two dice.
    */
 
    public static void main(String[] args) {
    
        int die1;   // The number on the first die.
        int die2;   // The number on the second die.
        int roll;   // The total roll (sum of the two dice).
        
        die1 = (int)(Math.random()*6) + 1;
        die2 = (int)(Math.random()*6) + 1;
        roll = die1 + die2;
        
        System.out.println("The first die comes up " + die1);
        System.out.println("The second die comes up " + die2);
        System.out.println("Your total roll is " + roll);

    }  // end main()
 
} 
