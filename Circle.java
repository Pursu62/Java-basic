import java.util.Scanner;
public class Circle {
    public static void main (String[]args){
    Scanner sc=new  Scanner (System.in);
    System.out.println ("enter a radius");
    float r =sc.nextFloat();
    float a=(22/7)*r*r;
    float p= (2*22/r);
    System.out.println("area is = "+a);
    System.out.println("perimeter is ="+p);
}
    
    
    
    
    
    
    
    
}