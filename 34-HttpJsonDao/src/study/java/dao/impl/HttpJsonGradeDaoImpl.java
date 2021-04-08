package study.java.dao.impl;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import study.java.dao.GradeDao;
import study.java.helper.HttpHelper;
import study.java.helper.JsonHelper;
import study.java.model.Grade;

// JSONObject의 데이터 추출 처리

public class HttpJsonGradeDaoImpl implements GradeDao{
	@Override
	public List<Grade> getGradeList(){
		
		// 여러개의 객체를 저장하기 위한 컬렉션
		List<Grade> list = new ArrayList<Grade>();
		
		// JSON파일을 읽어서 객체로 변환
		InputStream is = HttpHelper.getInstance().getWebData(
				"http://itpaper.co.kr/demo/java/grade.json", "utf-8");
		
		// 통신 결과가 없다면 처리 중단
		if ( is == null) {
			System.out.println("데이터 다운로드 실패");
			return null;
		}
		
		// 통신 결과를 JSON으로 변환
		JSONObject json = JsonHelper.getInstance().getJsonObject(is, "utf-8");
		
		// 원하는 데이터에 접근하기
		JSONObject grade = json.getJSONObject("grade");
		JSONArray member = grade.getJSONArray("member");
		
		// 배열의 항목 수 만큼 반복
		for (int i = 0; i < member.length(); i++) {
			// 배열의 각 요소 추출
			JSONObject obj = member.getJSONObject(i);
			// 값 추출
			String name = obj.getString("name");
			int kor = obj.getInt("kor");
			int eng = obj.getInt("eng");
			int math = obj.getInt("math");
			// 추출한 값을 객체화 하여 List에 추가
			list.add(new Grade(name, kor, eng, math));
		}
		return list;
	}

}
