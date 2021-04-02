import study.java.helper.RegexHelper;

// 싱글톤 패턴으로 작성한 Helper클래스 호출해서 출력
public class Main02 {

	public static void main(String[] args) {
		// 회원가입시에 입력한 내용을 가정한 변수값들
		String name = "자바돌이";
		String age = "19";
		String email = "user@java.net";
		String phone = "01012345678";
		
		/** 정규표현식을 사용한 입력값 형식검사 */
		if (!RegexHelper.getInstance().isKor(name)) {
			System.out.println("이름은 한글로 입력해 주세요.");
			return;
		}
		
		if (!RegexHelper.getInstance().isNum(age)) {
			System.out.println("나이는 숫자로만 입력해 주세요.");
			return;
		}
		
		if (!RegexHelper.getInstance().isEmail(email)) {
			System.out.println("이메일이 잘못된 형식입니다.");
			return;
		}
		
		if (!RegexHelper.getInstance().isCellphone(phone)) {
			System.out.println("핸드폰번호가 잘못된 형식 입니다.");
			return;
		}
		System.out.println("회원가입 절차를 진행합니다.");
	}
}
