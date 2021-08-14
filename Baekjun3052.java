package baekjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjun3052 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		boolean[] arr = new boolean[42];
		int cnt = 0;
		
		for(int i=0;i<10;i++) {
			arr[Integer.parseInt(br.readLine()) %42] = true;
			
		}
		br.close();
		for(boolean val : arr) {
			if(val) {
				cnt++;
			}
		}
		bw.append(Integer.toString(cnt));
		bw.flush();
		bw.close();
	}

}
