
public class Car {
	// 붕어빵 = 객체 (클래스에서 선언된 모양 그대로 생성된 실체)
	// 붕어빵의 틀 = 클래스 (객체를 만들어내기 위한 설계도, 틀)
		
	// 속성 (=필드): 객체의 상태
	// 메소드: 객체의 동작. 입력값(매개변수, 인자)과 결과값(리턴값)
	// ex) 자동차(객체)의 이름과 번호(필드), 전진과 후진 기능(메소드)
		
		
	// 필드 선언: 타입 필드명
	String name;
	int number;
	
	
	// 메소드 선언: public 리턴타입 메소드명 (매개변수){ 기능 }
	public void method1() {
		System.out.println("method1이 실행됩니다.");
	}
	
	public void method2(int x) {
		System.out.println(x + "를 이용한 method2이 실행됩니다.");
	}
	
	public int method3() {
		System.out.println("method3이 실행됩니다.");
		return 3;
	}
	
	public void method4(int x, int y) {
		System.out.println("method4이 실행됩니다. 두 변수의 합 = " + x + y);
	}
	
	public int method5(int y) {
		System.out.println(y + "를 이용한 method5이 실행됩니다.");
		return y * 2;
	}
}
