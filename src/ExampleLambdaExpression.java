import java.util.*;
@FunctionalInterface
    interface Drawable {
    public void draw();
    public static void get(){
        System.out.println("This is the static method");
    }
    public default void put(int a){
        System.out.println("This is the default method" +a);
    }
}
public class ExampleLambdaExpression {
    public static void main(String args[]){
        int width=10;
        Drawable d2=()->{
            System.out.println("Drawing=" +width);

        };
        d2.draw();
        d2.put(5);

    }
}
