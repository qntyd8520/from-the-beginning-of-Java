import java.util.List;

import study.java.dao.GradeDao;
import study.java.dao.impl.JsonGradeDaoImpl;
import study.java.model.Grade;

// 완성된 기능을 사용하기 위한 main클래스 JSON 파일을 이용
public class Main02 {

	public static void main(String[] args) {
		GradeDao dao = new JsonGradeDaoImpl(); // CSV를 사용때는 File이붙었는데 Json을사용할때는 
		List<Grade> list = dao.getGradeList(); // Json이 붙었다 GradeDaoImpl 앞에!!
		
		for (int i=0; i < list.size(); i++) {
			Grade item = list.get(i);
			System.out.println(item.toString());
		}
	}

}
