import java.util.Scanner;

public class DAY1 {
    static int a;
    static int b;
    public static void get(){
        System.out.println("Enter the value of a and b");
        Scanner in=new Scanner(System.in);
        a=in.nextInt();
        b=in.nextInt();
    }
    public static void put(){
        System.out.println("Add two Number" +(a+b));
    }
    public static void main(String args[]){
        DAY1 ob = new DAY1();
       DAY1.get();
       ob.put();
    }

}