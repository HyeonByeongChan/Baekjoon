import java.util.Scanner;
public class Main {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		int x,y,z;
		
		x= in.nextInt();
		y= in.nextInt();
		z= in.nextInt();
		
		if(x==y && y==z) {
			System.out.println(10000+(x*1000));
		}else if(x==y || y==z || x==z) {
			if(x==y) {
				System.out.println(1000 + (x*100));
			}else if(y==z) {
				System.out.println(1000 + (y*100));
			}else if(x==z) {
				System.out.println(1000 + (x*100));
			}
		}else {
			if(x>y && x>z) {
				System.out.println(x*100);
			}else if(y>x && y>z) {
				System.out.println(y*100);
			}else {
				System.out.println(z*100);
			}
		}
	}
}
