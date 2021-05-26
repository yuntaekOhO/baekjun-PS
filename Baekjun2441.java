package baekjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjun2441 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		br.close();
		for(int i=0;i<n;i++) {
				for(int j=n-i;j<n;j++) {
					bw.write(' ');
				}
				for(int k=n-i;k>0;k--) {
					bw.write('*');
				}
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}
