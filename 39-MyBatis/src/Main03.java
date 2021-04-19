import org.apache.ibatis.session.SqlSession;

import study.java.myschool.MyBatisConnectionFactory;
import study.java.myschool.model.Department;

// 학과 정보 수정하기

public class Main03 {

	public static void main(String[] args) {
		// 1) 데이터베이스 접속
		// --> import study.java.myschool.MyBatisConnectionFactory;
		// --> import org.apache.ibatis.session.SqlSession;
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlSession();
		
		// 2) UPDATE를 수행할 데이터 생성
		Department model = new Department();
		model.setDeptno(101);
		model.setDname("인터넷통신학과");
		model.setLoc("7호관");
		
		// 3) 데이터 저장
		// DepartmentMapper라는 namespace를 갖는 XML에서
		// edit_department인 <update> 태그를 호출한다.
		int result = sqlSession.update("DepartmentMapper.edit_department", model);

		// 4) 결과 판별
		// --> 리턴값이 0이라면 내부적으로 예외가 발생된 상황으로 간주해야 한다.
		System.out.println(result + "개의 데이터 수정됨.");
		
		// 5) DB 접속 해제
		// 페이지 종료 전에 데이터의 변경사항을 저장(commit)하고
		// 데이터베이스 접속 해제하기
		sqlSession.commit();
		sqlSession.close();
	}

}
