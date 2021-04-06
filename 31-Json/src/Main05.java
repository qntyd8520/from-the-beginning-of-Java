import org.json.JSONArray;
import org.json.JSONObject;

import study.java.helper.FileHelper;
import study.java.model.News;

// 배열이 존재하는 계층까지 접근하여 JSONArray객체 생성
// 계층적 반복 데이터 구조

public class Main05 {

	public static void main(String[] args) {
		// 파일로부터 JSONObject 객체 생성
		String source = FileHelper.getInstance().readString("res/05.json", "utf-8");
		
		JSONObject json = new JSONObject(source);
		JSONObject rss = json.getJSONObject("rss");
		JSONArray item = rss.getJSONArray("item"); // 배열접근
		
		// 배열 데이터이므로 반복문 안에서 처리해야 한다.
		for(int i = 0; i < item.length(); i ++) {
			JSONObject temp = item.getJSONObject(i);
			
			// 데이터 추출
			String title = temp.getString("title");
			String description = temp.getString("description");
			String pubDate = temp.getString("pubDate");
			
			News news = new News(title, description, pubDate);
			System.out.println(news.toString());
		}
	}

}
