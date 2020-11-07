
public class Exception {

	public static void main(String[] args) {
//		예외: 프로그램 실행 중 예기치 못하게 발생하는 사건
//		예외 처리: 예외 상황을 미리 예측하고 처리
		int i = 10;
		int j = 5;
		
		try { // 오류가 발생할 것으로 예상되는 부분
		int k = i / j;
		System.out.println(k);
		}catch(ArithmeticException e) { // 예외 처리
			System.out.println("예외 처리: 0으로 나눌 수 없습니다." + e.toString());  // 예외에 대한 정보 출력
		}finally { // 예외 발생 여부와 상관 없이 무조건 실행
			System.out.println("오류 발생 여부와 상관 없이 실행됩니다.");
		}
		
		System.out.println("end1");
		
		int a = 10;
		int b = 0;
		try {
		int c = divide(a, b);
		}catch(ArithmeticException e){
			System.out.println(e.toString());
		}
		
	}
	
	public static int divide(int a, int b) throws ArithmeticException {
		int c = a / b;
		return c;
	}

}
