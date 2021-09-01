package baekjun;
import java.io.*;
public class Baekjun11729 {
	public static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		//�ű� Ƚ�� = 2^n - 1
		sb.append((int)(Math.pow(2,n)-1)).append('\n');
		
		Hanoi(n,1,2,3);
		System.out.println(sb);
	}

	public static void Hanoi(int n, int start, int mid, int end) {
		//���� ���� ����
		if(n==1) {
			sb.append(start+" "+end+'\n');
			return;
		}
		Hanoi(n-1,start,end,mid);
		
		sb.append(start+" "+end+"\n");
		
		Hanoi(n-1,mid,start,end);
	}
}
