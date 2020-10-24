
public class BusExam {

	public static void main(String[] args) {
		
		Bus bus = new Bus();
		bus.run();  // Car 클래스(Bus의 부모)의 메소드 사용
		bus.ppangppang(); // Bus 클래스의 메소드 사용
		
		Car car = new Car();
		car.run();
//		car.ppangppang(); // 자식 클래스(Bus)의 메소드를 사용할 수 없음
		
		Car c = new Bus(); // 부모 타입으로 자식을 가리킬 수 있음
		c.run();
//		c.ppangppang();    // 부모가 가지고 있는 메소드 이외에는 사용 불가
		
		Bus b = (Bus)c;    // 클래스 형변환
		b.run();
		b.ppangppang();

	}

}
