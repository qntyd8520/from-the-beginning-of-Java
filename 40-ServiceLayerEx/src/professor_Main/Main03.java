package professor_Main;

import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import study.java.myschool.MyBatisConnectionFactory;
import study.java.myschool.model.Professor;
import study.java.myschool.service.ProfessorService;
import study.java.myschool.service.impl.ProfessorserviceImpl;

public class Main03 {
	
	public static void main(String[] args) {
	
		Logger logger = LogManager.getFormatterLogger(Main03.class.getName());
		
		Professor prof = new Professor();
		prof.setProfno(9930);
		
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlSession();
		
		ProfessorService professorService = new ProfessorserviceImpl(sqlSession, null);
		
		try {
			professorService.deleteProfessor(prof);
			
			sqlSession.commit();
			
			logger.debug("데이터 삭제 완료.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sqlSession.close();
		
	}

}
