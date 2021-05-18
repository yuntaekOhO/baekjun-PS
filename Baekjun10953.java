package baekjun;

import java.util.Scanner;

public class Baekjun10953 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S;
			int T = sc.nextInt();
			for(int i=0; i<T;i++) {
				S = sc.next();
				String[] sArr = S.split(",");
				System.out.println(Integer.parseInt(sArr[0]) + Integer.parseInt(sArr[1]));
			}
		sc.close();
	}
}
