import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		int a;
		int sum = 0;
		a = in.nextInt();
		
		for(int i = 0; i < a+1 ; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
