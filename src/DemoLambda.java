 interface Draw1{
    public void show(int a);
}
class DemoLambda{
    public static void main(String args[]){
        Draw1 d=(int a) ->{
            System.out.println("show method is called" +a);

        };
        d.show(10);
    }
}


