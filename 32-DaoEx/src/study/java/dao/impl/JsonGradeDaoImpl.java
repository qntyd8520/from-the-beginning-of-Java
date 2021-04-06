package study.java.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import study.java.dao.GradeDao;
import study.java.helper.FileHelper;
import study.java.model.Grade;

public class JsonGradeDaoImpl implements GradeDao {

	/**
	 * 어떤 객체가 생성되었는지 확인하기 위하여 클래스 이름을 출력한다.
	 */
	public JsonGradeDaoImpl() {
		String clsName = this.getClass().getCanonicalName();
		System.out.println("--------" + clsName + "--------");
	}

	@Override
	public List<Grade> getGradeList() {
		// 리턴할 객체 선언
		List<Grade> list = null;
		
		// JSON파일 읽기
		String source = FileHelper.getInstance().readString("res/grade.json", "utf-8");
		
		// 읽은 내용이 없다면 강제 종료
		 if (source == null) {
			 return null;
		 }
		 
		// 읽은 내용이 있다면 리턴할 List를 할당
		list = new ArrayList<Grade>();
		
		/** (1) 읽은 내용을 JSON 객체로 변환 */
		JSONObject json = new JSONObject(source);
		
		/** (2) 배열데이터 추출 --> 학생별 데이터 */
		JSONArray grade = json.getJSONArray("grade");
		
		/** (3) 학생 수 만큼 반복처리 */
		for (int i = 0; i < grade.length(); i++) {
			/** (4) 한명의 데이터 추출 */
			JSONObject temp = grade.getJSONObject(i);
						
			/** (5) 분리한 데이터 추출 */
			String name = temp.getString("name");
			int kor = temp.getInt("kor");
			int eng = temp.getInt("eng");
			int math = temp.getInt("math");
			
			/** (6) 분리한 데이터를 객체로 변환 후 컬렉션에 추가 */
			Grade item = new Grade(name, kor, eng, math);
			list.add(item);
		}
		// 리턴값을 선언된 객체로 변경
		return list;
	}

	}
	