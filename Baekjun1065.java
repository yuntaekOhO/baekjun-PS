package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun1065 {
	static boolean[] ch;
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println(han(Integer.parseInt(br.readLine())));
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private static int han(int n) {
		int cnt = 0;
		if(n<100) { 
			return n; // �Է� n�� 100���϶�� �Է� �״�� ��� : 1~99������ ��� ��������
		} else {
			cnt = 99; // 100 ~ 1000������ ��츸 ����
			if(n==1000) {
				n = 999; // �Է� �ִ밡 1000�ε� 1000�� ���� ������ �ƴ� : ���ڸ� ���� ��츸 ����
			}
			
			for(int i=100;i<=n;i++) {
				int a = i / 100;	//100�� �ڸ�
				int b = (i/10) % 10;	//10�� �ڸ�
				int c = i % 10;		//1�� �ڸ�
				
				if((a-b)==(b-c)) { // ������������ �Ǵ�
					cnt++; 
				}
			}
		}
		
		return cnt;
	}

}
