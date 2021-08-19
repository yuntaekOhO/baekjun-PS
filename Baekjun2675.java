package baekjun;
import java.io.*;
import java.util.StringTokenizer;
public class Baekjun2675 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		try {
			int T = Integer.parseInt(br.readLine());
			
			for(int i=0;i<T;i++) {
				String s = br.readLine();
				StringTokenizer st = new StringTokenizer(s, " ");
				int r = Integer.parseInt(st.nextToken());
				String str = st.nextToken();
				
				for(int k=0;k<str.length();k++) {
					for(int j=0;j<r;j++) {
						sb.append(str.charAt(k));
					}
				}
				sb.append("\n");
			}
			System.out.println(sb);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("error");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("error");
		}
		
	}

}
