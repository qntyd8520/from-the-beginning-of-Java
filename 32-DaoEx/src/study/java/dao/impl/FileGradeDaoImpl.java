// 인터페이스의 기능 구현을 위한 클래스 작성

package study.java.dao.impl;

import java.util.ArrayList;
import java.util.List;

import study.java.dao.GradeDao;
import study.java.helper.FileHelper;
import study.java.model.Grade;

public class FileGradeDaoImpl implements GradeDao {

	/**
	 * 어떤 객체가 생성되었는지 확인하기 위하여 클래스 이름을 출력한다.
	 */
	public FileGradeDaoImpl() {
		String clsName = this.getClass().getCanonicalName();
		System.out.println("--------" + clsName + "--------");
	}

	@Override
	public List<Grade> getGradeList() {
		// 리턴할 객체 선언
		List<Grade> list = null;
		
		// CSV파일 읽기
		String source = FileHelper.getInstance().readString("res/grade.csv", "euc-kr");
		
		// 읽을 내용이 없다면 강제 종료
		if (source == null) {
			return null;
		}
		
		// 읽은 내용이 있다면 리턴할 List를 할당
		list = new ArrayList<Grade>();
		
		/** (1) 라인단위로 분리 --> 학생별 데이터 */
		String[] data = source.split("\n");
		
		/** (2) 학생 수 만큼 반복처리 */
		for (int i = 0; i < data.length; i++) {
			/** (3) 한명의 데이터 추출 */
			String line_string = data[i].trim();
			
			/** (4) 한명의 데이터를 과목별로 분리 */
			String[] line_data = line_string.split(",");
			
			/** (5) 분리한 데이터 추출 */
			String name = line_data[0];
			int kor = Integer.parseInt(line_data[1]);
			int eng = Integer.parseInt(line_data[2]);
			int math = Integer.parseInt(line_data[3]);
			
			/** (6) 분리한 데이터를 객체로 변환 후 컬렉션에 추가 */
			Grade item = new Grade(name, kor, eng, math);
			list.add(item);
		}

		// 리턴값을 선언된 객체로 변경
		return list;
	}

}
