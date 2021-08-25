package baekjun;
import java.io.*;
public class Baekjun1193 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int line = 0; // ���� Ȧ���� ���� , ¦���� �Ʒ���
		int cnt = 0; // : ���° �ٿ� ��ġ�� ���� �������� �Ǵ�
		 
		while(cnt<n) {
			line++;
			cnt = line * (line+1) /2 ; // a(a+1)/2  = a�� a��° ���� ���� ����
		}
		if(line%2 != 0) { // Ȧ����° �� 
			int top = 1+(cnt-n);
			int bottom = line - (cnt-n);
			System.out.println(top+"/"+bottom);
		} else {	// ¦����° ��
			int top = line - (cnt-n);
			int bottom = 1 + (cnt-n);
			System.out.println(top+"/"+bottom);
		}
	}

}
