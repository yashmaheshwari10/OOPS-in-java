class pen{
    String color;
    String type;
    public void print(){
        System.out.println(this.color + " " + this.type);
    }
}

public class oops_basics {
    public static void main(String[] args) {
        pen pen1 = new pen(); //creating an object pen1
        pen1.color="blue"; // "." operator used to access properties 
        pen1.type="ball";
        pen1.print(); //calling function in pen class through pen1 object
           
        pen pen2 = new pen(); //another object pen2
        pen2.color="black";
        pen2.type="ink";
        pen2.print();

    }
    
}
