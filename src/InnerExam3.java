
public class InnerExam3 {
	
	public void exec() {
		// 메소드 안에 클래스 선언 = 지역 중첩 클래스, 지역 클래스
		class Calcal {
			int value = 0;
			public void plus() {
				value++;
			}
		}
		// 메소드 안에서 해당 클래스를 사용
		Calcal cal = new Calcal();
		cal.plus();
		System.out.println(cal.value);
	}

	public static void main(String[] args) {
		InnerExam3 c = new InnerExam3();
		c.exec(); // Calcal 클래스 수행

	}

}
