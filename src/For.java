
public class For {
	
	public static void main(String[] args) {
		// 1에서 100까지 합
		int total = 0;
		
		for(int i=1; i<=100; i++) {
			total += i;
		}
		
		System.out.println("1부터 100까지의 합: " + total);
		
		
		// 1에서 100 중 짝수의 합
		int sum = 0;
		
		for(int j=1; j<=100; j++) {
			if(j % 2 != 0) {
				continue; // 홀수는 넘어가고 다시 반복문 수행
			}
			sum += j;
//			if (j == 50) {
//				break; // j = 50이 되면 반복문 종료
//			}
		}
		
		System.out.println("1부터 100까지의 숫자 중 짝수의 합: "+ sum);
//		System.out.println("1부터 50까지의 합: "+ sum);
	}

}
