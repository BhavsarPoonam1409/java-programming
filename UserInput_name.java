import java.util.Scanner;

public class UserInput_name{
	public static void main(String[] args){
		Scanner Userobj = new Scanner(System.in);
		System.out.println("Enter your name: ");
		
		String name = Userobj.nextLine();
		int p = name.length() -2;
		System.out.println(name.charAt(p));
		
	}
}