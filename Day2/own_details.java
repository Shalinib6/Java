import java.util.Scanner;

public class own_details {

	public static void main(String[] args) {
		System.out.println("Enter your details name,age and College name");
		Scanner scan=new Scanner(System.in);
		String name=scan.nextLine();
		int age=scan.nextInt();
		scan.nextLine();
		String Clg_name=scan.nextLine();
		
		System.out.println("Your name is "+name+" and your age is "+age+ " your clg name is " +Clg_name);
		

	}

}