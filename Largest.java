import java.util.Scanner;
public class Largest{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the number");
	int num1 = input.nextInt();
	
	System.out.print("Enter Second number");
	int num2 = input.nextInt();
	
	if(num1 > num2) 
		System.out.printf("the answer is %d", num1);
else
		System.out.printf("the answer is %d", num2);
 	
	
	}



}