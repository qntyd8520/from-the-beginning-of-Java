package test06;

public class test02 {

	public static void main(String[] args) {
		MemberDao member = new MemberDaoImpl();
		
		member.doJoin();
		member.doLogin();
		member.doUpdate();
		member.getInfo();
		member.doLogout();
	}

}
