package baekjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjun2445 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				bw.write('*');
			}
			for(int k=0;k<2*(n-i);k++) {
				bw.write(' ');
			}
			for(int j=1;j<=i;j++) {
				bw.write('*');
			}
			bw.newLine();
		}
		for(int i=n-1;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				bw.write('*');
			}
			for(int k=0;k<2*(n-i);k++) {
				bw.write(' ');
			}
			for(int j=1;j<=i;j++) {
				bw.write('*');
			}
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}

}
