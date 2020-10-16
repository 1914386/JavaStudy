 
public class StringClass {

	public static void main(String[] args) {
		// String 클래스: 문자열을 표현하는 자바에서 가장 많이 이용하는 클래스.
		String str1 = "Hello";  // 상수 영역에 저장
		String str2 = "Hello";  // str1과 str2는 같은 객체(인스턴스)를 참조 = 같은 레퍼런스
		
		
		// new 연산자를 이용하지 않고 객체(인스턴스)를 만들어낼 수 있다.
		String str3 = new String("Java");  // 상수 영역에 저장하지 않고, 새 객체(인스턴스)를 heap 영역에 생성
		String str4 = new String("Java");  // str3과 str4는 다른 레퍼런스
		
		if (str1 == str2)
			System.out.println("str1과 str2는 같은 레퍼런스입니다.");
		
		if (str1 == str3)
			System.out.println("str1과 str3은 같은 레퍼런스입니다.");
		
		if (str3 == str4)
			System.out.println("str3과 str4는 같은 레퍼런스입니다.");
		
		
		// String 클래스만의 특징 - 한 번 생성되면 변하지 않는다
		System.out.println(str1);
		System.out.println(str1.substring(3)); // 3번 인덱스부터 출력
		System.out.println(str1); // 내부 값 불변
		
		
		// String 클래스의 equals 메소드: 변수의 레퍼런스가 아닌, 변수가 저장하는 문자열이 같은지 확인하고 싶을 때
		if (str1.equals("Hello"))
			System.out.println("str1은 Hello와 같습니다.");
		
		if (str3.equals(str4)) {
			System.out.println("str3과 str4는 같은 값을 가지고 있습니다.");
		}
		else {
			System.out.println("str3과 str4는 다른 값을 가지고 있습니다.");
		}
		
		if (str1.equals(str4)) {
			System.out.println("str1과 str4는 같은 값을 가지고 있습니다.");
		}
		else {
			System.out.println("str1과 str4는 다른 값을 가지고 있습니다.");
		}
		
		
		// String 클래스가 제공하는 메소드
		String str = "hello";
		
		System.out.println(str.length()); // 문자열의 길이
		System.out.println(str.concat(" world")); // 문자열 붙이기
		System.out.println(str); // str 값은 변하지 않음
		
		str = str.concat(" world");
		System.out.println(str); // 위의 작업을 거치면 str 값이 변함
		
		System.out.println(str.substring(3));
		System.out.println(str.substring(3, 7)); // 문자열 자르기
	}

}
