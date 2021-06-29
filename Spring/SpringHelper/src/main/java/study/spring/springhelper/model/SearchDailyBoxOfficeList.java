package study.spring.springhelper.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class SearchDailyBoxOfficeList {

	@SerializedName("boxOfficeResult")
	private BoxOfficeResult boxOfficeResult;

	@Data
	public class BoxOfficeResult {
		@SerializedName("boxofficeType")
		private String boxOfficeType;
		@SerializedName("showRange")
		private String showRange;
		@SerializedName("dailyBoxOfficeList")
		private List<DailyBoxOfficeList> dailyBoxOfficeList;
		
		@Data
		public class DailyBoxOfficeList {
			private int id;
			private String targetDt;
			private String regDate;
			private String editDate;
			
			@SerializedName("rank") private int rank;
			@SerializedName("rankInten") private int rankInten;
			@SerializedName("rankOldAndNew") private String rankOldAndNew;
			@SerializedName("movieCd") private String movieCd;
			@SerializedName("movieNm") private String movieNm;
			@SerializedName("openDt") private String openDt;
			@SerializedName("salesAmt") private long salesAmt;
			@SerializedName("salesShare") private double salesShare;
			@SerializedName("salesInten") private long salesInten;
			@SerializedName("salesChange") private double salesChange;
			@SerializedName("salesAcc") private long salesAcc;
			@SerializedName("audiCnt") private int audiCnt;
			@SerializedName("audiInten") private long audiInten;
			@SerializedName("audiChange") private double audiChange;
			@SerializedName("audiAcc") private int audiAcc;
			@SerializedName("scrnCnt") private int scrnCnt;
			@SerializedName("showCnt") private int showCnt;

		}
	}
}
