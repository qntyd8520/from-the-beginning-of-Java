// list와 JavaBeans 를 활용한 데이터 리스트 만들기

public class People {

	private String name;
	private String phoneNo;
	public People(String name, String phoneNo) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "People [name=" + name + ", phoneNo=" + phoneNo + "]";
	}
	
	
	
}
