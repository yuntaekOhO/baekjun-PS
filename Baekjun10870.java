package baekjun;
import java.io.*;
public class Baekjun10870 {
	//static int[] fib;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		//fib = new int[n+1];
		br.close();
		
		//for(int i=0;i<=n;i++) {
		//	fib[i] = fibonacci(n);
		//}
		
		//sb.append(fib[n]);
		sb.append(fibonacci(n));
		System.out.println(sb);
	}

	public static int fibonacci(int n) {
		if(n<1) return 0;
		else if(n==1) return 1;
		else return fibonacci(n-2) + fibonacci(n-1);
	}
}
