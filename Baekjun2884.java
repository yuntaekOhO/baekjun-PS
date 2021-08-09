package baekjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjun2884 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = null;
		BufferedWriter bw = null;
		StringTokenizer st = null;
		int H, M;
		
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		st = new StringTokenizer(br.readLine(), " ");
		
		br.close();
		
		H = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		if(M<45) {
			H--;
			M = 60-(45-M);
			
			if(H<0) {
				H = 23;
			}
			bw.append(String.valueOf(H));
			bw.append(" ");
			bw.append(String.valueOf(M));
		} else {
			bw.append(String.valueOf(H));
			bw.append(" ");
			bw.append(String.valueOf(M-45));
		}
		bw.flush();
		bw.close();
	}

}
