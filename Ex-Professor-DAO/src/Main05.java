import java.sql.Connection;
import java.util.List;

import study.java.daoex.dao.ProfessorDao;
import study.java.daoex.dao.impl.ProfessorDaoImpl;
import study.java.daoex.model.Professor;
import study.java.helper.DBHelper;

public class Main05 {

	public static void main(String[] args) {
		// 1) 데이터베이스 접속
		Connection conn = DBHelper.getInstance().open();
		
		if (conn == null) {
			System.out.println("데이터베이스 접속 실패");
			return;
		}
		
		// 2) 데이터 목록 조회
		ProfessorDao dao = new ProfessorDaoImpl(conn);
		List<Professor> result = dao.select();
			
		// 4) 결과 판별
		if (result == null) {
			System.out.println("조회결과 없음");
		}
		else {
			for(int i = 0; i < result.size(); i++) {
				Professor item = result.get(i);
				System.out.println(item.toString());
			}
		}
		
		// 4) DB 접속 해제
		DBHelper.getInstance().close();
	}

}
