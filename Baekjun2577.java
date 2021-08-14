package baekjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjun2577 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		int[] count = new int[10];
		int result = 1;
		
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=0;i<3;i++) {
			result *= Integer.parseInt(br.readLine());
		}
		br.close();
		
		String str = Integer.toString(result);
		
		for(int i=0;i<str.length();i++) {
			count[(str.charAt(i) - 48)]++;
		}
		
		for(int v : count) {
			bw.write(Integer.toString(v));
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}

}
