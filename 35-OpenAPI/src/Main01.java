import java.io.InputStream;
import java.util.Calendar;
import java.util.List;

import study.java.dao.ImageDao;
import study.java.dao.impl.ImageDaoImpl;
import study.java.helper.FileHelper;
import study.java.helper.HttpHelper;
import study.java.model.ImageItem;

public class Main01 {

	public static void main(String[] args) {
		ImageDao dao = new ImageDaoImpl();
		List<ImageItem> list = dao.getImageSerchList("노르웨이숲고양이");
		
		if (list == null) {
			System.out.println("데이터 수신 실패");
			return;
		}
		for (int i = 0; i< list.size(); i++) {
			ImageItem item = list.get(i);
			
			// 썸네일 이미지의 주소
			String img_url = item.getThumbnail_url();
			
			// 썸네일 주소를 다시 다운로드 받음
			// --> HTTP헤더는 필요 없으므로 null로 지정한다.
			InputStream bin = HttpHelper.getInstance().getWebData(img_url, "utf-8", null);
			
			// 저장을 위한 파일이름 (현재 시각에 대한 타임스탬프를 적용한다.)
			long ms = Calendar.getInstance().getTimeInMillis();
			String fileName = ms + ".jpg";
			
			// 다운받은 결과를 byte 배열로 변환
			byte[] data = null;
			try {
				data = new byte[bin.available()];
				bin.read(data);
			} catch (Exception e) {
				e.printStackTrace();
			}
			boolean is = FileHelper.getInstance().write(fileName, data);
			
			if (is) {
				System.out.println(fileName + " 저장성공");
			}
		}
	}

}
