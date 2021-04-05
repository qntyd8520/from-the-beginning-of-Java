import java.util.HashMap;
import java.util.Map;

// 숫자 값을 보관하기 위한 Map생성하기

public class Main01 {

	public static void main(String[] args) {
		// 데이터를 저장할 배열 생성
		// 제너릭 --> < 값의 이름, 값의 종류 > 여기서 <>는 제너릭스라고한다
		Map<String, Integer> hm = new HashMap<String, Integer>();

		// 데이터 추가는 put메서드 사용
		// --> 중복을 허용하지 않는다.
		hm.put("aaa", 111);
		hm.put("bbb", 222);
		hm.put("aaa", 444);
		hm.put("ccc", 333);
		hm.put("ccc", null); // 객체를 넣는 것이므로 Null 사용 가능

		// 저장된 갯수 얻기
		System.out.println("HashMap size : " + hm.size());

		// 데이터 꺼내기
		System.out.println(hm.get("aaa"));
		System.out.println(hm.get("bbb"));
		System.out.println(hm.get("ccc"));

	}

}
