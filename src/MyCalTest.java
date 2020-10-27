
public class MyCalTest {

	public static void main(String[] args) {
		Calculator cal = new MyCal();
		cal.plus(1, 3);
		cal.multiple(5, 2);
		System.out.println(cal.exec(4, 8));
		
		//cal.exec2  -> 오류 발생
		System.out.println(Calculator.exec2(4, 7));

	}

}
