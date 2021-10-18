public class Day15 {
    public static void main(String args[]){
        int a[]=new int[]{1,5,3,8,3};
        int n=5;
        ArraySorted(a,n);

    }
    public static void ArraySorted(int a[],int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    System.out.println(a[i]);
                }
            }
        }

    }
    }

