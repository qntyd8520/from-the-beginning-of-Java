import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import study.java.helloworld.MyBatisConnectionFactory;
import study.java.helloworld.model.Users;
import study.java.helloworld.service.UsersService;
import study.java.hellowrold.service.impl.UsersServiceImpl;

public class UpdateUserInfo {

	public static void main(String[] args) {
		
		Logger logger = LogManager.getFormatterLogger(UpdateUserInfo.class.getName());
		
		Users user = new Users();
		user.setId(1);
		user.setRealname("김도운");
		user.setUsername("ddudda");
		user.setPassword("9876543210");
		user.setEmail("ddudda0717@naver.com");
		user.setGender("M");
		user.setBirthdate("19961111");
		user.setTel("01012345678");
		user.setPostcode("7777");
		user.setAddr1("경기도 군포시 산본동");
		user.setAddr2(null);
		user.setIs_admin("N");
		user.setReg_date("20210323");
		user.setEdit_date("20210422");
		
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlSession();
		
		UsersService usersService = new UsersServiceImpl(sqlSession, null);
		
		try {
			usersService.editUsers(user);
			
			sqlSession.commit();
			
			logger.debug("수정된 데이터 >> " + usersService.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sqlSession.close();
		
	
	}

}
