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
/* linear search */
public class LinearSearchExample{    
public static int linearSearch(int[] arr, int key){    
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){    
                return i;    
            }    
        }    
        return -1;    
    }    
    public static void main(String a[]){    
        int[] a1= {10,20,30,50,70,90};    
        int key = 50;    
        System.out.println(key+" is found at index: "+linearSearch(a1, key));    
    }    
}   


*/  binary search */
    class BinarySearchExample{  
 public static void binarySearch(int arr[], int first, int last, int key){  
   int mid = (first + last)/2;  
   while( first <= last ){  
      if ( arr[mid] < key ){  
        first = mid + 1;     
      }else if ( arr[mid] == key ){  
        System.out.println("Element is found at index: " + mid);  
        break;  
      }else{  
         last = mid - 1;  
      }  
      mid = (first + last)/2;  
   }  
   if ( first > last ){  
      System.out.println("Element is not found!");  
   }  
 }  
 public static void main(String args[]){  
        int arr[] = {10,20,30,40,50};  
        int key = 30;  
        int last=arr.length-1;  
        binarySearch(arr,0,last,key);     
 }  
}  
    

