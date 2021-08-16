package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun1065 {
	static boolean[] ch;
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println(han(Integer.parseInt(br.readLine())));
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private static int han(int n) {
		int cnt = 0;
		if(n<100) { 
			return n; // 입력 n이 100이하라면 입력 그대로 출력 : 1~99까지는 모두 등차수열
		} else {
			cnt = 99; // 100 ~ 1000까지의 경우만 생각
			if(n==1000) {
				n = 999; // 입력 최대가 1000인데 1000은 등차 수열이 아님 : 세자리 수인 경우만 생각
			}
			
			for(int i=100;i<=n;i++) {
				int a = i / 100;	//100의 자리
				int b = (i/10) % 10;	//10의 자리
				int c = i % 10;		//1의 자리
				
				if((a-b)==(b-c)) { // 등차수열인지 판단
					cnt++; 
				}
			}
		}
		
		return cnt;
	}

}
