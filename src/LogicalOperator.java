
public class LogicalOperator {
	
	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		boolean b4 = false;
		
		System.out.println(b1 && b3);
		System.out.println(b1 && b2);
		System.out.println(b1 || b2);
		System.out.println(b2 || b4);
		System.out.println(b1 ^ b2);
		System.out.println(b1 ^ b3);
		System.out.println(!b1);
		System.out.println(!b2);
		
		int score = 88;
		if(score <= 100 && score >= 70) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		
		int b5 = (5 > 4) ? 50 : 40; //true --> 50
		System.out.println(b5);
		int b6 = (5 < 4) ? 50 : 40; //false --> 40
		System.out.println(b6);

		//위와 같은 식		
//		int b7 = 0;
//		if (5 > 4)
//			b7 = 50;
//		else
//			b7 = 40;
//		System.out.println(b7);
		
		}

}
