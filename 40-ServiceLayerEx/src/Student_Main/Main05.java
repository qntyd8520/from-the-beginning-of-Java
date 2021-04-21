package Student_Main;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import study.java.myschool.MyBatisConnectionFactory;
import study.java.myschool.model.Student;
import study.java.myschool.service.StudentService;
import study.java.myschool.service.impl.StudentserviceImpl;

public class Main05 {

	public static void main(String[] args) {
	
		Logger logger = LogManager.getFormatterLogger(Main05.class.getName());
		
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlSession();
		
		StudentService studentService = new StudentserviceImpl(sqlSession, logger);
		
		List<Student> result = null;
		
		try {
			result = studentService.getStudentList();
			
			for (int i = 0; i < result.size(); i++) {
				Student temp = result.get(i);
				logger.debug(String.format("조회결과[%d] >> %s", i, temp.toString()));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sqlSession.close();
		
	}

}
