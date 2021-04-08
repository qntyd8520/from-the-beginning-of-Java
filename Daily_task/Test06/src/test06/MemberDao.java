package test06;

public interface MemberDao {
	// 가입
	public void doJoin();

	// 로그인
	public void doLogin();

	// 정보 수정 완료
	public void doUpdate();

	// 정보 수정 진행
	public void getInfo();

	// 로그아웃
	public void doLogout();

}
