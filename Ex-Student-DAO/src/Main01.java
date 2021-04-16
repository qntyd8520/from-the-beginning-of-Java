import java.sql.Connection;

import study.java.daoex.dao.StudentDao;
import study.java.daoex.impl.StudentDaoImpl;
import study.java.daoex.model.Student;
import study.java.helper.DBHelper;


public class Main01 {

	public static void main(String[] args) {
		// 1) 데이터베이스 접속
		// --> import java.sql.Connection;
		// --> import study.java.helper.DBHelper;
		Connection conn = DBHelper.getInstance().open();
		
		if (conn == null) {
			System.out.println("데이터베이스 접속 실패");
			return;
		}
		
		// 2) INSERT를 수행할 데이터 생성
		// --> 사용되지 않는 값은 0(int) OR null(String)로 지정한다.
		Student model = new Student(0, "김도운", "dududada", 1, "9607171111111", 
				"1996-07-17 00:00:00", "010-8440-0032", 171, 70, 305, 9921);
		
		// 3) 데이터 저장
		StudentDao dao = new StudentDaoImpl(conn);
		int result = dao.insert(model);
		
		// 4) 결과 판별
		System.out.println(result + "번 데이터 저장됨");
		
		// 5) DB 접속 해제
		DBHelper.getInstance().close();
	}

}
