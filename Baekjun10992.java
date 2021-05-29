package baekjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjun10992 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		br.close();
		for(int i=0;i<n-1;i++) {
			for(int j=i;j<n-1;j++) {
				bw.write(' ');
			}
			for(int j=n;j<=n;j++) {
				bw.write('*');
			}
			for(int k=0;k<i*2-1;k++) {
				bw.write(' ');
			}
			for(int k=0;k<1;k++) {
				if(i==0) continue;
				bw.write('*');
			}
			bw.newLine();
		}
		for(int i=0;i<n*2-1;i++) {
			bw.write('*');
		}
		bw.flush();
		bw.close();
	}

}
