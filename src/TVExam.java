
public class TVExam {

	public static void main(String[] args) {
		// 참조변수의 타입으로 인터페이스를 사용할 수 있음
		TV tv = new LedTv();
		
		// 인터페이스가 가지고 있는 메소드
		tv.turnOn();
		tv.changeChannel(8);
		tv.changeVolume(39);
		tv.turnOff();

	}

}
