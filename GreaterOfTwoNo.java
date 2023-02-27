
//Java Program to find Larger of Two NUmbers
import java.util.Scanner;

public class GreaterOfTwoNo{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter no2: ");
		int num2 = sc.nextInt();

		if (num1 > num2) {
			System.out.println("The Greater numbers is" + num1);
		} else {
			System.out.println("The Greater numbers is" + num2);

		}
	sc.close();
	}

}
