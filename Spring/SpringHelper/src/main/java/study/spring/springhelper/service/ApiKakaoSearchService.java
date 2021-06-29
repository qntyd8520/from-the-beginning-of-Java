package study.spring.springhelper.service;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;
import study.spring.springhelper.model.Image;

public interface ApiKakaoSearchService {

	public static final String BASE_URL = "https://dapi.kakao.com";

	/*
	 * curl -v -X GET "https://dapi.kakao.com/v2/search/image" \ --data-urlencode
	 * "query=설현" \ -H "Authorization: KakaoAK {REST_API_KEY}"
	 */
	@Headers("Authorization: KakaoAK f4a8121ce977a43eee8fc5de78c18f5f")
	@GET("/v2/search/image")
	Call<Image> getImage(@Query("query") String query, @Query("page") int page, @Query("size") int size);
}
