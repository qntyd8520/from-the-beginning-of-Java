// DAO의 기능 설계를 위한 인터페이스 정의하기

package study.java.dao;

import java.util.List;

import study.java.model.Grade;

/** 학생별 성적 리스트 구현에 대한 설계 
 * @param <Grade>*/
public interface GradeDao {
	/**
	 * 데이터파일을 읽어들인 후, 파일안에 저장된 데이터를
	 * JavaBeans 객체로 변환하여 List에 담아 리턴한다.
	 * @param <Grade>
	 * @return Grade형의 객체가 담긴 컬렉션
	 */
	public List<Grade> getGradeList();
}
