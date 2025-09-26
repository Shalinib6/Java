import java.util.Scanner;
public class printdetails {
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        String name=scan.nextLine();
        int age=scan.nextInt();
        scan.nextLine();
        String college=scan.nextLine();
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("College: "+college);


    }
}
