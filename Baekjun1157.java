package baekjun;
import java.io.*;
public class Baekjun1157 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int [26]; // 해당 자리번째 알파벳 나온 횟수
		String str = br.readLine();
		
		for(int i=0;i<str.length();i++) {
			if('a'<=str.charAt(i) && str.charAt(i)<='z') { // 소문자
				arr[str.charAt(i) - 97]++;
			} else { // 대문자
				arr[str.charAt(i) - 65]++;
			}
		}
		int max = -1;
		char p = '?';
		for(int i=0;i<26;i++) { // 최대값 찾기
			if(arr[i]>max) {
				max = arr[i];
				p = (char)(i+65); // 대문자 출력
			}
			else if(arr[i]==max) {
				p = '?';
			}
		}
		System.out.println(p);
	}

}
