abstract class Demo2{
    abstract void display();
    public void display1(){
        System.out.println("public method is called");
        display5();
        display3();
    }
    Demo2(){
        System.out.println("Constructor method is called");
        display3();
        display5();
    }
    private void display3(){
        System.out.println("Private method is called");
    }
    public static void display4(){
        System.out.println("Static method is called");
    }
    protected void display5(){
        System.out.println("Display5 is called");
    }
}

 class child extends Demo2 {
     public void display() {
         System.out.println("child method is called");
         display5();
     }
 }
  class DemoAbstract {
    public static void main(String args[]){
        Demo2 ob=new child();
        Demo2.display4();
        ob.display1();
        ob.display();


    }
  }
