import java.util.Scanner;
public class Rectangle {
    public static void main (String[]args){
    Scanner sc=new  Scanner (System.in);
    System.out.println ("enter a length");
    float l =sc.nextFloat();
    System.out.println ("enter a breadth");
    float b =sc.nextFloat();
    float a=l*b;
    float p= 2*l+2*b;
    System.out.println("area is = "+a);
    System.out.println("perimeter is ="+p);
}  
    
    
    
    
    
    
    
    
}