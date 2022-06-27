import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int N = Integer.parseInt(br.readLine());
 
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
 
		for (int i = 1; i < N+1; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			sb.append("Case #"+i+": ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sb.append(a +" + "+b +" = ");
			sb.append(a + b);
			sb.append('\n');
		}
 
		System.out.println(sb);
	}
}