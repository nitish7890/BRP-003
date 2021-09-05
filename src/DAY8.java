class FactorialExample2{  
 static int factorial(int n){    
  if (n == 0)    
    return 1;    
  else    
    return(n * factorial(n-1));    
 }    
 public static void main(String args[]){  
  int i,fact=1;  
  int number=4;//It is the number to calculate factorial    
  fact = factorial(number);   
  System.out.println("Factorial of "+number+" is: "+fact);    
 }  
}


public class Print1ToNNaturalNumber {
	static void PrintNaturalNumber(int n)
	{
	    if(n<=50)
	    {
	    	 System.out.print(" "+n+" ");
	    	 PrintNaturalNumber(n+1);
	    }
	}
	public static void main(String[] args) {
		 int n=1;
		 System.out.print("First 50 Natural Numbers are:");
		    PrintNaturalNumber(n);
		}
	}


import java.util.Scanner;
public class GcdOfGivenNumbers {
	static int gcd(int num1, int num2)
	{
		   if(num2==0)
		    return num1;
		return gcd(num2,num1%num2);
		}
		public static void main(String[] args) {
			Scanner cs=new Scanner(System.in);
			int num1, num2;
		    System.out.print("Enter the two Number:");
		    num1=cs.nextInt();
		    num2=cs.nextInt();
System.out.print("Gcd of Given Numbers Using Recursion is: "+gcd(num1,num2));
	        cs.close();
		}
	}



/LCM*/
  import java.util.Scanner;
public class LcmOfGivenNumbers {
	static int gcd(int num1, int num2)
	{
		   if(num2==0)
		    return num1;
		return gcd(num2,num1%num2);
		}
	static int lcm(int num1, int num2)
	{
	return (num1*num2)/gcd(num1,num2);
	}
		public static void main(String[] args) {
			Scanner cs=new Scanner(System.in);
			int num1, num2;
		    System.out.print("Enter the two Number:");
		    num1=cs.nextInt();
		    num2=cs.nextInt();
System.out.print("Lcm of Given Numbers Using Recursion is: "+lcm(num1,num2));
	        cs.close();
		}
	}

/*SUM OF EVEN NUMBER */
import java.util.Scanner;
public class SumEvenElement {
	int sum=0;
	int SumOfEvenElement(int arr[], int n)
	{
	    int i;
	    if(n>0)
	    {
	        i=n-1;
	        if(arr[i]%2==0)
	        sum=sum+arr[i];
	        SumOfEvenElement(arr,i);
	    }
	return sum;
	}
		public static void main(String[] args) {
			Scanner cs=new Scanner(System.in);
			int n,i;
			System.out.println("Enter your Array Size:");
			n=cs.nextInt();
			int arr[]=new int[n];
			System.out.println("Enter the Array Element:");
			for(i=0;i<n;i++)
			{
				arr[i]=cs.nextInt();
			}
			SumEvenElement ob=new SumEvenElement();
			System.out.print("Sum of even Element is:"+ob.SumOfEvenElement(arr,n));
			cs.close();
		}
	}
