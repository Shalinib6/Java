import java.util.Scanner;
public class average {

    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        float a=scan.nextFloat(),b=scan.nextFloat(),c=scan.nextFloat();
        float ave=(a+b+c)/3;
        System.out.printf("The Average value =%.2f ",ave);


    }
    
}
