package study.java.helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public class FileHelper {
	// 싱글톤 객체 생성 시작
	private static FileHelper current = null;

	public static FileHelper getInstance() {
		if (current == null) {
			current = new FileHelper();
		}
		return current;
	}

	public static void freeInstance() {
		current = null;
	}

	private FileHelper() {
		super();
	}


	// 싱글톤 객체 생성 끝}

	/**
	 * 주어진 경로에 data값을 기록하고 저장한다.
	 * 
	 * @param filePath, 저장할 파일 경로
	 * @param data      = 저장할 내용을 담은 스트림
	 * @return 성공시 true 실패시 false
	 */
	public boolean write(String fillpath, byte[] data) {
		boolean result = false;
		/** 파일 저장 절차 시작 */
		// finally 블록에서 인식하기 위해서 선언부를 위로 이동
		OutputStream out = null;
		try {
			out = new FileOutputStream(fillpath);
			out.write(data); // 파일 쓰기
			System.out.println("[INFO] 파일 저장 성공 >> " + fillpath);
			// 저장에 성공하였으므로, 결과값을 true로 변경
			result = true;
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] 지정된 경로를 찾을 수 없음. >> " + fillpath);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROE] 파일 저장 실패 >> " + fillpath);
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("[ERROR] 알 수 없는 에러 >> " + fillpath);
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
		return result;
	}

	/**
	 * 주어진 경로를 파악하고 파일을 읽고, 내용을 스트림으로 리턴한다
	 * 
	 * @param filePath - 읽어야 할 파일의 경로
	 * @return 읽혀진 내용
	 */
	public byte[] read(String filePath) {
		byte[] data = null;
		/** 파일 읽기 */
		InputStream in = null;
		try {
			in = new FileInputStream(filePath);
			
			// 읽은 내용을 담기위한배열은 파일의 용량만큼 사이즈를 할당한다.
			// in.available() --> 열고 있는 파일의 크기
			data = new byte[in.available()];
			// 파일읽기
			in.read(data);
			System.out.println("[INFO] 파일 읽기 성공 >> " + filePath);
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] 지정된 경로를 찾을 수 없음. >> " + filePath);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROR] 파일 읽기 실패 >> " + filePath);
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("[ERROR] 알 수 없는 에러 >> " + filePath);
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close(); // 파일 스트림 닫기
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} 
		return data;
	}

	/**
	 * 파일을 저장한다.
	 * 
	 * @param filePath - 저장할 파일 경로
	 * @param content  - 저장할 내용
	 * @param encType  - 인코딩 형식
	 * @return boolean - 성공시 true, 실패시 false
	 */
	public boolean writeString(String filePath, String content, String encType) {
		boolean result = false;
		byte[] data = null;

		try {
			data = content.getBytes(encType);
		} catch (UnsupportedEncodingException e) {
			System.out.println("[ERROR] 인코딩 지정 에러");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("[ERROR] 알 수 없는 에러 >> " + filePath);
			e.printStackTrace();
		}
		result = this.write(filePath, data);
		return result;
	}

	/**
	 * 파일의 내용을 문자열로 리턴한다.
	 * 
	 * @param filePath - 읽어야 할 파일의 경로
	 * @param encType  - 인코딩 형식
	 * @return String - 읽은 내용에 대한 문자열
	 */
	public String readString(String filePath, String encType) {
		String content = null;

		byte[] data = this.read(filePath);

		// 내용을 문자열로 변환한다.
		try {
			content = new String(data, encType);
			content = content.trim();
		} catch (UnsupportedEncodingException e) {
			System.out.println("[ERROR] 인코딩 지정 에러");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("[ERROR] 알 수 없는 에러 >> " + filePath);
			e.printStackTrace();
		}
		return content;
	}
	}
