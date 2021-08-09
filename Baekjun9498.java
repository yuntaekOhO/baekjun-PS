package baekjun;

import java.util.Scanner;

public class Baekjun9498 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt()/10;
		sc.close();
		if(a>=9) {
			System.out.println("A");
		} else if(a==8) {
			System.out.println("B");
		} else if(a==7) {
			System.out.println("C");
		} else if(a==6) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}

}
