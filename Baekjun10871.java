package baekjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjun10871 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br	=null;
		BufferedWriter bw 	=null;
		StringTokenizer st 	=null;
		
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		/*
		 * int[] arr = new int[n];
		 * 
		 * String inNum = br.readLine();
		 * 
		 * br.close();
		 * 
		 * st = new StringTokenizer(inNum, " ");
		 * 
		 * for(int i=0;i<n;i++) {
		 * 		arr[i] = Integer.parseInt(st.nextToken());
		 * 		if(arr[i]<x) {
		 * 			bw.append(String.valueOf(arr[i])).append(' ');
		 * 		}
		 * }
		 * bw.flush();
		 * bw.close();
		 *  */
		st = new StringTokenizer(br.readLine(), " ");
		
		br.close();
		
		for(int i=0;i<n;i++) {
			int num = Integer.parseInt(st.nextToken());
			if(num<x) {
				bw.append(String.valueOf(num)).append(' ');
			}
		}
		bw.flush();
		bw.close();
	}

}
