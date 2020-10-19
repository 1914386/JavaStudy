
public class Car2 {
	// 타입 필드명
	String name;
	int number;
	
	// 생성자 선언
	public Car2(String name) { 
//		name = name;  // name이 어떤 것인지 알 수 없음
		this.name = name;  // this: 객체 자신을 참조하는 키워드
	}
	
	// 생성자 오버로딩도 가능
	public Car2() {
//		this.name = "이름없음";
//		this.number = 0;
		this("이름없음", 0);  // 디폴트값
	}
	
	public Car2(String name, int number) {
		this.name = name;
		this.number = number;
	}
}
