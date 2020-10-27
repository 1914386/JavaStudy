
public class InnerExam2 {
	
	// static으로 정의된 내부 클래스 = 정적 중첩 클래스, static 클래스
	static class Calcal {
		int value = 0;
		public void plus() {
			value++;
		}
	}
	
	public static void main(String[] args) {
		InnerExam2.Calcal cal = new InnerExam2.Calcal(); // InnerExam2 객체를 생성할 필요없이 바로 Calcal 객체 생성
		cal.plus();
		System.out.println(cal.value); // 1

	}

}
