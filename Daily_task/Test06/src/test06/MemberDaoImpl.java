package test06;

public class MemberDaoImpl implements MemberDao {

	@Override
	public void doJoin() {
		System.out.println("가입이 완료되었습니다.");
	}

	@Override
	public void doLogin() {
		System.out.println("로그인 되셨습니다..");
	}

	@Override
	public void doUpdate() {
		System.out.println("회원 정보가 수정되었습니다.");
	}

	@Override
	public void getInfo() {
		System.out.println("가입이 완료되었습니다.");
	}

	@Override
	public void doLogout() {
		System.out.println("가입이 완료되었습니다.");
	}

}
