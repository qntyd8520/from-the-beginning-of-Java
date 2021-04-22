import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import study.java.helloworld.MyBatisConnectionFactory;
import study.java.helloworld.model.Users;
import study.java.helloworld.service.UsersService;
import study.java.hellowrold.service.impl.UsersServiceImpl;

public class UserList {

	public static void main(String[] args) {
	
		Logger logger = LogManager.getFormatterLogger(UserList.class.getName());
		
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlSession();
		
		UsersService usersService = new UsersServiceImpl(sqlSession, logger);
		
		List<Users> result = null;
		
		try {
			result = usersService.getUsersList();
			
			for (int i = 0; i < result.size(); i++) {
				Users temp = result.get(i);
				logger.debug(String.format("전체 회원 목록 조회 결과[%d] >> %s", i, temp.toString()));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sqlSession.close();
		
	}

}
