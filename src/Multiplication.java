
/**
 * Write a recursive function that accepts two arguments into the parameters x
 * and y. The function should return the value of x times y. Hint:
 * multiplication can be performed as repeated addition.
 * 
 * Test your recursive function by prompting the user to enter values for x and
 * y and then displaying the result. Your function should be able to handle
 * multiplication of negative values.
 * 
 * Sample Run java Multiplication Enter·a·value·for·x:2↵ Enter·a·value·for·y:4↵
 * The·product·of·2·*·4·is·8↵
 * 
 * @author Mark Kasule
 *
 */
import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// value for x
		System.out.print("Enter a value for x: ");
		int x = input.nextInt();

		// value for y
		System.out.print("Enter a value for y: ");
		int y = input.nextInt();

		// print result
		int result = multiply(x, y);
		System.out.println("Result is: " + result);

	}

	/**
	 * multiplication method
	 * 
	 * @param x
	 * @param y
	 * @return result
	 */
	public static int multiply(int x, int y) {

		if (y > 1) {
			return x + multiply(x, --y); // 3* 3 = 9 // 3 + 3 + 3
		} else {
			return x; // 3 * 1 = 3
		}

	}
}
