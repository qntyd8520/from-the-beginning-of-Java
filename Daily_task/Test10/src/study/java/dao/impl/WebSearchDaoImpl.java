package study.java.dao.impl;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

import study.java.dao.WebSearchDao;
import study.java.helper.HttpHelper;
import study.java.helper.JsonHelper;
import study.java.model.WebSearchItem;

public class WebSearchDaoImpl implements WebSearchDao{


	@Override
	public List<WebSearchItem> getWebSerchList(String keyword) {
		List<WebSearchItem> list = null;
		
		// 검색어
		String search = null;
		
		/** 한글일 경우 URLEncodig 처리 **/
		try {
			search = URLEncoder.encode(keyword, "utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Kakao OpenAPI 주소
		String url = "https://dapi.kakao.com/v3/search/book?target=title&query=" + search;
		
		// 발급 받은 REST API키를 "Kakao API REST_API_KEY" 형식으로 정의
		Map<String, String> header = new HashMap<String, String>();
		header.put("Authorization", "KakaoAK f4a8121ce977a43eee8fc5de78c18f5f");
		
		// JSON파일을 읽어서 객체로 변환
		// --> URL과 HTTP Header 데이터를 함께 전달.
		InputStream is = HttpHelper.getInstance().getWebData(url, "utf-8", header);
		
		// 통신 결과가 없으면 중단
		if (is == null) {
			System.out.println("데이터 다운로드 실패");
			return null;
		}
		
		// 통신에 성공했으면, 리턴할 List 할당
		list = new ArrayList<WebSearchItem>();
		
		// 통신 결과를 JSON으로 변환
		JSONObject json = JsonHelper.getInstance().getJsonObject(is, "utf-8");
		// 원하는 데이터에 접근하기
		JSONArray documents = json.getJSONArray("documents");

		// 배열의 항목 수만큼 반복
		for (int i = 0; i < documents.length(); i++) {
			// 배열의 각요소 추출
			JSONObject item = documents.getJSONObject(i);
			
			String authors = "";
			JSONArray authorsArray = item.getJSONArray("authors");
			for (int j = 0; j < authorsArray.length(); j++) {
				authors += authorsArray.getString(j);
			}
			
			String translators = "";
			JSONArray translatorsArray = item.getJSONArray("translators");
			for (int j = 0; j < translatorsArray.length(); j++) {
				translators += translatorsArray.getString(j);
			}
			
			
			// 값 추출
			String contents = item.getString("contents");
			String datetime = item.getString("datetime");
			String isbn = item.getString("isbn");
			int price = item.getInt("price");
			String publisher = item.getString("publisher");
			int sale_price = item.getInt("sale_price");
			String status = item.getString("status");
			String thumbnail = item.getString("thumbnail");
			String title = item.getString("title");
			String doc_url = item.getString("url");
			
			// 추출한 값을 객체화 하여 LISt추가
			list.add(new WebSearchItem(authors, contents, datetime, isbn, price,
					publisher, sale_price, status, thumbnail, title,
					translators, doc_url));
					
					
		}
		return list;
	}
}


