import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

// 문자열을 파일로 저장하기 ( 쓰기 )
public class Main02 {

	public static void main(String[] args) {
		// 저장할 파일의 경로
		final String PATH = "./test.txt"; // 사용중일때 수정 불가하도록 final선언

		// 파일에 저장할 내용
		String write_string = "가나다라마바사아자차카타파하 아야어여우유으이 ABCDefg";

		/** 특정 인코딩 방식 적용 */
		// utf-8방식으로 인코딩을 받기때문에 byte형태로 배열선언 이후 예외처리 적용
		byte[] buffer = null;
		try {
			buffer = write_string.getBytes("utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/** 파일 저장 절차 시작 */
		
		// finally 블록에서 인식하기 위해서 선언부를 위로 이동
		OutputStream out = null;
		try {
			out = new FileOutputStream(PATH);
			out.write(buffer); 			// 파일 쓰기
			System.out.println("[INFO] 파일 저장 성공 >> " + PATH);
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] 지정된 경로를 찾을 수 없음. >> " + PATH);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROE] 파일 저장 실패 >> " + PATH);
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("[ERROR] 알 수 없는 에러 >> " + PATH);
			e.printStackTrace();
		} finally {
			if (out != null) {
				try {
					out.close(); // 저장여부 상관없이 스트림 닫기
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
