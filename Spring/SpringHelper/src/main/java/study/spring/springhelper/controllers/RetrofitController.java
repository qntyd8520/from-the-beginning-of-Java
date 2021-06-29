package study.spring.springhelper.controllers;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import retrofit2.Call;
import retrofit2.Retrofit;
import study.spring.springhelper.helper.RetrofitHelper;
import study.spring.springhelper.helper.WebHelper;
import study.spring.springhelper.model.Image;
import study.spring.springhelper.model.SearchDailyBoxOfficeList;
import study.spring.springhelper.model.SearchDailyBoxOfficeList.BoxOfficeResult.DailyBoxOfficeList;
import study.spring.springhelper.service.ApiKakaoSearchService;
import study.spring.springhelper.service.ApiKobisService;

@Controller
public class RetrofitController {
	@Autowired
	WebHelper webHelper;

	@Autowired
	RetrofitHelper retrofitHelper;

	/** 영화 진흥원 연동결과를 그래프로 표시하는 페이지 **/
	@RequestMapping(value = "/retrofit/daily_box_office.do", method = RequestMethod.GET)
	public String dailyBoxOffice(Model model, @RequestParam(required = false) String date) {

		/** 1) API 연동 객체 생성 **/
		// Retrofit 객체 생성
		Retrofit retrofit = retrofitHelper.getRetrofit(ApiKobisService.BASE_URL);

		// Serivte 객체를 생성한다. 구현체는 자동생성
		ApiKobisService apiKobisService = retrofit.create(ApiKobisService.class);

		/** 2) 검색 파라미터 처리 **/
		if (date == null) {
			Calendar c = Calendar.getInstance();
			c.add(Calendar.DAY_OF_MONTH, -1);

			date = String.format("%04d-%02d-%02d", c.get(Calendar.YEAR), c.get(Calendar.MONTH) + 1,
					c.get(Calendar.DAY_OF_MONTH));
		}

		/** 3) 영화 진흥원에 API 요청 **/
		// 영화진흥원 API 전달할 날짜형식은 yyymmdd 이므로 준비된날짜에서 "-"를 제거한다.
		String targetDt = date.replace("-", "");

		// 영화진흥원 OpenAPI를 통해 검색결과 받아오기
		Call<SearchDailyBoxOfficeList> call = apiKobisService.getSearchDailyBoxOfficeList(targetDt);
		SearchDailyBoxOfficeList searchDailyBoxOfficeList = null;
		try {
			searchDailyBoxOfficeList = call.execute().body();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 변수명이 너무길어서 별도로 참조변수 생성
		List<DailyBoxOfficeList> list = null;

		// 검색결과가 있다면 list만 추출
		if (searchDailyBoxOfficeList != null) {
			list = searchDailyBoxOfficeList.getBoxOfficeResult().getDailyBoxOfficeList();
		}

		/** 4) 그래프 출력을 위한 JS 코드에서 사용할 문자열 만들기 **/
		int size = list.size(); // 리스트의 길이 저장
		String[] audiCnt = new String[size]; // 관람객 수를 저장할 배열
		String[] movieNm = new String[size]; // 영화 제목을 저장할 배열

		for (int i = 0; i < size; i++) {
			DailyBoxOfficeList item = list.get(i); // List에서 i번째 항목 추출
			movieNm[i] = "'" + item.getMovieNm() + "'"; // 영화 제목을 배열에 원소로 저장
			audiCnt[i] = String.valueOf(item.getAudiCnt()); // 관람객수를 배열에 원소로 저장
		}

		String movieNmStr = String.join(", ", movieNm); // 콤마를 기준으로 문자열 연결
		String audiCntStr = String.join(", ", audiCnt); // 콤마를 기준으로 문자열 연결

		/** 5) View 처리 **/
		// 사용자가 dropdwon에 지정한 값 (yyyy-mm-dd)
		model.addAttribute("date", date);
		// 영화진흥원에 전달하기 위한 검색 날짜 값 (yyyymmdd)
		model.addAttribute("targetDt", targetDt);
		// 박스오피스 순위 목록
		model.addAttribute("list", list);
		// 그래프에 적용할 영화 제목 배열
		model.addAttribute("movieNmStr", movieNmStr);
		// 그래프에 적용할 관람객 수 배열
		model.addAttribute("audiCntStr", audiCntStr);

		// view 경로지정
		return "retrofit/daily_box_office";
	}

	/** 카카오 이미지 검색결과를 연동하는 페이지 **/
	@RequestMapping(value = "/retrofit/kakao_image_search.do", method = RequestMethod.GET)
	public String kakaoImageSearch(Model model, @RequestParam(required = false, defaultValue = "") String query) {
		/** 1) API 연동 객체 생성 **/
		// Retrofit 객체 생성 
		Retrofit retrofit = retrofitHelper.getRetrofit(ApiKakaoSearchService.BASE_URL);
		
		// Service 객체를 생성한다. 구현체는 Retrofit이 자동으로 생성해준다.
		ApiKakaoSearchService apiKakaoSearchService = retrofit.create(ApiKakaoSearchService.class);

		/** 2) API 연동 **/
		// 검색결과를 저장할 Beans 객체 선언
		Image image = null;
		
		// 검색어가 존재할 경우 KakaoAPI를 통해서 검색결과를 받아옴.
		if (!query.equals("")) {
			Call<Image> call = apiKakaoSearchService.getImage(query, 1, 50);
			
			try {
				image = call.execute().body();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		/** 3) View 처리 **/
		model.addAttribute("query", query);
		model.addAttribute("image", image);
		return "retrofit/kakao_image_search";

	}
}
