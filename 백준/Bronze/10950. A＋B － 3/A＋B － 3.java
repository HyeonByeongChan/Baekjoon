import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		int x,y;
		int temp;
		
		x = in.nextInt();
		
		for(int i = 0 ; i <x ; i++) {
			y = in.nextInt();
			temp = y;
			y = in.nextInt();
			System.out.println(temp+y);
		}
	}
}
