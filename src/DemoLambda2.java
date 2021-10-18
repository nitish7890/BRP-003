import java.util.Scanner;

interface Lambda{
    void get();

}
 public class DemoLambda2 {
     public static void main(String args[]) {

         Scanner in=new Scanner(System.in);
         Lambda ob = ()->{
             int flag=0,n=8;

               for(int i=2;i<n;i++){
                   if(n%i==0){
                       flag=1;
                       break;
                   }
               }
               if(flag==0){
                   System.out.println("Number is prime");
               }
               else{
                   System.out.println("Number is composition");
               }


         };
         ob.get();
     }
 }