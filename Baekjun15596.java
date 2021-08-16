package baekjun;

public class Baekjun15596 {
	long sum(int [] a) {
		long n = 0;
		
		for(int i=0;i<a.length;i++) {
			n += a[i];
		}
				
		return n;
	}
}
