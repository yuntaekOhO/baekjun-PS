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
				al[i] = -1;// �迭 ��� -1�� �ʱ�ȭ
			}
		}
		
		for(int i=0;i<str.length();i++) {
			a = str.charAt(i);// i��° ��ġ�� �ִ� ���� �ƽ�Ű ������ ����
			al[a-97] = str.indexOf(a);// str�� ����� a�� ���� ���� �ִ��� �Ǵ� ������ ���ĺ� ������ �迭�� ����
		}
		
		for(int i=0;i<al.length;i++) {
			sb.append(al[i]).append(" ");	
		}

		System.out.println(sb);
	}

}
