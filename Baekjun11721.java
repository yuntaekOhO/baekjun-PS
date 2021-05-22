package baekjun;

//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.Scanner;

public class Baekjun11721 {

	public static void main(String[] args) throws IOException {
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String st = br.readLine();
		int leng = st.length();
		for(int i=0;i<leng/10;i++) {
			if(leng>=101) { 
				System.out.println("100글자 초과.");
				br.close();
				break;
			}
			System.out.println(st.substring(i*10, (i+1)*10));
		}
		System.out.println(st.substring((leng/10)*10));
		br.close();*/
		
		Scanner sc = new Scanner(System.in);
		String a =  sc.next();
		sc.close();
		for(int i=0;i<a.length();i++) {
			System.out.print(a.charAt(i));
			if(i%10==9) {
				System.out.println();
			}
		}
	}
}

