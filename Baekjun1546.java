package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjun1546 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		
		int N = Integer.parseInt(br.readLine());
		double[] org = new double[N];
		double sum = 0;
		
		st = new StringTokenizer(br.readLine(), " ");
		br.close();
		for(int i=0;i<org.length;i++) {
			org[i] = Double.parseDouble(st.nextToken());
		}
		
		Arrays.sort(org);
		
		for(int i=0;i<org.length;i++) {
			sum += ((org[i] / org[org.length-1]) * 100);
		}
		sb.append(sum/org.length);
		System.out.println(sb);
		
	}

}
