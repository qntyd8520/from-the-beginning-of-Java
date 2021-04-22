import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import study.java.helloworld.MyBatisConnectionFactory;
import study.java.helloworld.model.Users;
import study.java.helloworld.service.UsersService;
import study.java.hellowrold.service.impl.UsersServiceImpl;

public class SignUp {

	public static void main(String[] args) {
		Users user = new Users();
		user.setRealname("김도운");
		user.setUsername("dududada");
		user.setPassword("0123456789");
		user.setEmail("dududada0717@gmail.com");
		user.setGender("M");
		user.setBirthdate("1996-07-17");
		user.setTel("01084400032");
		user.setPostcode("11111");
		user.setAddr1("경기도 성남시 수정구");
		user.setAddr2("산성역포레스티아");
		user.setIs_admin("Y");
		user.setReg_date("20210421");
		user.setEdit_date("20210422");

		Logger logger = LogManager.getFormatterLogger(SignUp.class.getName());
		
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlSession();
		
		UsersService userserivce = new UsersServiceImpl(sqlSession, logger);
		
		try {
			userserivce.addUsers(user);
			
			sqlSession.commit();
			
			logger.debug("회원가입 저장된 데이터 >> " + userserivce.toString());
		} catch(Exception e) {
			e.printStackTrace();
		}
		sqlSession.close();
	}

}
