package boj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _2609_최대공약수_최소공배수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		sc.close();
		
		ArrayList<Integer> arr = new ArrayList<Integer>(); // 공배수들을 저장할 ArrayList
		
		for(int i=1; i<=x; i++) {
			if(x % i == 0 && y % i == 0) {
				arr.add(i);
			}
		}
		
		Collections.reverse(arr); // ArrayList 내림차순 정렬
		
		int gcd = arr.get(0); // 최대공약수
		int lcm = gcd * (x / gcd) * (y / gcd); // 최소공배수
		
		System.out.println(gcd);
		System.out.println(lcm);

	}

}
