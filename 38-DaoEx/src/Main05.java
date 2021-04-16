import java.sql.Connection;
import java.util.List;

import study.java.daoex.dao.DepartmentDao;
import study.java.daoex.dao.impl.DepartmentDaoImpl;
import study.java.daoex.model.Department;
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
		DepartmentDao dao = new DepartmentDaoImpl(conn);
		List<Department> result = dao.select();
			
		// 4) 결과 판별
		if (result == null) {
			System.out.println("조회결과 없음");
		}
		else {
			for(int i = 0; i < result.size(); i++) {
				Department item = result.get(i);
				System.out.println(item.toString());
			}
		}
		
		// 4) DB 접속 해제
		DBHelper.getInstance().close();
	}

}
