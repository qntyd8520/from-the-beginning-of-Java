import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import study.java.myschool.MyBatisConnectionFactory;
import study.java.myschool.model.Department;
import study.java.myschool.service.DepartmentService;
import study.java.myschool.service.impl.DepartmentserviceImpl;

// 데이터 수정을 위한 Main --> 수정을 위한 처리 절차 확인
public class Main02 {

	public static void main(String[] args) {
		
		/** 처리 결과를 기록할 Log4J 객체 생성 **/
		// --> import org.apache.logging.log4j.LogManager;
		// --> import org.apache.logging.log4j.Logger;
		Logger logger = LogManager.getFormatterLogger(Main02.class.getName());

		/** 수정될 데이터를 담고 있는 Beans 객체 생성 **/
		// --> import study.java.myschool.model.Department;
		Department dept = new Department();
		dept.setDeptno(201);
		dept.setDname("정보통신학과");
		dept.setLoc("통신관");
		
		/** 데이터베이스 접속 **/
		// --> import org.apache.ibatis.sesion.Sqlsession;
		SqlSession session = MyBatisConnectionFactory.getSqlSession();
		
		/** 데이터 처리 수행 **/
		// 비지니스 로직을 위한 Service 객체 생성
		// --> import study.java.myschool.service.DepartmentService;
		// --> import study.java.myschool.service.impl.DepartmentServiceImpl;
		DepartmentService departmentSerivce = new DepartmentserviceImpl(session);
		// 수정된 결과를 리턴 받기 위한 Beans 객체
		Department result = null;
		
		// 학과 수정하기
		try {
			result = departmentSerivce.editDepartment(dept);
			// 수정결과를 데이터베이스에 반영하기
			session.commit();
			// 처리 결과를 로그에 기록하기
			logger.debug("수정된 데이터 >> " + result.toString());
		} catch (NullPointerException e) {
			// 수정된 데이터가 없는 경우
			logger.error("수정된 데이터가 없습니다.");
		} catch (Exception e) {
			// SQL문에 문제가 있는 경우.
			logger.error("데이터 수정에 실패했습니다." + e.getMessage());
		}
		
		/** 데이터베이스 접속 해제 **/
		session.close();
	}

}
