import java.util.Scanner;

public class Welcome{

		public static void main(String[] args){
		
		Scanner inputName = new Scanner(System.in);
		System.out.println ("what is your name");
		String userName = inputName.nextLine();

		System.out.print("what is your age");
		int inputAge = inputName.nextInt();
		
		
		System.out.printf("Hello %s you are %d years", userName, 12);
	}

}