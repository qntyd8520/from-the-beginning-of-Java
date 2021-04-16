import java.sql.Connection;

import study.java.daoex.dao.StudentDao;
import study.java.daoex.impl.StudentDaoImpl;
import study.java.daoex.model.Student;
import study.java.helper.DBHelper;


public class Main04 {

	public static void main(String[] args) {
		// 1) 데이터베이스 접속
		Connection conn = DBHelper.getInstance().open();
		
		if (conn == null) {
			System.out.println("데이터베이스 접속 실패");
			return;
		}
		
		// 2) 조회할 데이터
		int target = 10111;
		
		// 3) 101번 데이터 조회
		StudentDao dao = new StudentDaoImpl(conn);
		Student result = dao.selectOne(target);
		
		// 4) 결과 판별
		if (result == null) {
			System.out.println("조회결과 없음");
		}
		else {
			System.out.println(result.toString());
		}
		
		// 5) DB 접속 해제
		DBHelper.getInstance().close();
	}

}
