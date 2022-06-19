import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int x, y, z;
		int temp;

		x = in.nextInt();
		y = in.nextInt();
		z = in.nextInt();

		if ((y + z) >= 60) {
			temp = (y + z) / 60;
			x = x + temp;
			y = (y + z) % 60;
			if (x >= 24) {
				System.out.println(x - 24 + " " + y);
			} else {
				System.out.println(x + " " + y);
			}
		}else {
			System.out.println(x + " " + (y+z));
		}
	}
}
