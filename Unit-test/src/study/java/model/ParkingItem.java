package study.java.model;

public class ParkingItem {
	private String Parking_Name = null;
	private String Addr = null;
	private String Parking_Type_Nm = null;
	private String Operation_Rule_Nm = null;
	private String Tel = null;
	private int Capacity = 0;
	private String Pay_Nm = null;
	private int Rates = 0;
	private int Time_Rate = 0;
	private int Add_Rates = 0;
	private int Add_Time_Rate = 0;
	private String Saturday_Pay_Nm = null;
	private String Holiday_Pay_Nm = null;

	public ParkingItem(String parking_Name, String addr, String parking_Type_Nm, String operation_Rule_Nm, String tel,
			int capacity, String pay_Nm, int rates, int time_Rate, int add_Rates, int add_Time_Rate,
			String saturday_Pay_Nm, String holiday_Pay_Nm) {
		super();
		Parking_Name = parking_Name;
		Addr = addr;
		Parking_Type_Nm = parking_Type_Nm;
		Operation_Rule_Nm = operation_Rule_Nm;
		Tel = tel;
		Capacity = capacity;
		Pay_Nm = pay_Nm;
		Rates = rates;
		Time_Rate = time_Rate;
		Add_Rates = add_Rates;
		Add_Time_Rate = add_Time_Rate;
		Saturday_Pay_Nm = saturday_Pay_Nm;
		Holiday_Pay_Nm = holiday_Pay_Nm;
	}

	public String getParking_Name() {
		return Parking_Name;
	}

	public void setParking_Name(String parking_Name) {
		Parking_Name = parking_Name;
	}

	public String getAddr() {
		return Addr;
	}

	public void setAddr(String addr) {
		Addr = addr;
	}

	public String getParking_Type_Nm() {
		return Parking_Type_Nm;
	}

	public void setParking_Type_Nm(String parking_Type_Nm) {
		Parking_Type_Nm = parking_Type_Nm;
	}

	public String getOperation_Rule_Nm() {
		return Operation_Rule_Nm;
	}

	public void setOperation_Rule_Nm(String operation_Rule_Nm) {
		Operation_Rule_Nm = operation_Rule_Nm;
	}

	public String getTel() {
		return Tel;
	}

	public void setTel(String tel) {
		Tel = tel;
	}

	public int getCapacity() {
		return Capacity;
	}

	public void setCapacity(int capacity) {
		Capacity = capacity;
	}

	public String getPay_Nm() {
		return Pay_Nm;
	}

	public void setPay_Nm(String pay_Nm) {
		Pay_Nm = pay_Nm;
	}

	public int getRates() {
		return Rates;
	}

	public void setRates(int rates) {
		Rates = rates;
	}

	public int getTime_Rate() {
		return Time_Rate;
	}

	public void setTime_Rate(int time_Rate) {
		Time_Rate = time_Rate;
	}

	public int getAdd_Rates() {
		return Add_Rates;
	}

	public void setAdd_Rates(int add_Rates) {
		Add_Rates = add_Rates;
	}

	public int getAdd_Time_Rate() {
		return Add_Time_Rate;
	}

	public void setAdd_Time_Rate(int add_Time_Rate) {
		Add_Time_Rate = add_Time_Rate;
	}

	public String getSaturday_Pay_Nm() {
		return Saturday_Pay_Nm;
	}

	public void setSaturday_Pay_Nm(String saturday_Pay_Nm) {
		Saturday_Pay_Nm = saturday_Pay_Nm;
	}

	public String getHoliday_Pay_Nm() {
		return Holiday_Pay_Nm;
	}

	public void setHoliday_Pay_Nm(String holiday_Pay_Nm) {
		Holiday_Pay_Nm = holiday_Pay_Nm;
	}

	@Override
	public String toString() {
		return "ParkingItem [Parking_Name=" + Parking_Name + ", Addr=" + Addr + ", Parking_Type_Nm=" + Parking_Type_Nm
				+ ", Operation_Rule_Nm=" + Operation_Rule_Nm + ", Tel=" + Tel + ", Capacity=" + Capacity + ", Pay_Nm="
				+ Pay_Nm + ", Rates=" + Rates + ", Time_Rate=" + Time_Rate + ", Add_Rates=" + Add_Rates
				+ ", Add_Time_Rate=" + Add_Time_Rate + ", Saturday_Pay_Nm=" + Saturday_Pay_Nm + ", Holiday_Pay_Nm="
				+ Holiday_Pay_Nm + "]";
	}

}
