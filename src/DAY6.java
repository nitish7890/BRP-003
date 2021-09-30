public class Demo {
    public static void main(String[] args) {
        int[] a = new int[]{1,22,333,4444,55555,666666};
        System.out.println(display(a));
    }
    private static int display(int[] a) {
        int count = 0;
        for(int i = 0; i < a.length; i++) {
            int len = String.valueOf(a[i]).length();
            if(len%2 == 0)
                count++;
        }
        return count;
    }
}
