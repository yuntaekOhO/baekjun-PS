package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun1924 {

	public static void main(String[] args) throws IOException {
		int[] month = new int[13];
		month[1]=month[3]=month[5]=month[7]=month[8]=month[10]=month[12]=31;
		month[4]=month[6]=month[9]=month[11]=30;
		month[2]=28;
		String[] day = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int count = 0;
		for(int i=1;i<x;i++) {
			if(i==x) {
			break;
			}
			count += month[i];
		}
		count += y;
		System.out.println(day[count%7]);
	}

}
