package study.java.daoex.model;

public class Professor {
	private int profno;
	private String name;
	private String userid;
	private String position;
	private int sal;
	private String hiredate;
	private int comm;
	private int daptno;

	public Professor(int profno, String name, String userid, String position, int sal, String hiredate, int comm,
			int daptno) {
		super();
		this.profno = profno;
		this.name = name;
		this.userid = userid;
		this.position = position;
		this.sal = sal;
		this.hiredate = hiredate;
		this.comm = comm;
		this.daptno = daptno;
	}

	public int getProfno() {
		return profno;
	}

	public void setProfno(int profno) {
		this.profno = profno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	public int getComm() {
		return comm;
	}

	public void setComm(int comm) {
		this.comm = comm;
	}

	public int getDaptno() {
		return daptno;
	}

	public void setDaptno(int daptno) {
		this.daptno = daptno;
	}

	@Override
	public String toString() {
		return "Professor [profno=" + profno + ", name=" + name + ", userid=" + userid + ", position=" + position
				+ ", sal=" + sal + ", hiredate=" + hiredate + ", comm=" + comm + ", daptno=" + daptno + "]";
	}

}
