package baekjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjun14681 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {		
		BufferedReader br = null;
		BufferedWriter bw = null;
		int a, b;
		
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());

		br.close();
		
		if(a>0 && b>0) {
			bw.append("1");
		} else if(a<0 && b>0) {
			bw.append("2");
		} else if(a<0 && b<0) {
			bw.append("3");
		} else if(a>0 && b<0) {
			bw.append("4");
		}
		bw.flush();
		bw.close();
	}

}
