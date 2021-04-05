import java.util.Calendar;

// java.util.calendar 클래스의 기본 사용방법

public class Main01 {

	public static void main(String[] args) {
		// 캘린더 객체의 생성 -- > 싱글톤 객체
		Calendar cal = Calendar.getInstance();
		
		// 년, 월, 일, 시, 분, 초 >> 24시간제
		int yy = cal.get(Calendar.YEAR);
		// 자바에서 월은 0부터 시작한다.
		int mm = cal.get(Calendar.MONTH) + 1;
		int dd = cal.get(Calendar.DAY_OF_MONTH);
		int hh = cal.get(Calendar.HOUR_OF_DAY);
		int mi = cal.get(Calendar.MINUTE);
		int ss = cal.get(Calendar.SECOND);
		
		System.out.printf("%04d년 %02d월 %02d일 %02d시 %02d분 %02d초\n", 
				yy, mm, dd, hh, mi, ss);
		
		// 년, 월, 일, 시, 분, 초 >> 12시간제
			yy = cal.get(Calendar.YEAR);
			// 자바에서 월은 0부터 시작한다.
			mm = cal.get(Calendar.MONTH) + 1;
			dd = cal.get(Calendar.DAY_OF_MONTH);
			hh = cal.get(Calendar.HOUR);
			mi = cal.get(Calendar.MINUTE);
			ss = cal.get(Calendar.SECOND);
			
			// 오전(=0), 오후(=1)
			int ampm = cal.get(Calendar.AM_PM);
			String[] apname = {"오전", "오후"};
			
			System.out.printf("%04d년 %02d월 %02d일 %s %02d시 %02d분 %02d초\n", 
						yy, mm, dd, apname[ampm], hh, mi, ss);
			
		// 현재날짜 + 시각을 yyyymmddhhmiss 형식으로 출력
			yy = cal.get(Calendar.YEAR);
			mm = cal.get(Calendar.MONTH) + 1;
			dd = cal.get(Calendar.DAY_OF_MONTH);
			hh = cal.get(Calendar.HOUR_OF_DAY);
			mi = cal.get(Calendar.MINUTE);
			ss = cal.get(Calendar.SECOND);
			
			System.out.printf("%04d%02d%02d%02d%02d%02d", 
					yy, mm, dd, hh, mi, ss);
	}
}


