package baekjun;
import java.io.*;
import java.util.*;
public class Baekjun1712 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		if(c<=b) {
			System.out.println("-1");
		}else {
			System.out.println((a/(c-b))+1);
		}
	}
}
