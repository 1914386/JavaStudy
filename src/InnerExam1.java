
public class InnerExam1 {
	
	// 내부 클래스 = 중첩 클래스, 인스턴스 클래스
	class Calcal {
		int value = 0;
		public void plus() {
			value++;
		}
	}
	
	public static void main(String[] args) {
		InnerExam1 a = new InnerExam1(); // InnerExam1 객체 생성
		InnerExam1.Calcal cal = a.new Calcal(); // 내부에 있는 CalCal 객체 생성
		cal.plus();
		System.out.println(cal.value); // 1

	}

}
