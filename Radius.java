//Make a program that takes the radius of a circle as input,
//calculates its radius and area and prints it as output to the user.
import java.util.*;
class Radius{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double pi = 14.7;
        System.out.println("Enter the radius of circle");
        double radius = sc.nextDouble();
        double circumfrence = 2* pi* radius;
        double area = pi* radius*radius;
        System.out.println("Circumfrence of the circle is"+circumfrence);
        System.out.println("Area of the circle is"+area); 

    }
}