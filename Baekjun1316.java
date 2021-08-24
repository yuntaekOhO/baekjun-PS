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
			temp[arr[i].charAt(0)-97] = true;//첫 단어의 첫 알파벳에 맞는 위치의 temp를 true로
			
			for(int j=1;j<arr[i].length();j++) {//j는 첫단어의 길이 만큼
				
				if(arr[i].charAt(j) != arr[i].charAt(j-1)) { // 첫단어의 j번째 알파벳과 j-1번째 알파벳이 
															 //같지않으면
					
					if(temp[arr[i].charAt(j)-97] == true) { // j번째 알파벳이 이미 한번 나와서 true가 되어있으면
						count--; 				//그룹단어가 아니기 때문에 count--
						break;					//이후 알파벳은 상관없음 반복문 탈출(=다음 줄 단어=i++)
					}
					else {
						temp[arr[i].charAt(j)-97] = true; //j번째 알파벳이 처음나와서 false면
														//true로 변경
					}
				}
			}
		}
		System.out.println(count);
	}

}
