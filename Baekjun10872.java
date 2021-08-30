package baekjun;
import java.io.*;
public class Baekjun10872 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		sb.append(factorial(n));
		System.out.println(sb);
	}

	public static int factorial(int n) {
		if(n<=1) return 1;
		return n * factorial(n-1);
	}
}
