import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String str;
		int a,temp,min,max;
		str = br.readLine();
		st = new StringTokenizer(str, " ");
		a = Integer.parseInt(st.nextToken());
		str = br.readLine();
		st = new StringTokenizer(str, " ");
		min = Integer.parseInt(st.nextToken());
		max = min;
		for(int i = 1 ; i < a ; i++) {
			temp = Integer.parseInt(st.nextToken());
			if(min > temp) {
				min = temp;
			}
			if(max < temp) {
				max = temp;
			}
		}
		sb.append(min).append(" ").append(max);
		System.out.println(sb);
	}
}
