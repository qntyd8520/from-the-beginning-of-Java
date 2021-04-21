package Student_Main;

import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import study.java.myschool.MyBatisConnectionFactory;
import study.java.myschool.model.Student;
import study.java.myschool.service.StudentService;
import study.java.myschool.service.impl.StudentserviceImpl;

public class Main04 {

	public static void main(String[] args) {
	
		Logger logger = LogManager.getFormatterLogger(Main04.class.getName());
		
		Student stud = new Student();
		stud.setStudno(10111);
		
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlSession();
		
		StudentService studentService = new StudentserviceImpl(sqlSession, logger);
		
		Student result = null;
		
		try {
			result = studentService.getStudentItem(stud);
			
			logger.debug("조회된 데이터 >> " + result.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sqlSession.close();
		
	}

}
