day-5
public class JavaFlip {
public static void main(String[] args) { 
if (Math.random() < 0.5){
System.out.println("Heads");
}else{
System.out.println("Tails");
}
}
}
day-5

// Java program to find the power of a number
// using Recursion
  
class GFG {
  
    // Function to calculate N raised to the power P
    static int power(int N, int P)
    {
        if (P == 0)
            return 1;
        else
            return N * power(N, P - 1);
    }
  
    // Driver code
    public static void main(String[] args)
    {
        int N = 2;
        int P = 3;
  
        System.out.println(power(N, P));
    }
}
