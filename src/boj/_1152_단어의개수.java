package boj;

import java.util.Scanner;
import java.util.StringTokenizer;

public class _1152_단어의개수 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		결과는 옳게 나오나 "틀렸습니다"가 나온다.
//		String str = sc.nextLine().trim(); // 앞뒤 공백 제거하는 클래스 trim()
//		String[] arr = str.split(" ");
//		sc.close();
//		System.out.println(arr.length);
		
		String str = sc.nextLine();
		sc.close();
		
		StringTokenizer st = new StringTokenizer(str, " ");
		
		System.out.println(st.countTokens());
		

	}

}
