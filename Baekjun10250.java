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
			
			if(n%h == 0) { //n%h = 층 수, if n==h면 h= 층 수
				sb.append((h*100)+(n/h)).append('\n'); 
				//h가 층 수 = 호수 매기기 위해 *100, 나누어 떨어지기 때문에 몫이 거리
			} else {
				sb.append(((n%h)*100)+((n/h)+1)).append('\n');
				//나머지가 층 수, 몫에 +1 하면 거리
			}
			
		}
		br.close();
		System.out.println(sb);
	}

}
