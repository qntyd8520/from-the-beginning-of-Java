package professor_Main;

import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import study.java.myschool.MyBatisConnectionFactory;
import study.java.myschool.model.Professor;
import study.java.myschool.service.ProfessorService;
import study.java.myschool.service.impl.ProfessorserviceImpl;

public class Main01 {

	public static void main(String[] args) {
		
		Professor prof = new Professor();
		prof.setName("둘리");
		prof.setUserid("ddochi");
		prof.setPosition("교수");
		prof.setSal(333);
		prof.setHiredate("2021-04-20");
		prof.setComm(33);
		prof.setDeptno(305);
		
		Logger logger = LogManager.getFormatterLogger(Main01.class.getName());
		
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlSession();
		
		ProfessorService professorService = new ProfessorserviceImpl(sqlSession, null);
		
		try {
			professorService.addProfessor(prof);
			
			sqlSession.commit();
			
			logger.debug("저장된 데이터 >> " + professorService.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		sqlSession.close();
		
	}

}
