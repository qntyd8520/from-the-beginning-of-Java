package study.java.myschool.service;

import java.util.List;

import study.java.myschool.model.Professor;

public interface ProfessorService {
	
	// 교수 정보를 새로 저장하고 저장된 정보를 조회하여 리턴
	public void addProfessor(Professor professor)
			throws Exception;
	
	// 교수 정보를 수정하고, 수정된 정보를 조회하여 리턴
	public void editProfessor(Professor professor)
			throws Exception;
	
	// 교수 정보를 삭제하기
	public void deleteProfessor(Professor professor)
			throws Exception;
	
	// 교수정보중 하나의 정보만 조회하여 리턴
	public Professor getProfessorItem(Professor professor)
			throws Exception;
	
	// 교수 목록을 전체 조회하여 리턴 (다중 행)
	public List<Professor> getProfessorList()
			throws Exception;
}
