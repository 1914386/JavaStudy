
public class Switch {
	
	public static void main(String[] args) {
		//switch, case
		//default - else와 같은 의미
		//break - switch 문 바깥으로 빠져나옴
		
		int value = 2;
		
		switch(value) {
			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
				break;
			case 3:
				System.out.println("3");
				break;
			default:
				System.out.println("그 외 다른 숫자");
				break;
		}
		
		String str = "A";
		
		switch(str) { //문자열로도 switch문 실행 가능
			case "A":
				System.out.println("A");
				break;
			case "B":
				System.out.println("B");
				break;
		}
	}


}
