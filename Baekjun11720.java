package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun11720 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int n;
		String nn;
		int num = 0; 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		String[] starry = new String[n];
		
		nn = br.readLine();
		
		starry = nn.split("");
		
		for(String s : starry) {
			num = num + Integer.parseInt(s);
		}
		System.out.println(num);
	}
}
