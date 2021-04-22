package professor_Main;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import study.java.myschool.MyBatisConnectionFactory;
import study.java.myschool.model.Professor;
import study.java.myschool.service.ProfessorService;
import study.java.myschool.service.impl.ProfessorserviceImpl;

public class Main05 {

	public static void main(String[] args) {
	
		Logger logger = LogManager.getFormatterLogger(Main05.class.getName());
		
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlSession();
		
		ProfessorService professorService = new ProfessorserviceImpl(sqlSession, logger);
		
		List<Professor> result = null;
		
		try {
			result = professorService.getProfessorList();
			
			for (int i = 0; i < result.size(); i++) {
				Professor temp = result.get(i);
				logger.debug(String.format("조회결과[%d] >> %s", i, temp.toString()));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sqlSession.close();
		
	}

}
