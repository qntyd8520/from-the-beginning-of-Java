import java.sql.Connection;

import study.java.daoex.dao.DepartmentDao;
import study.java.daoex.dao.impl.DepartmentDaoImpl;

import study.java.helper.DBHelper;

public class Main02 {

	public static void main(String[] args) {
		// 1) 데이터베이스 접속
		// --> import java.sql.Connection;
		// --> import study.java.helper.DBHelper;
		Connection conn = DBHelper.getInstance().open();
		
		if (conn == null) {
			System.out.println("데이터베이스 접속 실패");
			return;
		}
		
		// 2) 삭제할 데이터
		// --> Main01에서 출력된 값을 입력하세요.
		int target = 306;
		
		// 3) 304번 데이터 삭제
		DepartmentDao dao = new DepartmentDaoImpl(conn);
		int result = dao.delete(target);
		
		// 4) 결과 판별
		System.out.println(result + "개의 데이터 삭제됨");
		
		// 5) DB 접속 해제
		DBHelper.getInstance().close();
	}

}
