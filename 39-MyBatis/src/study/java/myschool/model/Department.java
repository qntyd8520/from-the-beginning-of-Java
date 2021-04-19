package study.java.myschool.model;

/** department 테이블 구조에 맞춘 Java Beans 생성 **/
// 기본 생성자 사용을 위해서 별도의 생성자는 생략한다.
public class Department {
	private int deptno;
	private String dname;
	private String loc;

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Department [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}
	
	
}
