package Baekjun_DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun1463 {
	//static int[] d;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		int dp[] = new int[n+1];
		dp[0] = dp[1] = 0;  // Bottom-up
		for(int i=2;i<=n;i++) {
			dp[i] = dp[i-1] +1;
			if(i%2==0)
				dp[i] = Math.min(dp[i], dp[i/2]+1);
			if(i%3==0)
				dp[i] = Math.min(dp[i], dp[i/3]+1);
		}
		System.out.println(dp[n]);
			
	}
	/*private static int dp(int n) { ***Top-down
		if(n==1) 
			return 0;
		if(d[n]>0) 
			return d[n];
		
		d[n] = dp(n-1) + 1;
		
		if(n%2 == 0) {
			int tmp = dp(n/2)+1;
			if(d[n]>tmp) d[n] = tmp;
		}
		
		if(n%3 == 0) {
			int tmp = dp(n/3)+1;
			if(d[n]>tmp) d[n] = tmp;
		}
		return d[n];
	}*/
}
