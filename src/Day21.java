
    abstract class Shape{
        abstract void draw();
        public static void run(){
            System.out.println("run method is called");
            get();

        }
        Shape(){
            System.out.println("constructor method is called");
            get();
        }
        private static void get(){
            System.out.println("Get method is called");
        }

    }
    //In real scenario, implementation is provided by others i.e. unknown by end user
    class Rectangle extends Shape{
        void draw(){System.out.println("drawing rectangle");}
    }
    class Circle1 extends Shape{
        void draw(){System.out.println("drawing circle"); }
    }
    //In real scenario, method is called by programmer or user
    class Day21{
        public static void main(String args[]){
            Shape s=new Circle1();//In a real scenario, object is provided through method, e.g., getShape() method
            s.draw();
            s.run();

        }
    }

