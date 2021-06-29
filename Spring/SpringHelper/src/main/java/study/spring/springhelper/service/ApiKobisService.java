package study.spring.springhelper.service;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import study.spring.springhelper.model.SearchDailyBoxOfficeList;

public interface ApiKobisService {
	public static final String BASE_URL = "http://kobis.or.kr";

	@GET("/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=dffa171d2f17e258126c57f05bd9fc81")
	Call<SearchDailyBoxOfficeList> getSearchDailyBoxOfficeList(@Query("targetDt") String targetDt);

}
