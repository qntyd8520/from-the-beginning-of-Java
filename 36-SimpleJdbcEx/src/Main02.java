import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import study.java.helper.DBHelper;

// department 테이블에 데이터를 추가하기위한 구문
public class Main02 {

	public static void main(String[] args) {
		// 'department' 테이블에 `컴퓨터정보과` 추가하기위한 SQL
		String sql = "INSERT INTO department (deptno, dname, loc)"
				+ "VALUES (300, '컴퓨터정보과', '5호관')";
		
		/** DBHelper릁 통한 DB접속 처리 **/
		DBHelper db = DBHelper.getInstance();
		Connection conn = db.open();
		
		/** SQL 구문 실행하기 **/
		// SQL문을 실행할 수 있는 객체
		Statement stmt = null; 
		// 결과값 ( 저장된 데이터의 수 )
		int result = 0;
		
		try {
			// SQL문을 실행할 수 있는 객체 생성 ( 예외처리 요구 )
			stmt = conn.createStatement();
			// SQL문을 실행하기 --> 결과 행 리턴됨 ( 예외처리 요구 )
			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println("MySQL SQl Fail : " + e.getMessage());
		} finally {
			// SQL 구문의 에러 여부에 상관없이 stmt 객체를 닫기 위하여 finally 블록사용.
			// --> 객체의 유효범위 설정을 위해서 stmt 객체는 try 블록 밖으로 선언
			if (stmt !=null) {
				// 객체 닫기    // JBDC 관련 객체들은 사용이 완료된 후에는 반드시 close처리를
				try {         // 수행해야 한다. 이때 반드시 생성순서의 역순으로 처리
					stmt.close();
				} catch (SQLException e) {
				}
			}

		}
		// 결과 출력
		System.out.println(result + " Record Insert");
		/** DB 접속 해제 **/
		db.close();
		
	}

}
