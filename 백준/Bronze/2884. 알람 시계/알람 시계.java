import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		int x,y;
		
		x = in.nextInt();
		y = in.nextInt();
		
		if(y-45 <0) {
			x = x-1;
			if(x <0) {
				System.out.println("23" +" "+ (60-(45-y)));
			}else {
				System.out.println(x +" "+ (60-(45-y)));
			}
		}else {
			System.out.println(x +" "+ (y-45));
		}
	}
}
