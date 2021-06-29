package study.spring.springhelper.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import study.spring.springhelper.model.Professor;
import study.spring.springhelper.service.ProfessorService;

@Service
@Slf4j
public class ProfessorServiceImpl implements ProfessorService {

	/** SqlSession 객체 주입 설정 **/
	@Autowired
	SqlSession sqlSession;

	/**
	 * 교수 데이터 상세 조회
	 * 
	 * @param Professor 조회할 교수의 일련번호를 담고있는 Beans
	 * @return 조회된 데이터가 저장된 Beans
	 * @throws Exception
	 */
	@Override
	public Professor getProfessorItem(Professor input) throws Exception {
		Professor result = null;

		try {
			result = sqlSession.selectOne("ProfessorMapper.selectItem", input);

			if (result == null) {
				throw new NullPointerException("result=null");
			}
		} catch (NullPointerException e) {
			log.error(e.getLocalizedMessage());
			throw new Exception("조회된 데이터가 없습니다.");
		} catch (Exception e) {
			log.error(e.getLocalizedMessage());
			throw new Exception("데이터 조회에 실패했습니다..");
		}

		return result;
	}

	/**
	 * 교수 데이터 목록조회
	 * 
	 * @param Professor 검색조건과 페이지 구현 정보를 담고 있는 Beans
	 * @return 조회 결과에 대한 컬렉션
	 * @throws Exception
	 */
	@Override
	public List<Professor> getProfessorsList(Professor input) throws Exception {
		List<Professor> result = null;

		try {
			result = sqlSession.selectList("ProfessorMapper.selectList", input);

			if (result == null) {
				throw new NullPointerException("result=null");
			}
		} catch (NullPointerException e) {
			log.error(e.getLocalizedMessage());
			throw new Exception("조회된 데이터가 없습니다.");
		} catch (Exception e) {
			log.error(e.getLocalizedMessage());
			throw new Exception("데이터 조회에 실패했습니다..");
		}

		return result;
	}

	/**
	 * 교수 데이터가 저장되어있는 갯수 조회
	 * 
	 * @param Professor 검색조건을 담고있는 Beans
	 * @return int
	 * @throws Exception
	 */
	@Override
	public int getProfessorCount(Professor input) throws Exception {
		int result = 0;

		try {
			result = sqlSession.selectOne("ProfessorMapper.selectCountAll", input);
		} catch (Exception e) {
			log.error(e.getLocalizedMessage());
			throw new Exception("데이터 조회에 실패했습니다..");
		}

		return result;
	}

	/**
	 * 교수 데이터 등록하기
	 * 
	 * @param Professor 저장할 정보를 담고있는 Beans
	 * @return int
	 * @throws Exception
	 */
	@Override
	public int addProfessor(Professor input) throws Exception {
		int result = 0;

		try {
			result = sqlSession.insert("ProfessorMapper.insertItem", input);

			if (result == 0) {
				throw new NullPointerException("result=0");
			}
		} catch (NullPointerException e) {
			log.error(e.getLocalizedMessage());
			throw new Exception("저장된 데이터가 없습니다.");
		} catch (Exception e) {
			log.error(e.getLocalizedMessage());
			throw new Exception("데이터 저장에 실패했습니다..");
		}

		return result;
	}

	/**
	 * 교수 데이터 수정
	 * 
	 * @param Professor 수정할 정보를 담고있는 Beans
	 * @return int
	 * @throws Exception
	 */
	@Override
	public int editProfessor(Professor input) throws Exception {
		int result = 0;

		try {
			result = sqlSession.update("ProfessorMapper.updateItem", input);

			if (result == 0) {
				throw new NullPointerException("result=0");
			}
		} catch (NullPointerException e) {
			log.error(e.getLocalizedMessage());
			throw new Exception("수정된 데이터가 없습니다.");
		} catch (Exception e) {
			log.error(e.getLocalizedMessage());
			throw new Exception("데이터 수정에 실패했습니다..");
		}

		return result;
	}

	/**
	 * 교수 데이터 삭제
	 * 
	 * @param Professor 삭제할 교수의 일련번호를 담고있는 Beans
	 * @return int
	 * @throws Exception
	 */
	@Override
	public int deleteProfessor(Professor input) throws Exception {
		int result = 0;

		try {
			// 교수 삭제전 자신을 참조하는 학생들의 profno 컬럼을 null로 수정
			sqlSession.update("StudentMapper.unsetProfessor", input);

			result = sqlSession.delete("ProfessorMapper.deleteItem", input);

			if (result == 0) {
				throw new NullPointerException("result=0");
			}
		} catch (NullPointerException e) {
			log.error(e.getLocalizedMessage());
			throw new Exception("삭제된 데이터가 없습니다.");
		} catch (Exception e) {
			log.error(e.getLocalizedMessage());
			throw new Exception("데이터 삭제에 실패했습니다..");
		}

		return result;
	}

}
