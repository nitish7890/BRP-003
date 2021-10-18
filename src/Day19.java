import java.util.Scanner;

public class Day19 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int N=in.nextInt();
        in.close();
        checkPalidrome(N);
    }
    public static void checkPalidrome(int N){
        int num,digit,rev=0;
        num=N;
        do{
            digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        } while(num>0);
        System.out.println("Reverse Number=" +rev);
        System.out.println("Original Number=" +N);
        if(N==rev){
            System.out.println("Number is palidrome");
        }
        else System.out.println("Number is not palidrome");

    }
}
