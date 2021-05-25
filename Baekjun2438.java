package baekjun;

import java.util.Scanner;

public class Baekjun2438 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = "*";
		for(int i=1;i<n+1;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(s);
			}
			System.out.println();
		}
		sc.close();
	}

}
