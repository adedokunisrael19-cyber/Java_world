import java.util.Scanner;
public class PositiveCalculator{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.println("Type a random number");
	int a = input.nextInt();
	
	System.out.println("Type a random number");
	int b = input.nextInt();
	
	int c = Math.abs(a-b);
	
	System.out.printf("result is %s", c);

}
}