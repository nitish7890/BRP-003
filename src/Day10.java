import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class Day10 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value in 0 to 1");
        int[] Arr = new int[4];
        for(int i=0;i<4;i++) {
            Arr[i] = in.nextInt();
        }
        System.out.println("Enter the value of k");
        int k=in.nextInt();
        in.close();
        display(Arr,k);
    }
    public static void display(int Arr[], int k) {
        List<Integer> ans = new LinkedList<>();
        for (int i = Arr.length - 1; i >= 0 || k > 0; i--) {
            int sum = k;
            if (i >= 0) {
                sum += Arr[i];
            }
            ans.add(0, sum % 10);
            k = sum / 10;
        }
        System.out.println(ans);
    }
}




