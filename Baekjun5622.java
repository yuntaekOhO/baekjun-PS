package baekjun;
import java.io.*;
public class Baekjun5622 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int sec = 0;
		String[] arr = new String[10];
		arr[0] = "";
		arr[1] = "";
		arr[2] = "ABC";
		arr[3] = "DEF";
		arr[4] = "GHI";
		arr[5] = "JKL";
		arr[6] = "MNO";
		arr[7] = "PQRS";
		arr[8] = "TUV";
		arr[9] = "WXYZ";

		String str = br.readLine(); 
		br.close();
		
		for(int i=0;i<str.length();i++) {
			String c = String.valueOf(str.charAt(i));
			for(int j=0;j<arr.length;j++) {
				if(arr[j].contains(c)) {
					sec += j;
				}
			}
		}
		sec += str.length();
		sb.append(sec);
		System.out.println(sb);
	}

}
