// 구구단 만들기 2~9단
import study.java.helper.MyMathHelper;

public class test01 {

	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			MyMathHelper.getInstance().gugu(i);
			
			if(i+1<10) {
				System.out.println("---------------");
			}
		}
	}

}
