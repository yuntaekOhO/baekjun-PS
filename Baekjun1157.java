package baekjun;
import java.io.*;
public class Baekjun1157 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int [26]; // �ش� �ڸ���° ���ĺ� ���� Ƚ��
		String str = br.readLine();
		
		for(int i=0;i<str.length();i++) {
			if('a'<=str.charAt(i) && str.charAt(i)<='z') { // �ҹ���
				arr[str.charAt(i) - 97]++;
			} else { // �빮��
				arr[str.charAt(i) - 65]++;
			}
		}
		int max = -1;
		char p = '?';
		for(int i=0;i<26;i++) { // �ִ밪 ã��
			if(arr[i]>max) {
				max = arr[i];
				p = (char)(i+65); // �빮�� ���
			}
			else if(arr[i]==max) {
				p = '?';
			}
		}
		System.out.println(p);
	}

}
