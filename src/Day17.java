import java.util.Arrays;
import java.util.Scanner;
public class Day17 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = in.nextInt();
        int arr[] = new int[n];
        String arr2[]=new String[n];
        System.out.println(arr2[2]);
        System.out.println("Enter the element in array list");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        if (checkAP(arr, n))
            System.out.println("True");
        else
            System.out.println("False");
    }
    public static boolean checkAP(int arr[], int n) {
        if (n == 1)
            return true;
        // Sort array
        Arrays.sort(arr);
        System.out.println("Array elements is sorted");
        System.out.println( Arrays.toString(arr));
        int d = arr[1] - arr[0];
        for (int i = 2; i < n; i++)
            if (arr[i] - arr[i - 1] != d) {
                return false;
            }
        return true;
    }

}

