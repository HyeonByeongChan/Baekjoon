import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int a = in.nextInt();
		int temp = a;
		for(int i = 0 ; i < a ; i++) {
			for(int j = temp ; j > 1 ; j--) {
				System.out.print(" ");
			}
			for(int k = 0 ; k < i+1 ; k++) {
				System.out.print("*");
			}
		temp--;
		System.out.println(" ");
		}

	}

}
