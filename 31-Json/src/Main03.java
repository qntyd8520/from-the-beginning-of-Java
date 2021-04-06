import org.json.JSONArray;
import org.json.JSONObject;

import study.java.helper.FileHelper;

// JSONArray 객체의 사용
// 배열 데이터를 포함한 JSON데이터
public class Main03 {

	public static void main(String[] args) {
		// 파일로부터 JSONObject객체 생성
		String source = FileHelper.getInstance().readString("res/03.json", "utf-8");
		JSONObject json = new JSONObject(source);
		
		// 배열 구조는 JSONArray 객체로 추출한다.
		JSONArray array = json.getJSONArray("item");
		
		// 배열의 길이 만큼 반복
		for (int i = 0; i < array.length(); i++) {
			// i번째 요소를 추출 --> 포함된 데이터가 문자열이므로 형변환
			String item = String.valueOf(array.get(i));
			System.out.println(item);
		}
	}

}
