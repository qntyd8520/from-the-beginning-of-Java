import org.apache.ibatis.session.SqlSession;

import study.java.myschool.MyBatisConnectionFactory;
import study.java.myschool.model.Department;

// 학과에 대한 단일 데이터 조회하기

public class Main04 {

	public static void main(String[] args) {

		// 1) 데이터베이스 접속
		// --> import study.java.myschool.MyBatisConnectionFactory;
		// --> import org.apache.ibatis.session.SqlSession;
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlSession();

		// 2) 조회할 데이터
		// 생성자를 정의할 경우는 사용하지 않는 값들을 null이나 0으로
		// 설정해야 하지만, 기본생성자만 사용하는 경우는 필요한 값만
		// 정의할 수 있다.
		Department model = new Department();
		model.setDeptno(102);

		// 3) 데이터 조회
		Department result = sqlSession.selectOne(
				"DepartmentMapper.get_department_item", model);

		// 4) 결과 판별
		if (result == null) {
			System.out.println("조회결과 없음");
		} else {
			System.out.println(result.toString());
		}

		// 5) DB 접속 해제
		sqlSession.close();

	}

}
