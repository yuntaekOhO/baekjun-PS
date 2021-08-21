package baekjun;
import java.io.*;
import java.util.*;
public class Baekjun2908 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String num1 = st.nextToken();
		String num2 = st.nextToken();
		String[] na1 = new String[num1.length()];
		String[] na2 = new String[num2.length()];;
		String a = "";
		String b = "";
		
		na1[0] = String.valueOf(num1.charAt(2));
		na1[1] = String.valueOf(num1.charAt(1));
		na1[2] = String.valueOf(num1.charAt(0));
		for(int i=0;i<na1.length;i++) {
			a = a.concat(na1[i]);
		}
		na2[0] = String.valueOf(num2.charAt(2));
		na2[1] = String.valueOf(num2.charAt(1));
		na2[2] = String.valueOf(num2.charAt(0));
		for(int i=0;i<na2.length;i++) {
			b = b.concat(na2[i]);
		}

		if(Integer.parseInt(a)<Integer.parseInt(b)) {
			System.out.println(b);
		} else {
			System.out.println(a);
		}
	}

}
