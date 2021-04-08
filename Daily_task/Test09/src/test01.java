import java.util.List;

import study.java.dao.ContactDao;
import study.java.dao.impl.FileContactDaoImpl;
import study.java.model.Contact;

public class test01 {

	public static void main(String[] args) {
		ContactDao dao = new FileContactDaoImpl();
		List<Contact> list = dao.getGradeList();

		for (int i = 0; i < list.size(); i++) {
			Contact item = list.get(i);
			System.out.println(item.toString());
		}

	}

}
