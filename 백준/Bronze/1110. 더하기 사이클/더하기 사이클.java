import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int temp = a;
		int b,c;
		int cnt = 0;
		do {
			b = temp/10;
			c = temp%10;
			temp = (b+c)%10;
			temp = (c*10)+(temp%10);
			cnt++;
		}
		while(a != temp);
		System.out.println(cnt);
	}
}
