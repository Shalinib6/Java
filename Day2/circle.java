   // only if file is inside Day2 folder

import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter radius: ");
        double r = sc.nextDouble();
        
        double area = Math.PI * r * r;
        System.out.printf("Area of the circle = %.1f", area);
        
        sc.close(); // good practice
    }
}
