package study.java.dao.impl;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import study.java.dao.ParkingItemDao;
import study.java.helper.HttpHelper;
import study.java.helper.JsonHelper;
import study.java.model.ParkingItem;

public class ParkingItemDaoImpl implements ParkingItemDao {

	@Override
	public List<ParkingItem> getParkingList(String keyword) {
		List<ParkingItem> list = null;

		// 검색어
		String search = null;

		/** 한글일 경우 URLEncodig 처리 **/
		try {
			search = URLEncoder.encode(keyword, "utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 서울시 공영주차장 OpenAPI 주소
		String url = "http://openapi.seoul.go.kr:8088/4250784943716e74395561746148/json/GetParkInfo/1/1000/" + search;

		// JSON파일을 읽어서 객체로 변환
		// --> URL과 HTTP Header 데이터를 함께 전달.
		InputStream is = HttpHelper.getInstance().getWebData(url, "utf-8", null);

		// 통신 결과가 없으면 중단
		if (is == null) {
			System.out.println("데이터 다운로드 실패");
			return null;
		}

		// 통신에 성공했으면, 리턴할 List 할당
		list = new ArrayList<ParkingItem>();

		// 통신 결과를 JSON으로 변환
		JSONObject json = JsonHelper.getInstance().getJsonObject(is, "utf-8");
		// 원하는 데이터에 접근하기
		JSONObject GetParkInfo = json.getJSONObject("GetParkInfo");
		JSONArray row = GetParkInfo.getJSONArray("row");

		// 배열의 항목 수만큼 반복
		for (int i = 0; i < row.length(); i++) {
			// 배열의 각요소 추출
			JSONObject item = row.getJSONObject(i);

			// 값 추출

			String Parking_Name = item.getString("PARKING_NAME");
			String Addr = item.getString("ADDR");
			String Parking_Type_Nm = item.getString("PARKING_TYPE_NM");
			String Operation_Rule_Nm = item.getString("OPERATION_RULE_NM");
			String Tel = item.getString("TEL");
			int Capacity = item.getInt("CAPACITY");
			String Pay_Nm = item.getString("PAY_NM");
			int Rates = item.getInt("RATES");
			int Time_Rate = item.getInt("TIME_RATE");
			int Add_Rates = item.getInt("ADD_RATES");
			int Add_Time_Rate = item.getInt("ADD_TIME_RATE");
			String Saturday_Pay_Nm = item.getString("SATURDAY_PAY_NM");
			String Holiday_Pay_Nm = item.getString("HOLIDAY_PAY_NM");

			// 추출한 값을 객체화 하여 LIST추가
			list.add(new ParkingItem(Parking_Name, Addr, Parking_Type_Nm, Operation_Rule_Nm, Tel, Capacity, Pay_Nm,
					Rates, Time_Rate, Add_Rates, Add_Time_Rate, Saturday_Pay_Nm, Holiday_Pay_Nm));
		}
		return list;
		
	}

}
