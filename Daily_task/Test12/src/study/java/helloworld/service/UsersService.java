package study.java.helloworld.service;

import java.util.List;

import study.java.helloworld.model.Users;

public interface UsersService {

	// 유저 정보를 저장하고 저장된 정보를 조회하여 리턴
	public void addUsers(Users users)
			throws Exception;
	
	// 유저 정보를 수정하고 수정된 정보를 조회하여 리턴
	public void editUsers(Users users)
			throws Exception;
	
	// 유저 정보를 삭제
	public void deleteUsers(Users users)
			throws Exception;
	
	// 유저 정보중 하나만 조회하여 리턴
	public Users getUsersItem(Users users)
			throws Exception;
	
	// 유저 로그인중 하나만 조회하여 리턴
		public Users getUsersLogin(Users users)
				throws Exception;
	
	// 유저 정보를 전체 조회하여 리턴 (다중행)
	public List<Users> getUsersList()
			throws Exception;
}
