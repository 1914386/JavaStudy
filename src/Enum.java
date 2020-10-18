
public class Enum {
	public static final String MALE = "MALE";
	public static final String FEMALE = "FEMALE";

	public static void main(String[] args) {
		String gender1;
		gender1 = Enum.MALE;
		gender1 = Enum.FEMALE;
		gender1 = "boy";
		
		Gender gender2;
		gender2 = Gender.MALE;
		gender2 = Gender.FEMALE;
//		gender2 = "boy"; // MALE, FEMALE 이외의 값은 저장 불가
	}

}

enum Gender{
	MALE, FEMALE;
}
