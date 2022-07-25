import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<String> set = new HashSet<String>();
		
		for (int i = 0; i < 10; i++) {
			int index = (Integer.parseInt(br.readLine())%42);
			String st = Integer.toString(index);
			set.add(st);
		}
		System.out.println(set.size());
	}
}
