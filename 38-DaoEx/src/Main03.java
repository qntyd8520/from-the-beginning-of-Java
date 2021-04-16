import java.sql.Connection;

import study.java.daoex.dao.DepartmentDao;
import study.java.daoex.dao.impl.DepartmentDaoImpl;
import study.java.daoex.model.Department;
import study.java.helper.DBHelper;

public class Main03 {

	public static void main(String[] args) {
		// 1) 데이터베이스 접속
		Connection conn = DBHelper.getInstance().open();
		
		if (conn == null) {
			System.out.println("데이터베이스 접속 실패");
			return;
		}
		
		// 2) UPDATE를 수행할 데이터 생성
		Department model = new Department(101, "인터넷통신학과", "7호관");
		
		// 3) 데이터 수정
		DepartmentDao dao = new DepartmentDaoImpl(conn);
		int result = dao.update(model);
		
		// 4) 결과 판별
		System.out.println(result + "개의 데이터 수정됨");
		
		// 5) DB 접속 해제
		DBHelper.getInstance().close();
	}

}
