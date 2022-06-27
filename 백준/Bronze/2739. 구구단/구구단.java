import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int x;
		x = in.nextInt();

		if (x >= 1 && x <= 9) {
			for (int i = 1; i < 10; i++) {
				System.out.println(x + " * " + i + " = " + (x*i));
			}
		}
	}
}
