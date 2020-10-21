
public class BusExam {

	public static void main(String[] args) {
		
		Bus bus = new Bus();
		bus.run();  // Car 클래스(Bus의 부모)의 메소드 사용
		bus.ppangppang(); // Bus 클래스의 메소드 사용
		
		Car car = new Car();
		car.run();
//		car.ppangppang(); // 자식 클래스(Bus)의 메소드를 사용할 수 없음

	}

}
