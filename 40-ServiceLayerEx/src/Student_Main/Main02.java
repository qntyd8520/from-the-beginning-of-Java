package Student_Main;

import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import study.java.myschool.MyBatisConnectionFactory;
import study.java.myschool.model.Student;
import study.java.myschool.service.StudentService;
import study.java.myschool.service.impl.StudentserviceImpl;

public class Main02 {

	public static void main(String[] args) {
		
		Logger logger = LogManager.getFormatterLogger(Main02.class.getName());
		
		Student stud = new Student();
		stud.setStudno(20111);
		stud.setName("도운");
		stud.setUserid("ddudda");
		stud.setGrade(3);
		stud.setIdnum("9607171111111");
		stud.setBirthdate("1996-07-17");
		stud.setTel("010-8440-0032");
		stud.setHeight(171);
		stud.setWeight(77);
		stud.setDeptno(305);
		stud.setProfno(9921);
		
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlSession();
		
		StudentService studentService = new StudentserviceImpl(sqlSession, logger);
		
		try {
			studentService.editStudent(stud);
			
			sqlSession.commit();
			
			logger.debug("수정된 데이터 >> " + studentService.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sqlSession.close();
		
	
	}

}
