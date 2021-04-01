// 익명클래스 ( Anonymous Class) 형태로 인터페이스 사용하기
public class Main02 {

	public static void main(String[] args) {
		/**
		 * 익명클래스 ( Anonymous Class)
		 * ---------------------------
		 * Interface 나 Abstract Class처럼 상속을 통해서만 사용할수있는경우,
		 * 별도의 클래스 생성과정없이 상속과 구현을 한번에 처리하는 기법
		 * 
		 * 일반적인 인터페이스 사용방법은 반드시 클래스의 상속후 메서드를 재정의하지만
		 * 익명클래스는 클래스 상속과 객체 생성을 일괄적으로 처리할수 있다.
		 */
		// 게시판의 기능 정의
		MySite bbs = new MySite() {
			@Override
			public void write() {
				System.out.println("새 글 쓰기");
			}
			
			@Override
			public void delete() {
				System.out.println("글 삭제");
			}
		}; // end Mysite
		bbs.write();
		bbs.delete();
		
		// 회원관리의 기능 정의
		MySite member = new MySite() {
			@Override
			public void write() {
				System.out.println("회원가입");
			}
			
			@Override
			public void delete() {
				System.out.println("회원탈퇴");
			}
		};
		member.write();
		member.delete();
	}

}
