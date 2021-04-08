// 인터페이스의 기능 구현을 위한 클래스 작성

package study.java.dao.impl;

import java.util.ArrayList;
import java.util.List;

import study.java.dao.ContactDao;
import study.java.helper.FileHelper;
import study.java.model.Contact;

public class FileContactDaoImpl implements ContactDao {

	/**
	 * 어떤 객체가 생성되었는지 확인하기 위하여 클래스 이름을 출력한다.
	 */
	public FileContactDaoImpl() {
		String clsName = this.getClass().getCanonicalName();
		System.out.println("--------" + clsName + "--------");
	}

	@Override
	public List<Contact> getGradeList() {
		// 리턴할 객체 선언
		List<Contact> list = null;

		// CSV파일 읽기
		String source = FileHelper.getInstance().readString("Contact.csv", "euc-kr");

		// 읽을 내용이 없다면 강제 종료
		if (source == null) {
			return null;
		}

		// 읽은 내용이 있다면 리턴할 List를 할당
		list = new ArrayList<Contact>();

		String[] data = source.split("\n");

		for (int i = 0; i < data.length; i++) {
			String line_string = data[i].trim();

			String[] line_data = line_string.split(",");

			String name = line_data[0];
			String phone = line_data[1];
			String email = line_data[2];

			/** 분리한 데이터를 객체로 변환 후 컬렉션에 추가 */
			Contact item = new Contact(name, phone, email);
			list.add(item);
		}

		// 리턴값을 선언된 객체로 변경
		return list;
	}

}
