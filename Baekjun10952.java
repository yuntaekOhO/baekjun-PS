package baekjun;

import java.util.Scanner;

public class Baekjun10952 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int a, b;
			a = sc.nextInt();
			b = sc.nextInt();
			if(a==0 && b==0) break;
			System.out.println(a+b);
		}
		sc.close();
	}
}
