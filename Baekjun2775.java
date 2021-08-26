package baekjun;
import java.io.*;

public class Baekjun2775 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[][] apt = new int[15][15];
		
		for(int i=0;i<15;i++) {
			apt[i][1] = 1;
			apt[0][i] = i;
		}
		
		for(int i=1;i<15;i++) {
			for(int j=2; j<15;j++) {
				apt[i][j] = apt[i][j-1] + apt[i-1][j];
				//구하려는 곳의 값은 (같은층 앞 호의 값 + 한층 아래의 값)
			}
		}
		
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			
			sb.append(apt[k][n]).append('\n');
		}
		System.out.println(sb);
	}

}
