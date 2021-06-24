package study.spring.simplespring.model;

import lombok.Data;

/** 테이블 구조에 맞춘 Java Beans 생성 **/
@Data
public class Department {
	private int deptno;
	private String dname;
	private String loc;
	
	/** 페이지 구현이 필요한 경우 아래 속성들을 추가한다. (static) **/
	private static int offset; // LIMIT 절에서 사용할 검색 시작 위치
	private static int listCount; // LIMIT 절에서 사용할 검색할 데이터 수
	
	public static int getOffset() {
		return offset;
	}
	
	public static void setOffset(int offset) {
		Department.offset = offset;
	}
	
	public static int getListCount() {
		return listCount;
	}
	
	public static void setListCount(int listCount) {
		Department.listCount = listCount;
	}
	
}
