package baekjun;


public class Baekjun4673 {

	public static void main(String[] args) {
		
		boolean[] ch = new boolean[10001];
		
		for(int i=1;i<10001;i++) {
			int n = d(i);
			
			if(n<10001) {
				ch[n] = true; //true면 생성자가 있는 수, false는 생성자가 없는 수
			}
		}
		StringBuilder sb = new StringBuilder();
		
		for(int i=1;i<10001;i++) {
			if(!ch[i]) {
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);
	}
	static int d(int a) {
		int sum = a;
		
		while(a != 0) {
			sum = sum + (a % 10);
			a = a / 10;
		}
		return sum; //sum = 생성자
	}
}
