import boj.Hello;
//import boj.*; // 패키지 속의 모든 클래스를 사용

public class CarExam {

	public static void main(String[] args) {
		// Car() 생성자: 메모리에 객체(인스턴스)를 만들라는 명령어
		// c1, c2 = 만들어진 Car 객체를 참조하는 변수
		Car c1 = new Car();
		Car c2 = new Car();
		
		Car2 c3 = new Car2("경찰차"); // 생성자를 선언했을 때
		System.out.println(c3.name);
		Car2 c4 = new Car2(); // 생성자 오버로딩을 통해 기본 생성자 사용
		System.out.println(c4.name + ", " + c4.number);
		Car2 c5 = new Car2("견인차", 2493);
		
		// 객체에 속성 추가하기
		c1.name = "소방차";
		c1.number = 1234;
		
		c2.name = "구급차";
		c2.number = 1111;
		
		System.out.println(c1.name);
		System.out.println(c1.number);
		System.out.println(c2.name);
		System.out.println(c2.number);
		
		
		// 객체에 메소드 추가하기
		Car myclass = new Car();
		myclass.method1();
		myclass.method2(2);
		int value1 = myclass.method3();
		System.out.println("method3의 리턴값 = " + value1);
		myclass.method4(2, 4);
		int value2 = myclass.method5(5);
		System.out.println("method5의 리턴값 = " + value2);
		
		
		// 메소드 오버로딩
		Car3 m = new Car3();
		System.out.println(m.plus(4, 5));
		System.out.println(m.plus(4, 6, 7));
		System.out.println(m.plus("Hello", "World"));
		
		
		// 타 패키지에서 생성한 클래스를 사용하기: Ctrl + Shift + o(알파벳)
		Hello h = new Hello();
		
		// 부모 생성자 Car와 자식 생성자 Truck
		Truck t = new Truck();
	}

}
