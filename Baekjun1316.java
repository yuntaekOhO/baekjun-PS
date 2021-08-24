package baekjun;
import java.io.*;
import java.util.*;
public class Baekjun1316 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] temp = new boolean[26]; 
		int T = Integer.parseInt(br.readLine());
		int count = T;
		String[] arr = new String[T];
		for(int i=0;i<T;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i] = st.nextToken();
			
			Arrays.fill(temp, false);
			temp[arr[i].charAt(0)-97] = true;//ù �ܾ��� ù ���ĺ��� �´� ��ġ�� temp�� true��
			
			for(int j=1;j<arr[i].length();j++) {//j�� ù�ܾ��� ���� ��ŭ
				
				if(arr[i].charAt(j) != arr[i].charAt(j-1)) { // ù�ܾ��� j��° ���ĺ��� j-1��° ���ĺ��� 
															 //����������
					
					if(temp[arr[i].charAt(j)-97] == true) { // j��° ���ĺ��� �̹� �ѹ� ���ͼ� true�� �Ǿ�������
						count--; 				//�׷�ܾ �ƴϱ� ������ count--
						break;					//���� ���ĺ��� ������� �ݺ��� Ż��(=���� �� �ܾ�=i++)
					}
					else {
						temp[arr[i].charAt(j)-97] = true; //j��° ���ĺ��� ó�����ͼ� false��
														//true�� ����
					}
				}
			}
		}
		System.out.println(count);
	}

}
