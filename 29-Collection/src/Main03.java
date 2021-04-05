import java.util.ArrayList;
import java.util.List;

// people클래스에 해당하는 메인클래스

public class Main03 {

	public static void main(String[] args) {
		/** List를 사용하는 가장 일반적인 방법은,
		 *  사용자 정의 클래스에 대한 객체를 포함하도록
		 *  지정하는 것이다.
		 */
		
		// 객체를 담기위한 ArrayList
		List<People> plist = new ArrayList<People>();
		
		// 10명의 데이터를 임의로 추가함
		for (int i = 0; i < 10; i++) {
			People p = new People("회원" + i, "010-1234-567" + i);
			plist.add(p);
		}
		// 출력하기
		for (int i = 0; i < plist.size(); i++) {
			// List에 저장된 데이터를 하나 꺼내면,
			// People 클래스 형의 객체다.
			People item = plist.get(i);
			System.out.println(item.toString());
		}
		
		
	}

}
