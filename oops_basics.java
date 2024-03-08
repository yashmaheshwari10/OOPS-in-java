class pen{
    String color;
    String type;
    public void print(){
        System.out.println(color + " " + type);
    }
}

public class oops {
    public static void main(String[] args) {
        pen pen1 = new pen();
        pen1.color="blue";
        pen1.type="ball";
        pen1.print();    
        pen pen2 = new pen();
        pen2.color="black";
        pen2.type="ink";
        pen2.print();

    }
    
}
