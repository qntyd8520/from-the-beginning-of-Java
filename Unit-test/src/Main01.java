
import java.util.List;

import study.java.dao.ParkingItemDao;
import study.java.dao.impl.ParkingItemDaoImpl;
import study.java.helper.FileHelper;
import study.java.model.ParkingItem;

public class Main01 {

	public static void main(String[] args) {
		String keyword = "강남";

		ParkingItemDao dao = new ParkingItemDaoImpl();
		List<ParkingItem> list = dao.getParkingList(keyword);

		if (list == null) {
			System.out.println("데이터 수신 실패");
			return;
		}
		
	
		String text = "주차장명,주소,주차장 종류명,운영구분명,전화번호,주차 가능대수,"
				+ "유무료 구분명,기본주차요금,기본주차시간(분),추가요금단위,추가단위시간(분)," 
				+ "토요일 유무료구분,공휴일 유무료구분\n";
		for (int i = 0; i < list.size(); i++) {
			ParkingItem item = list.get(i);

			// 값 추출
			String Parking_Name = item.getParking_Name();
			String Addr = item.getAddr();
			String Parking_Type_Nm = item.getParking_Type_Nm();
			String Operation_Rule_Nm = item.getOperation_Rule_Nm();
			String Tel = item.getTel();
			int Capacity = item.getCapacity();
			String Pay_Nm = item.getPay_Nm();
			int Rates = item.getRates();
			int Time_Rate = item.getTime_Rate();
			int Add_Rates = item.getAdd_Rates();
			int Add_Time_Rate = item.getAdd_Time_Rate();
			String Saturday_Pay_Nm = item.getSaturday_Pay_Nm();
			String Holiday_Pay_Nm = item.getHoliday_Pay_Nm();
			
			text += Parking_Name + "," + Addr + "," + Parking_Type_Nm + "," 
			+ Operation_Rule_Nm + "," + Tel + "," + Capacity + "," + Pay_Nm + "," 
			+ Rates + "," + Time_Rate + "," + Add_Rates + "," + Add_Time_Rate + 
			"," + Saturday_Pay_Nm + "," + Holiday_Pay_Nm + "\n";

			System.out.println(text);
		}
			
		String fileName = keyword + "주차장정보" + ".csv";

		boolean is = FileHelper.getInstance().writeString(fileName, text, "euc-kr");

		if (is) {
		System.out.println(fileName + " 저장성공");
		}

	}

}
