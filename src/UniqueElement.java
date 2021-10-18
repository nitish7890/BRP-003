import java.util.Scanner;
public class UniqueElement {
    public static void main(String args[]){
        int n;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the array elements ");
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=in.nextInt();
        }
        print(arr,n=5);
    }
    public static void print(int arr[],int n){
        for(int i=0;i<n;i++){
            for(int j=1;j<i;j++){
                if(arr[i]==arr[j]){
                    break;

                }
                if(i==j){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
