import java.util.List;

import study.java.dao.GradeDao;
import study.java.dao.impl.FileGradeDaoImpl;
import study.java.model.Grade;

// 완성된 기능을 사용하기위한 Main클래스 CSV 파일을 사용

public class Main01 {

	public static void main(String[] args) {
		GradeDao dao = new FileGradeDaoImpl();
		List<Grade> list = dao.getGradeList();
		
		for (int i = 0; i < list.size(); i++) {
			Grade item = list.get(i);
			System.out.println(item.toString());
		}
	}

}
