package baekjun;
import java.io.*;
public class Baekjun1193 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int line = 0; // 줄이 홀수면 위로 , 짝수면 아래로
		int cnt = 0; // : 몇번째 줄에 위치한 항의 개수인지 판단
		 
		while(cnt<n) {
			line++;
			cnt = line * (line+1) /2 ; // a(a+1)/2  = a는 a번째 까지 항의 개수
		}
		if(line%2 != 0) { // 홀수번째 줄 
			int top = 1+(cnt-n);
			int bottom = line - (cnt-n);
			System.out.println(top+"/"+bottom);
		} else {	// 짝수번째 줄
			int top = line - (cnt-n);
			int bottom = 1 + (cnt-n);
			System.out.println(top+"/"+bottom);
		}
	}

}
