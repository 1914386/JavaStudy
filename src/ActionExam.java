
public class ActionExam {

	public static void main(String[] args) {
		// 일반적으로 MyAction 클래스를 사용하는 방법
//		Action action = new MyAction();
//		action.exec();
		
	    // MyAction을 사용하지 않고 Action을 상속받는 익명 중첩 클래스
		Action action = new Action() { // 이름 없는 객체
			
			@Override
			public void exec() {
				System.out.println("exec");
			}
		};
		
		action.exec();
	}

}
