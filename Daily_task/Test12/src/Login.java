import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import study.java.helloworld.MyBatisConnectionFactory;
import study.java.helloworld.model.Users;
import study.java.helloworld.service.UsersService;
import study.java.hellowrold.service.impl.UsersServiceImpl;



public class Login {

	public static void main(String[] args) {
		
		Logger logger = LogManager.getFormatterLogger(Login.class.getName());
		
		Users user = new Users();
		user.setUsername("dududada");
		user.setPassword("0123456789");
		
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlSession();
		
		UsersService userService = new UsersServiceImpl(sqlSession, logger);
		
		Users result = null;
		
		try {
			result = userService.getUsersLogin(user);
			
			logger.debug("로그인된 데이터 >> " + result.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sqlSession.close();
	}

}
