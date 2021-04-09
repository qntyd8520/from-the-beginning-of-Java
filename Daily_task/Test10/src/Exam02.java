import java.util.List;

import study.java.dao.WebSearchDao;
import study.java.dao.impl.WebSearchDaoImpl;
import study.java.helper.FileHelper;
import study.java.model.WebSearchItem;

public class Exam02 {

	public static void main(String[] args) {

		String keyword = "자바프로그래밍";
		WebSearchDao dao = new WebSearchDaoImpl();
		List<WebSearchItem> list = dao.getWebSerchList(keyword);

		if (list == null) {
			System.out.println("데이터 수신 실패");
			return;
		}

		String text = "";
		for (int i = 0; i < list.size(); i++) {
			WebSearchItem item = list.get(i);
			String title = item.getTitle();
			String publisher = item.getPublisher();
			int price = item.getPrice();
			int sale_price = item.getSale_price();

			text += title + "," + publisher + "," + price + "," + sale_price + "\n";

			System.out.print(title + ", ");
			System.out.print(publisher + ", ");
			System.out.print(price + ", ");
			System.out.print(sale_price);
			System.out.println();
		}
		String fileName = keyword + ".csv";

		boolean is = FileHelper.getInstance().writeString(fileName, text, "euc-kr");

		if (is) {
			System.out.println(fileName + " 저장성공");
		}
	}

}
