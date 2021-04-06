import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

// 저장된 파일의 내용을 읽어서 출력하기

public class Main03 {

	public static void main(String[] args) {
		// 읽을 파일의 경로
		final String PATH = "./test.txt";
		
		// 읽은 내용이 담겨질 스트림
		byte[] data = null;
		
		// 읽은 내용이 변환될 문자열
		String read_string = null;
		
		/** 파일 읽기 */
		InputStream in = null;
		try {
			in = new FileInputStream(PATH);
			
			// 읽은 내용을 담기 위한 배열은 파일의 용량만큼 사이즈를 할당한다.
			// in.available() --> 열고 있는 파일의 크기
			data = new byte[in.available()];
			
			// 파일 읽기 - 파라미터로 전달된 배열 안에, 파일의 내용을 담아준다.
			in.read(data);
			
			System.out.println("[INFO] 파일 읽기 성공 >> " + PATH);
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] 지정된 경로를 찾을 수 없음. >> " + PATH);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROR] 파일 읽기 실패 >> " + PATH);
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("[ERROR] 알 수 없는 에러 >> " + PATH);
			e.printStackTrace();
		} finally {
			if ( in != null) {
				try{
					in.close();			// 파일 스트림 닫기
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} // end try ~ cathch ~ finally
		
		// data 배열에 내용이 있다면, 문자열로 변환하여 출력
		if (data != null) {
			// 문자여로 변환시에는 저장된 인코딜을 지정해준다
			try {read_string = new String(data, "utf-8");
			System.out.println(read_string);
		} catch  (UnsupportedEncodingException e) {
			System.out.println("[ERROR] 인코딩 지정 에러" + PATH);
			/// end if 
			
			}
	}
	}
}

