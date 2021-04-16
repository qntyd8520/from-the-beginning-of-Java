import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import study.java.helper.DBHelper;
// 다중행 결과 조회하고 출력하기
public class Main07 {

	public static void main(String[] args) {
		// 학과목록 조회하기
		String sql = "SELECT deptno, dname, loc FROM department ORDER BY deptno ASC";
		
		/** DBHelper릁 통한 DB접속 처리 **/
		DBHelper db = DBHelper.getInstance();
		Connection conn = db.open();
		
		/** SQL 구문 실행하기 **/
		// SQL문을 실행할 수 있는 객체
		Statement stmt = null; 
		// --> import java.sql.resultset;
		ResultSet rs = null;
		
		try {
			// SQL문을 실행할 수 있는 객체 생성 ( 예외처리 요구 )
			stmt = conn.createStatement();

			// SELECT 구문을 실행한 후, 결과셋을 리턴 받는다.
			rs = stmt.executeQuery(sql);
			
			// 한 줄씩 스캔하는 반복문 구성
			while (rs.next()) {
				int deptNo = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				
				System.out.printf("학과번호 : %d\n", deptNo);
				System.out.printf("학과이름 : %s\n", dname);
				System.out.printf("위치 : %s\n", loc);
				System.out.println();
			}
		} catch (SQLException e) {
			System.out.println("MySQL SQl Fail : " + e.getMessage());
		} finally {
			// ResultSet 닫기 --> 생성된 순서의 역순으로 객체를 닫는다.
			if (rs !=null) {
				try {         
					rs.close();
				} catch (SQLException e) {
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
				}
			}

		}
		/** DB 접속 해제 **/
		db.close();
	}

}
