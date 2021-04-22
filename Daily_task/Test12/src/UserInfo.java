import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import study.java.helloworld.MyBatisConnectionFactory;
import study.java.helloworld.model.Users;
import study.java.helloworld.service.UsersService;
import study.java.hellowrold.service.impl.UsersServiceImpl;

public class UserInfo {

	public static void main(String[] args) {
			
			Logger logger = LogManager.getFormatterLogger(UserInfo.class.getName());
			
			Users user = new Users();
			user.setId(1);
			
			SqlSession sqlSession = MyBatisConnectionFactory.getSqlSession();
			
			UsersService userService = new UsersServiceImpl(sqlSession, logger);
			
			Users result = null;
			
			try {
				result = userService.getUsersItem(user);
				
				logger.debug("죄회된 데이터 >> " + result.toString());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sqlSession.close();
		}
}
