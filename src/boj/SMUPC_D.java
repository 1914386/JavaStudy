package boj;
import java.util.Scanner;

//해결 못 한 문제
public class SMUPC_D {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] a = new int[N];
		int snow = 1;
		
		for (int i=0; i<N; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i=0; i<M; i++) {
//			snow += a[i];
//			snow = snow/2 + a[i+1];
		}
		
		System.out.println(snow);
	}

}
