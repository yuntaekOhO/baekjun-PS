package baekjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjun15552 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br	= null;
		BufferedWriter bw 	= null;
		StringTokenizer st	= null;
		
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			bw.append((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))
						+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
