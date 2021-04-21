package Student_Main;

import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import study.java.myschool.MyBatisConnectionFactory;
import study.java.myschool.model.Student;
import study.java.myschool.service.StudentService;
import study.java.myschool.service.impl.StudentserviceImpl;

public class Main01 {

	public static void main(String[] args) {
		
		Student stud = new Student();
		stud.setName("김도운");
		stud.setUserid("dududada");
		stud.setGrade(2);
		stud.setIdnum("9607171111111");
		stud.setBirthdate("1996-07-17");
		stud.setTel("010-8440-0032");
		stud.setHeight(171);
		stud.setWeight(77);
		stud.setDeptno(201);
		stud.setProfno(9921);
		
		Logger logger = LogManager.getFormatterLogger(Main01.class.getName());
		
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlSession();
		
		StudentService studentService = new StudentserviceImpl(sqlSession, logger);
		
		try {
			studentService.addStudent(stud);
			
			sqlSession.commit();
			
			logger.debug("저장된 데이터 >> " + studentService.toString());
		} catch(Exception e) {
			e.printStackTrace();
		}
		sqlSession.close();
	}

}
