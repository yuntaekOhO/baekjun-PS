package Baekjun_DP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Beakjun11726 {
	static int[] d;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		br.close();
		d = new int [n+1];
		bw.write(Integer.toString(recur(n)));
		bw.flush();
		bw.close();
	}
	private static int recur(int n) {
		if(d[n]>0) return d[n];
		if(n==0||n==1) 
			return 1;
		else {
			d[n] = (recur(n-1) + recur(n-2)) % 10007;
			return d[n];
		}
	}

}
