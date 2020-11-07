
public class BizException extends RuntimeException {
	public BizException(String msg) {
		super(msg); // 부모 생성자에게 메시지 보내기
	}
	
	public BizException(Exception ex) {
		super(); // 부모 생성자에게 예외 보내기
	}
}
