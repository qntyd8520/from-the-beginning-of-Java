import org.json.JSONObject;

import study.java.helper.FileHelper;
import study.java.model.News;

// JSON데이터를 Java Beans 객체로 변환하기
// 계층 구조를 갖는 JSON 데이터

public class Main04 {

	public static void main(String[] args) {
		// 파일로부터 JSONObject 객체 생성
		String source = FileHelper.getInstance().readString("res/04.json", "utf-8");
		JSONObject json = new JSONObject(source);
		JSONObject rss = json.getJSONObject("rss");
		JSONObject item = rss.getJSONObject("item");
		
		// 데이터 추출
		String title = item.getString("title");
		String description = item.getString("description");
		String pubDate = item.getString("pubDate");
		
		News news = new News(title, description, pubDate);
		System.out.println(news.toString());
	}

}
