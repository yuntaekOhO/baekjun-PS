package baekjun;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjun10951 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Arr[] = new String[5];
		String A ;
				
		for(int i=0; i<Arr.length;i++) {
			A = sc.next();
			StringTokenizer st = new StringTokenizer(A," ");
			//String con = st.nextToken();
			Arr[i] = st.nextToken();
			int a = Integer.parseInt(Arr[0]);
			int b = Integer.parseInt(Arr[1]);
			System.out.println(a+b);
		}
		sc.close();
	}

}
