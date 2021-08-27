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
			int max = (int)Math.sqrt(distance); //루트를 씌우고 정수값만 취한다
			
			//max는 distance와 distance에 루트를 씌운 값이 정수로 떨어진 값이다 
			if(max==Math.sqrt(distance)) {  //정수만 취한값과 루트 씌운값이 정수로 떨어지면
				sb.append(max*2-1).append('\n'); //max값이 변할때 max*2-1 성립한다 
			} 
			//max 값이 바뀌기 전까지의 거리에는 이동횟수가 두번 바뀐다
			else if(distance<=max*max+max) {//이동 횟수가 바뀌기 전까지의 범위
				sb.append(max*2).append('\n');//이동횟수
			} 
			
			else { // 이동 횟수 바뀐 다음 max가 바뀌기 전까지의 범위
				sb.append(max*2+1).append('\n');//이동횟수
			}
		}
		System.out.println(sb);
	}
}
