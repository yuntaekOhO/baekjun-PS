package Baekjun_DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun11053 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] dp = new int[n];
		int[] arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0;i<n;i++) {
			dp[i] = 1;
			
			for(int j=0;j<i;j++) {
				if(arr[j]<arr[i] && dp[i]<dp[j]+1) {
					dp[i] = dp[j]+1;
				}
			}
		}
		int max = -1;
		for(int i=0;i<n;i++) {
			max = dp[i]>max ? dp[i] : max;
		}
		System.out.println(max);
	}
}
