import java.lang.*;
class FirstThread extends Thread
{
    public void run()
    {
        for(int i=0; i<4; i++)
        {
            try
            {
                if(i == 3)
                {
                    sleep(4000);
                }
            }
            catch(Exception x)
            { }
            System.out.println(i);
        }
        System.out.println(" First Thread Finished ");
    }
}
class SecondThread extends Thread
{
    public void run()
    {
        for(int i=0; i<4; i++)
        {
            System.out.println(i);
        }
        System.out.println(" Second Thread Finished ");
    }
}
class ThirdThread extends Thread
{
    public void run()
    {
        for(int i=0; i<4; i++)
        {
            System.out.println(i);
        }
        System.out.println(" Third Thread Finished ");
    }
}
class MultiThread
{
    public static void main(String arg[])
    {
        FirstThread a1 = new FirstThread();
        SecondThread b1 = new SecondThread();
        ThirdThread c1 = new ThirdThread();
        a1.start();
        b1.start();
        c1.start();
    }
}

<====Harmonic series pront======>

// Java Program to Generate Harmonic Series
 
class HarmonicSeries {
 
    // this is a main function
    public static void main(String args[])
    {
 
        // num is the number of values we want in a series
        int num = 5;
        double result = 0.0;
 
        System.out.println("The harmonic series is: ");
 
        // printing the harmonic series till num value
        // using while loop
        while (num > 0) {
 
            // calculating harmonic values
            result = result + (double)1 / num;
 
            // after calculating harmonic value
            // decrementing num by 1 which means the common
            // difference is 1
            num--;
            System.out.print(result + ", ");
        }
    }
}

<===Multiplication of matrix=======>
public class MatrixMultiplicationExample{  
public static void main(String args[]){  
//creating two matrices    
int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
int b[][]={{1,1,1},{2,2,2},{3,3,3}};    
    
//creating another matrix to store the multiplication of two matrices    
int c[][]=new int[3][3];  //3 rows and 3 columns  
    
//multiplying and printing multiplication of 2 matrices    
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
c[i][j]=0;      
for(int k=0;k<3;k++)      
{      
c[i][j]+=a[i][k]*b[k][j];      
}//end of k loop  
System.out.print(c[i][j]+" ");  //printing matrix element  
}//end of j loop  
System.out.println();//new line    
}    
}}  
