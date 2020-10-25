package boj;

//import java.util.Arrays;
import java.util.Scanner;

public class _10818_최소최대 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] <= min) {
				min = arr[i];
			}else if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println(min + " " + max);
		
		// 간단한 방법
//		Arrays.sort(arr); // 원소 값을 오름차순으로 정렬하는 메소드
//		System.out.println(arr[0] + " " + arr[N-1]);
		
		sc.close();

	}

}
