package Student_Main;

import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import study.java.myschool.MyBatisConnectionFactory;
import study.java.myschool.model.Student;
import study.java.myschool.service.StudentService;
import study.java.myschool.service.impl.StudentserviceImpl;

public class Main03 {

	public static void main(String[] args) {
	
		Logger logger = LogManager.getFormatterLogger(Main03.class.getName());
		
		Student stud = new Student();
		stud.setStudno(20111);
		
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlSession();
		
		StudentService studentService = new StudentserviceImpl(sqlSession, logger);
		
		try {
			studentService.deleteStudent(stud);
			
			sqlSession.commit();
			
			logger.debug("데이터 삭제 완료.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sqlSession.close();
		
	}

}
