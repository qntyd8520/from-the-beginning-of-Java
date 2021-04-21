package study.java.myschool.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.Logger;
import study.java.myschool.model.Student;
import study.java.myschool.service.StudentService;

public class StudentserviceImpl implements StudentService{
	
	/** 처리 결과를 기록할 Lof4J객체 생성 **/
	Logger logger;
	
	/** MyBatis의 Mapper를 호출하기 위한 SqlSession객체 **/
	 SqlSession sqlSession;
	
	/** 생성자.SqlSession 을 전달 받는다. **/
	public StudentserviceImpl(SqlSession sqlSession, Logger logger) {
		this.sqlSession = sqlSession;
		this.logger = logger;
	}
	
	/** 학생 저장하기 -> 저장후 저장된 결과를 조회하여 리턴.**/
	@Override
	public void addStudent(Student student) throws Exception {
		
		// 저장된 데이터의 행 수가 없을경우 강제로 예외발생
		try{
			int result = sqlSession.insert("StudentMapper.add_student", student);
			if(result == 0) {
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
	
	/** 학생정보 수정하기 **/
	@Override
	public void editStudent(Student student) throws Exception {
		try {
			int result = sqlSession.update("StudentMapper.edit_student", student);
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
	
	/** 학생정보 삭제하기 **/
	@Override
	public void deleteStudent(Student student) throws Exception {
		try {
			int result = sqlSession.delete("StudentMapper.remove_student", student);
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
	
	/** 학생정보 단일행 조회하기 **/
	@Override
	public Student getStudentItem(Student student) throws Exception {
		Student result = null;
		
		try {
			result = sqlSession.selectOne(
					"StudentMapper.get_student_item", student);
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
	/** 학생정보 전체 조회 (다중행) **/
	@Override
	public List<Student> getStudentList() throws Exception {
		List<Student> result = null;
		
		try {
			result = sqlSession.selectList("StudentMapper.get_student_list", null);
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
