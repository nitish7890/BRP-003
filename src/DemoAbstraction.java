interface Area{
    void compute();
    public static void compute1(){
        System.out.println("Static method is called");

    }
    default void compute3(){
        System.out.println("Default method is called");
        compute4();
    }
    private void compute4(){
        System.out.println("Private method is called");
    }

}
class Rectangle1 implements Area{
    public void compute(){
        System.out.println("Rectangle method is called");
    }

}
class Circle implements Area{
    public void compute(){
        System.out.println("Circle method is called");
    }
}
public class DemoAbstraction {
    public static void main(String args[]){
        Area ob=new Circle();

        ob.compute();
        Area ob1=new Rectangle1();
        ob1.compute();
        Area.compute1();
        ob.compute3();
    }
}
