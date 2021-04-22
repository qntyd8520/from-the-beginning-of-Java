package study.java.hellowrold.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.Logger;

import study.java.helloworld.model.Users;
import study.java.helloworld.service.UsersService;

public class UsersServiceImpl implements UsersService{
		
	/** 처리 결과를 기록할 Log4J객체 생성 **/
	Logger logger;
	
	/** MyBatis의 Mapper를 호출하기 위한 SqlSession객체 **/
	 SqlSession sqlSession;
	
	/** 생성자.SqlSession 을 전달 받는다. **/
	public UsersServiceImpl(SqlSession sqlSession, Logger logger) {
		this.sqlSession = sqlSession;
		this.logger = logger;
	}

	@Override
	public void addUsers(Users users) throws Exception {
		
		try {
			int result = sqlSession.insert("UsersMapper.add_users", users);
			// 저장된 데이터가 없으면 강제로 예외 발생
			if (result == 0) {
				throw new NullPointerException();
			}
		} catch(NullPointerException e) {
			sqlSession.rollback();
			throw new Exception("저장된 데이터가 없습니다.");
		} catch(Exception e) {
			sqlSession.rollback();
			logger.error(e.getLocalizedMessage());
			throw new Exception("데이터 저장에 실패했습니다.");
		} finally { 
			sqlSession.toString();
		} 
	}	
	
	/** 유저정보 수정하기 **/
	@Override
	public void editUsers(Users users) throws Exception {
		try {
			int result = sqlSession.update("UsersMapper.edit_users", users);
			if (result == 0) {
				throw new NullPointerException();
			}
		} catch (NullPointerException e) {
			sqlSession.rollback();
			throw new Exception("변겅된 데이터가 없습니다.");
		} catch (Exception e) {
			sqlSession.rollback();
			logger.error(e.getLocalizedMessage());
			throw new Exception("데이터 수정에 실패했습니다.");
		} finally {
			sqlSession.toString();
		}
	}
	
	/** 유저정보 삭제하기 **/
	@Override
	public void deleteUsers(Users users) throws Exception {
		try {
			int result = sqlSession.delete("UsersMapper.remove_users", users);
			if ( result == 0) {
				throw  new NullPointerException();
			}
		} catch (NullPointerException e) {
			sqlSession.rollback();
			throw new Exception("삭제된 데이터가 없습니다.");
		} catch (Exception e) {
			sqlSession.rollback();
			logger.error(e.getLocalizedMessage());
			throw new Exception("데이터 삭제에 실패했습니다.");
		} finally {
			sqlSession.toString();
		}
	}
	
	/** 유저정보 단일행 조회 **/
	@Override
	public Users getUsersItem(Users users) throws Exception {
		Users result = null;
		
		try {
			result = sqlSession.selectOne(
					"UsersMapper.get_users_item", users);
			if (result == null) {
				throw new NullPointerException();
			}
		}catch (NullPointerException e) {
			throw new Exception("조회된 데이터가 없습니다.");
		}catch (Exception e) {
			logger.error(e.getLocalizedMessage());
			throw new Exception("데이터 조회에 실패했습니다.");
		}
		
		return result;
	}
	
	/** 유저 로그인 정보조회 **/
	@Override
	public Users getUsersLogin(Users users) throws Exception {
		Users result = null;
		
		try {
			result = sqlSession.selectOne(
					"UsersMapper.get_users_login", users);
			if (result == null) {
				throw new NullPointerException();
			}
		}catch (NullPointerException e) {
			throw new Exception("조회된 데이터가 없습니다.");
		}catch (Exception e) {
			logger.error(e.getLocalizedMessage());
			throw new Exception("데이터 조회에 실패했습니다.");
		}
		
		return result;
	}

	/** 유저정보 다중행 조회 **/
	@Override
	public List<Users> getUsersList() throws Exception {
		List<Users> result = null;
		
		try {
			result = sqlSession.selectList("UsersMapper.get_users_list", null);
			if(result == null) {
				throw new NullPointerException();
			}
		} catch(NullPointerException e) {
			throw new Exception("조회된 데이터가 없습니다.");
		} catch(Exception e) {
			logger.error(e.getLocalizedMessage());
			throw new Exception("데이터 조회에에 실패했습니다.");
		}
		return result;
	}
	
	
}
