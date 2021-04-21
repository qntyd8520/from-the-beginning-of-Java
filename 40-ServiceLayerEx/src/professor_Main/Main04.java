package professor_Main;

import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import study.java.myschool.MyBatisConnectionFactory;
import study.java.myschool.model.Professor;
import study.java.myschool.service.ProfessorService;
import study.java.myschool.service.impl.ProfessorserviceImpl;

public class Main04 {

	public static void main(String[] args) {
	
		Logger logger = LogManager.getFormatterLogger(Main04.class.getName());
		
		Professor prof = new Professor();
		prof.setProfno(9921);
		
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlSession();
		
		ProfessorService professorService = new ProfessorserviceImpl(sqlSession, logger);
		
		Professor result = null;
		
		try {
			result = professorService.getProfessorItem(prof);
			
			logger.debug("조회된 데이터 >> " + result.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sqlSession.close();
		
	}

}
