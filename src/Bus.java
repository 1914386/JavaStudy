
public class Bus extends Car { // Bus는 Car를 상속받은 클래스

	public void ppangppang() {
		System.out.println("빵빵");
	}
	
	// 오버라이딩: 부모와 동일한 메소드 사용
	public void run() {
		super.run(); // 부모 메소드 호출
		System.out.println("Bus의 run 메소드");
	}

}
