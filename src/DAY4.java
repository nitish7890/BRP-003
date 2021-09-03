day-4
import java.util.Scanner;
class Harmonic
{
public static void main(String... a)
    {
        System.out.print("Enter any number : ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.print("The Harmonic Series is : ");
        double result = 0.0;
        while(num > 0)
          {
               result = result + (double) 1 / num;
               num--;
               System.out.print(result +"  ");
          }
        System.out.println("");
        System.out.println("Output of Harmonic Series is "+result);
    }
}
day-4
public class temperature  
 {  
   public static void main (String args[])  
    { float Fahrenheit, Celsius;  
          Celsius= 13;  
          Fahrenheit =((Celsius*9)/5)+32;  
          System.out.println("Temperature in Fahrenheit is: "+Fahrenheit);  
    }}
