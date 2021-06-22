package study.spring.simplespring.model;

import lombok.Data;

/** 테이블 구조에 맞춘 Java Beans 생성 **/
@Data
public class Department {
	private int deptno;
	private String dname;
	private String loc;
	
	
}
