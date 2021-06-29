package study.spring.springhelper.service;

import java.util.List;

import study.spring.springhelper.model.Professor;

public interface ProfessorService {
	/**
	 * 교수 데이터 상세 조회
	 * @param Professor 조회할 교수의 일련번호를 담고있는 Beans
	 * @return 조회된 데이터가 저장된 Beans
	 * @throws Exception
	 */
	public Professor getProfessorItem(Professor input) throws Exception;
	
	
	/**
	 * 교수 데이터 목록조회
	 * @param Professor 검색조건과 페이지 구현 정보를 담고 있는 Beans
	 * @return 조회 결과에 대한 컬렉션
	 * @throws Exception
	 */
	public List<Professor> getProfessorsList(Professor input) throws Exception;
	
	/**
	 * 교수 데이터가 저장되어있는 갯수 조회
	 * @param Professor 검색조건을 담고있는 Beans
	 * @return int
	 * @throws Exception
	 */
	public int getProfessorCount(Professor input) throws Exception;
	
	/**
	 * 교수 데이터 등록하기
	 * @param Professor 저장할 정보를 담고있는 Beans
	 * @return int
	 * @throws Exception
	 */
	public int addProfessor(Professor input) throws Exception;
	
	/**
	 * 교수 데이터 수정
	 * @param Professor 수정할 정보를 담고있는 Beans
	 * @return int
	 * @throws Exception
	 */
	public int editProfessor(Professor input) throws Exception;
	
	/**
	 * 교수 데이터 삭제
	 * @param Professor 삭제할 교수의 일련번호를 담고있는 Beans
	 * @return int
	 * @throws Exception
	 */
	public int deleteProfessor(Professor input) throws Exception;
}
