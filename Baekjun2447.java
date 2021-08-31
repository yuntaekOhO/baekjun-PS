package baekjun;
import java.io.*;
public class Baekjun2447 {
	static char[][] arr;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		arr = new char[n][n];
		
		star(0,0,n,false);
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				sb.append(arr[i][j]);
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}
	
	static void star(int x, int y, int n, boolean blank) {
		//°ø¹éÄ­ÀÏ °æ¿ì
		if(blank) {
			for(int i=x;i<x+n;i++) {
				for(int j=y;j<y+n;j++) {
					arr[i][j] = ' ';
				}
			}
			return;
		}
		//ÂÉ°¶¼ö ¾ø´Â ºí·ÏÀÏ °æ¿ì
		if(n==1) {
			arr[x][y] ='*';
			return;
		}
		int size = n/3;
		int cnt = 0;
		for(int i=x;i<x+n;i+=size) {
			for(int j=y;j<y+n;j+=size) {
				cnt++;
				if(cnt==5) {
					star(i,j,size,true);
				} else {
					star(i,j,size,false);
				}
			}
		}
	}
}
