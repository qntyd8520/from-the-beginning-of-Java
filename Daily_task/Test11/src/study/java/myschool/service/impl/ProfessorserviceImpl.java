package study.java.myschool.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.Logger;

import study.java.myschool.model.Professor;
import study.java.myschool.service.ProfessorService;

public class ProfessorserviceImpl implements ProfessorService  {
	
	/** 처리 결과를 기록할 Log4J객체 생성 **/
	Logger logger;
	
	/** MyBatis의 Mapper를 호출하기 위한 SqlSession객체 **/
	 SqlSession sqlSession;
	
	/** 생성자.SqlSession 을 전달 받는다. **/
	public ProfessorserviceImpl(SqlSession sqlSession, Logger logger) {
		this.sqlSession = sqlSession;
		this.logger = logger;
	}
	
	/** 교수 저장하기 -> 저장 후 저장된 결과를 조회하여 리턴.**/
	@Override
	public void addProfessor(Professor professor)
			throws Exception {
		try {
			int result = sqlSession.insert("ProfessorMapper.add_professor", professor);
			// 저장된 데이터의 행 수가 없을 경우 강제로 예외 발생
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
		
	/** 교수정보 수정하기 **/
	@Override
	public void editProfessor(Professor professor) 
			throws Exception {
		try {
			int result = sqlSession.update("ProfessorMapper.edit_professor", professor);
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

	@Override
	public void deleteProfessor(Professor professor) 
			throws Exception {
		try {
			int result = sqlSession.delete("ProfessorMapper.remove_professor", professor);
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
	
	/** 교수정보 단일행 조회하기 **/
	@Override
	public Professor getProfessorItem(Professor professor) 
			throws Exception {
		Professor result = null;
		
		try {
			result = sqlSession.selectOne(
					"ProfessorMapper.get_professor_item", professor);
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

	@Override
	public List<Professor> getProfessorList() 
			throws Exception {
		List<Professor> result = null;
		
		try {
			result = sqlSession.selectList("ProfessorMapper.get_professor_list", null);
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
