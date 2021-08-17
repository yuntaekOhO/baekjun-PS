package baekjun;
import java.io.*;
public class Baekjun10809 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int[] al = new int[26];
		int a = 0;
		
		String str = br.readLine();
		br.close();
		
		for(int i=0;i<al.length;i++) {
			if(al[i]==0) {
				al[i] = -1;// 배열 요소 -1로 초기화
			}
		}
		
		for(int i=0;i<str.length();i++) {
			a = str.charAt(i);// i번째 위치에 있는 문자 아스키 값으로 저장
			al[a-97] = str.indexOf(a);// str에 저장된 a와 같은 값이 있는지 판단 있으면 알파벳 순으로 배열에 저장
		}
		
		for(int i=0;i<al.length;i++) {
			sb.append(al[i]).append(" ");	
		}

		System.out.println(sb);
	}

}
