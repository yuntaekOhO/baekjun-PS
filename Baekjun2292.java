package baekjun;
import java.io.*;
public class Baekjun2292 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int center = 1; 
		int step = 1; // 출력할 대상
		
		for(int i=1;;i++) {
			int bfcenter = center;
			center = bfcenter + (6 * i);
			if(N==1) {
				step = 1;
				break;
			}
			else if( N>bfcenter && N<=center) {
				step = i+1;
				break;
			}
		}
		System.out.println(step);
	}

}
