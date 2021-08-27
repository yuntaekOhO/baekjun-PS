package baekjun;
import java.io.*;
import java.util.*;
public class Baekjun1011 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0;i<t;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			int distance = y - x;
			int max = (int)Math.sqrt(distance); //��Ʈ�� ����� �������� ���Ѵ�
			
			//max�� distance�� distance�� ��Ʈ�� ���� ���� ������ ������ ���̴� 
			if(max==Math.sqrt(distance)) {  //������ ���Ѱ��� ��Ʈ ����� ������ ��������
				sb.append(max*2-1).append('\n'); //max���� ���Ҷ� max*2-1 �����Ѵ� 
			} 
			//max ���� �ٲ�� �������� �Ÿ����� �̵�Ƚ���� �ι� �ٲ��
			else if(distance<=max*max+max) {//�̵� Ƚ���� �ٲ�� �������� ����
				sb.append(max*2).append('\n');//�̵�Ƚ��
			} 
			
			else { // �̵� Ƚ�� �ٲ� ���� max�� �ٲ�� �������� ����
				sb.append(max*2+1).append('\n');//�̵�Ƚ��
			}
		}
		System.out.println(sb);
	}
}
