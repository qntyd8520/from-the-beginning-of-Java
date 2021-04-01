import javax.sound.midi.SysexMessage;

import study.java.helper.Util;

// 완성된 기능의 활용

public class Main04 {

	public static void main(String[] args) {
		/** 5자리의 인증번호 생성하기 */
		String authNum = "";

		for (int i = 0; i < 6; i++) {
			authNum += Util.getInstance().random(0, 9);
		}

		System.out.println("인증번호 = " + authNum);
	}

}
