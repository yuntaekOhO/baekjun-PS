package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun11021 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int T = Integer.parseInt(br.readLine());
			for(int i=1;i<=T;i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				System.out.println("Case #" + i + ": " 
				+ (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) );
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			br.close();
		}
	}
}
