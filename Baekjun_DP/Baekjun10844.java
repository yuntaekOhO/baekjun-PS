package Baekjun_DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun10844 {
	static Long[][] dp;
	static int n;
	final static long MOD = 1000000000;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		dp = new Long[n+1][10];
		
		for(int i=0;i<10;i++) { //첫번째 자리수는 1로 초기화
			dp[1][i] = 1L;
		}
		
		long result = 0;
		
		for(int i=1;i<=9;i++) { //마지막 자릿수인 1~9까지의 경우의 수를 모두 더한다.
			result += recur(n,i);
		}
		System.out.println(result % MOD);
	}
	static long recur(int digit, int val) {
		if(digit ==1) {
			return dp[digit][val];
		}
		if(dp[digit][val]==null) {
			if(val==0) {
				dp[digit][val] = recur(digit-1, 1);
			}
			else if(val==9) {
				dp[digit][val] = recur(digit-1, 8);
			}
			else {
				dp[digit][val] = recur(digit-1,val-1) + recur(digit-1, val+1);
			}
		}
		return dp[digit][val] % MOD;
	}
}
