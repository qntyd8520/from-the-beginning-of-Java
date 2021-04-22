import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import study.java.helloworld.MyBatisConnectionFactory;
import study.java.helloworld.model.Users;
import study.java.helloworld.service.UsersService;
import study.java.hellowrold.service.impl.UsersServiceImpl;

public class DeleteUser {

	public static void main(String[] args) {
	
		Logger logger = LogManager.getFormatterLogger(DeleteUser.class.getName());
		
		Users user = new Users();
		user.setId(1);
		
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlSession();
		
		UsersService usersService = new UsersServiceImpl(sqlSession, null);
		
		try {
			usersService.deleteUsers(user);
			
			sqlSession.commit();
			
			logger.debug("데이터 삭제 완료.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sqlSession.close();
		
	}

}
