import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int total = 1;
		int index[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0,0 };
		for (int i = 0; i < 3; i++) {
			total *= Integer.parseInt(br.readLine());
		}
		String st = Integer.toString(total);
		String[] arr = st.split("");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < 10; j++) {
				if (Integer.parseInt(arr[i]) == j) {
					index[j] = index[j] + 1;
				}
			}
		}
		for (int i = 0; i < index.length; i++) {
			System.out.println(index[i]);
		}
	}
}
