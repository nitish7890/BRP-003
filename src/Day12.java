public class Day13 {

        public static int removeduplicates(int a[], int n)
        {
            if (n == 0 || n == 1) {
                return n;
            }

            // creating another array for only storing
            // the unique elements
            int[] temp = new int[n];
            int j = 0;

            for (int i = 0; i < n - 1; i++) {
                if (a[i] != a[i + 1]) {
                    temp[j++] = a[i];
                }
            }

            temp[j++] = a[n - 1];

            // Changing the original array
            for (int i = 0; i < j; i++) {
                a[i] = temp[i];
            }

            return j;
        }
        public static void main(String[] args)
        {
            int a[] = { 1, 1, 2, 2, 2 };
            int n = a.length;

            n = removeduplicates(a, n);

            // Printing The array elements
            for (int i = 0; i < n; i++)
                System.out.print(a[i] + " ");
        }
    }

public class DuplicateElement {  
    public static void main(String[] args) {      
          
        //Initialize array   
        int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};   
          
        System.out.println("Duplicate elements in given array: ");  
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
    }  
}  
