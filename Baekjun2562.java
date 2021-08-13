package baekjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjun2562 {
		
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br	= null;
		BufferedWriter bw	= null;
		
		int[] arr = new int[9];
		
		int max = arr[0];
		int count = 0;
		
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		br.close();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
				count = i+1;
			}
		}
		bw.append(Integer.toString(max));
		bw.newLine();
		bw.append(Integer.toString(count));
		bw.flush();
		bw.close();
	}

}
