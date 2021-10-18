interface Lambda2{
    default void get() {
        System.out.println("Default method is called");
        display();
    }
    public static void put(){
        System.out.println("Static method is called");
        display();
    }
    void set();
    private static void display(){
        System.out.println("Private method is called");
    }
}

public class DemoLambda1 {
    public static void main(String args[]){
        Lambda2 ob=() -> {
            System.out.println("set method is called");

        };
        ob.set();
        ob.get();
        Lambda2.put();
    }
}
