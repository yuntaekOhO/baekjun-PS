package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjun10951 {

	public static void main(String[] args) throws IOException {/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str="";
		while((str = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(str," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
		
			sb.append(a+b).append('\n');
			System.out.println(a);
			System.out.println(b);
		}
		System.out.println(sb);
	*/
	Scanner s = new Scanner(System.in);
	while(s.hasNextInt()) {
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println(a+b);
	}
	}
}

