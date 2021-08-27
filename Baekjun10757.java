package baekjun;
import java.io.*;
import java.util.*;
import java.math.*;
public class Baekjun10757 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		BigInteger a = new BigInteger(st.nextToken());
		BigInteger b = new BigInteger(st.nextToken());
		
		a = a.add(b);
		
		System.out.println(a.toString());
	}

}
