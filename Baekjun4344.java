package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Baekjun4344 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		int sum = 0;
		int s = 0;
		int avg = 0;
		int cnt = 0;
		double r = 0.0;
		
		for(int i=0;i<T;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			s = Integer.parseInt(st.nextToken());
			
			int[] arr = new int[s];
			
			for(int j=0;j<arr.length;j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				sum += arr[j];
			}
			avg = sum / s;
			
			for(int j=0;j<s;j++) {
				if(avg<arr[j]) {
					cnt++;
				}
			}
			r = (cnt / (double)s) * 100;
			
			sb.append(String.format("%.3f", r)+"%").append("\n");
			
			cnt = 0;
			sum = 0;
		}
		System.out.print(sb);
	}

}
