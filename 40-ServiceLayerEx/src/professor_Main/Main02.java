package professor_Main;

import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import study.java.myschool.MyBatisConnectionFactory;
import study.java.myschool.model.Professor;
import study.java.myschool.service.ProfessorService;
import study.java.myschool.service.impl.ProfessorserviceImpl;

public class Main02 {

	public static void main(String[] args) {
		
		Logger logger = LogManager.getFormatterLogger(Main02.class.getName());
		
		Professor prof = new Professor();
		prof.setProfno(9930);
		prof.setName("둘리");
		prof.setUserid("dully");
		prof.setPosition("부교수");
		prof.setSal(400);
		prof.setHiredate("2020-04-20");
		prof.setComm(40);
		prof.setDeptno(201);
		
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlSession();
		
		ProfessorService professorService = new ProfessorserviceImpl(sqlSession, null);
		
		try {
			professorService.editProfessor(prof);
			
			sqlSession.commit();
			
			logger.debug("수정된 데이터 >> " + professorService.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sqlSession.close();
		
	
	}

}
