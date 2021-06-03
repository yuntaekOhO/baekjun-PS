package Baekjun_DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun11057 {
	static int[][] dp;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		dp = new int[n+1][10];
		for(int i=0;i<10;i++) { //첫번째 자리수는 1로 초기화
			dp[1][i] = 1;
		}
		int result = 0;
		
		for(int i=2;i<=n;i++) {
			for(int j=0;j<10;j++) {
				for(int k=0;k<=j;k++) {
					dp[i][j] += dp[i-1][k];
					dp[i][j] %= 10007;
				}
			}
		}
		for(int i=0;i<10;i++) { //마지막 자릿수인 1~9까지의 경우의 수를 모두 더한다.
			result += dp[n][i];
		}
		System.out.println(result % 10007);
	}
}
