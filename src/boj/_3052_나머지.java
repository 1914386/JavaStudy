package boj;

import java.util.HashSet;
import java.util.Scanner;

public class _3052_나머지 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] inputArr = new int[10];
		HashSet<Integer> outputArr = new HashSet<Integer>(); // 중복 원소를 제거하는 클래스 HashSet* (https://st-lab.tistory.com/46?category=833672)
		
		for(int i=0; i<10; i++) {
			inputArr[i] = sc.nextInt();
			outputArr.add(inputArr[i] % 42);				 // 입력받은 값을 HashSet에 저장
		}
		
		sc.close();
		
		System.out.println(outputArr.size()); 				 // 배열의 크기

	}

}
