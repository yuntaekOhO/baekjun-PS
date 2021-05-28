package baekjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjun2446 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int m = n*2-1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				bw.write(' ');
			}
			for(int j=0;j<m-2*i;j++) {
				bw.write('*');
			}
			bw.newLine();
		}
		for(int i=n-2;i>=0;i--) {
			for(int j=0;j<i;j++) {
				bw.write(' ');
			}
			for(int j=0;j<m-2*i;j++) {
				bw.write('*');
			}
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}

}
