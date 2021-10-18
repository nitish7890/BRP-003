import java.util.Scanner;

interface DemoCalculator {
    abstract void add(int a,int b,int c);

    abstract void substract(int a,int b);

    abstract void multiply(int a,int b);
    abstract void divide(int a, int b);
}
    public class Day14 implements DemoCalculator {
        public void add(int a, int b, int c) {
            System.out.println("Add number of three variable=>" + (a + b + c));
        }

        public void substract(int a, int b) {
            System.out.println("Substraction of two number=>" + (a - b));
        }

        public void multiply(int a, int b) {
            System.out.println("Multiply of two number=>" + (a * b));
        }

        public void divide(int a, int b) {
            System.out.println("Divide of two number=>" + (a / b));
        }
        public void square(int a) {
            System.out.println("Square of a number=>" + (Math.pow(a,2)));
        }
        public void cube(int a){
            System.out.println("Cube of a number=>" +(Math.pow(a,3)));
        }
        public void sqrt(Double a){
            System.out.println("Squart of a number=>" +Math.sqrt(a));
        }




        public static void main(String[] args) {
            Day14 ob = new Day14();
            Scanner in = new Scanner(System.in);
            System.out.println("<-------------Calculator-------------->");
            System.out.println("\t\t\t\t\t\tPress 1.Addition");
            System.out.println("\t\t\t\t\t\tPress 2.Substraction");
            System.out.println("\t\t\t\t\t\tPress 3.Multiplication");
            System.out.println("\t\t\t\t\t\tPress 4.Divide");
            System.out.println("\t\t\t\t\t\tPress 5.Square");
            System.out.println("\t\t\t\t\t\tPress 6.squrt");
            System.out.println("\t\t\t\t\t\tPress 7.cube");
            int choice;
            System.out.println("choice any one number from 1 to 4");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Add three number");
                    int a = in.nextInt();
                    int b = in.nextInt();
                    int c = in.nextInt();
                    ob.add(a, b, c);
                    break;
                case 2:
                    System.out.println("Substraction of two number");
                    a = in.nextInt();
                    b = in.nextInt();
                    ob.substract(a, b);
                    break;
                case 3:
                    System.out.println("Multiplication of two number");
                    a = in.nextInt();
                    b = in.nextInt();
                    ob.multiply(a, b);
                    break;
                case 4:
                    System.out.println("Divide of two number");
                    a = in.nextInt();
                    b = in.nextInt();
                    ob.divide(a, b);
                    break;
                case 5:
                    System.out.println("Square of a number");
                    a = in.nextInt();
                    ob.square(a);
                    break;
                case 6:
                    System.out.println("sqrt of two number");
                    a = in.nextInt();
                    ob.cube(a);
                    break;
                case 7:
                    System.out.println("cube of a number");
                    a=in.nextInt();
                    ob.cube(a);
                default:
                    System.out.println("choice number is wrong");
            }


        }
    }

