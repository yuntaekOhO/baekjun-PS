package baekjun;
import java.util.Scanner;

public class baekjun1000 {
	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		if(a<0 || b<0 || a>10 || b>10) { 
			System.out.println("0보다 크고 10보다 작은 정수를 입력해야 합니다.");
				}
		else {
					System.out.println(a+b);
				}
		sc.close();
	}
}

