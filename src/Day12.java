import java.util.Scanner;
interface DemoInterface{

     abstract void get(int a,int b);
     abstract void put(int a,int b);

 }
 public class Day12 implements DemoInterface {

     public void get(int a, int b)
     {
         System.out.println("Add two number=>" +(a+b));
     }
     public void put(int a,int b)
     {
         System.out.println("Substraction of two number is=>" +(a - b));
     }
     // Driver Code
     public static void main (String[] args)
     {   Scanner in=new Scanner(System.in);
         System.out.println("ENTER THE VALUE OF A AND B");
         int a=in.nextInt();
         int b=in.nextInt();
         Day12 t = new Day12();
         t.get(a,b);
         t.put(a,b);


     }
 }

