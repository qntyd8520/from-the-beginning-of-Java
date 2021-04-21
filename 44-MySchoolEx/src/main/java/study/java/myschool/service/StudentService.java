package study.java.myschool.service;

import java.util.List;

import study.java.myschool.model.Student;

public interface StudentService {

	// 학생 정보를 새로 저장하고 저장된 정보를 조회하여 리턴
	public void addStudent(Student student) throws Exception;
	
	// 학생 정보를 수정하고, 수정된 정보를 조회하여 리턴
	public void editStudent(Student student) throws Exception;
	
	// 학생 정보를 삭제하기
	public void deleteStudent(Student student) throws Exception;
	
	// 학생정보중 하나의 정보만 조회 (단일행)
	public Student getStudentItem(Student student) throws Exception;
	
	// 학생 목록을 전체 조회하여 리턴 (다중행)
	public List<Student> getStudentList() throws Exception;
}
