package study.java.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import study.java.dao.ContactDao;
import study.java.helper.FileHelper;
import study.java.model.Contact;

public class JsonContactDaoImpl implements ContactDao {

	/**
	 * 어떤 객체가 생성되었는지 확인하기 위하여 클래스 이름을 출력한다.
	 */
	public JsonContactDaoImpl() {
		String clsName = this.getClass().getCanonicalName();
		System.out.println("--------" + clsName + "--------");
	}

	@Override
	public List<Contact> getGradeList() {
		// 리턴할 객체 선언
		List<Contact> list = null;

		// JSON파일 읽기
		String source = FileHelper.getInstance().readString("Contact.json", "utf-8");

		// 읽은 내용이 없다면 강제 종료
		if (source == null) {
			return null;
		}

		// 읽은 내용이 있다면 리턴할 List를 할당
		list = new ArrayList<Contact>();

		/** (1) 읽은 내용을 JSON 객체로 변환 */
		JSONObject json = new JSONObject(source);

		/** (2) 배열데이터 추출 --> 학생별 데이터 */
		JSONArray Contact = json.getJSONArray("Contact");

		/** (3) 학생 수 만큼 반복처리 */
		for (int i = 0; i < Contact.length(); i++) {
			/** (4) 한명의 데이터 추출 */
			JSONObject temp = Contact.getJSONObject(i);

			/** (5) 분리한 데이터 추출 */
			String name = temp.getString("name");
			String phone = temp.getString("phone");
			String email = temp.getString("email");

			/** (6) 분리한 데이터를 객체로 변환 후 컬렉션에 추가 */
			Contact item = new Contact(name, phone, email);
			list.add(item);
		}
		// 리턴값을 선언된 객체로 변경
		return list;
	}

}
