
import java.util.Scanner;

class shape{
    Scanner sc=new Scanner(System.in);
    shape(){

    }
    void area(int a) {
        System.out.println("area of square:"+a*a);
    }
    void area(float r) {
        System.out.println("area of circle:"+3.14*r*r);
    }
    void area(int b,int l) {
        System.out.println("area of rectangle:"+b*l);
    }
}

class square extends shape{
    square(int a){
        area(a);
    }
}
class circle extends shape{
    circle(float r){
        area(r);
    }
}
class rectangle extends shape{
    rectangle(int a,int b){
        area(a,b);
    }
}
public class Hello {

    public static void main(String[] args) {
        System.out.println("enter a shape (square/circle/rectangle)");
        Scanner sc=new Scanner(System.in);
        String choice=sc.next();
        
        switch(choice) {
            case "square":
                int a=sc.nextInt();
                square Square=new square(a);
                break;
            case "circle":
                int r=sc.nextInt();
                circle Circle=new circle(r);
                break;
            case "rectangle":
                int l=sc.nextInt();
                int b=sc.nextInt();
                rectangle Rectangle=new rectangle(l,b);
                break;
            default:
                System.out.println("Invalid");
        }

    }

}


