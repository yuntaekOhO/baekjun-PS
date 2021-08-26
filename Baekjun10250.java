package baekjun;
import java.io.*;
import java.util.*;
public class Baekjun10250 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int h = Integer.parseInt(st.nextToken());
			st.nextToken();
			int n = Integer.parseInt(st.nextToken());
			
			if(n%h == 0) { //n%h = �� ��, if n==h�� h= �� ��
				sb.append((h*100)+(n/h)).append('\n'); 
				//h�� �� �� = ȣ�� �ű�� ���� *100, ������ �������� ������ ���� �Ÿ�
			} else {
				sb.append(((n%h)*100)+((n/h)+1)).append('\n');
				//�������� �� ��, �� +1 �ϸ� �Ÿ�
			}
			
		}
		br.close();
		System.out.println(sb);
	}

}
