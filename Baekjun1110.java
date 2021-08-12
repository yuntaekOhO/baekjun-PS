package baekjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjun1110 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br	=null;
		BufferedWriter bw	=null;
		int n;
		int temp;
		int cnt = 0;
		
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		n = Integer.parseInt(br.readLine());
		temp = n;
		br.close();
		do {
			n = ((n%10) * 10) + (((n/10) + (n%10)) % 10);
			cnt++;
		}
		while(temp != n);
		bw.write(String.valueOf(cnt));
		bw.flush();
		bw.close();
	}

}
