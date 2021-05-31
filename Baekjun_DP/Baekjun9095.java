package Baekjun_DP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjun9095 {
	static int dp[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		dp = new int [11];
		int [] a = new int[T];
		for(int i=0;i<T;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), "\n");
			a[i] = Integer.parseInt(st.nextToken());
			bw.write(Integer.toString(recur(a[i])));
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
	private static int recur(int n) {
		if(dp[n]>0) return dp[n];
		if(n==1) return 1;
		else if(n==2) return 2;
		else if(n==3) return 4;
		else {
			dp[n] = recur(n-1) + recur(n-2) + recur(n-3);
			return dp[n];
		}
	}
}
