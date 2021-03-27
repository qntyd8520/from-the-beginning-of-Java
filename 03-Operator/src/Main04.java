
public class Main04 {

	public static void main(String[] args) {
		// 모두다 같은 +1씩 증가하는 식이다
		// 계산 대상 값이 1인 경우 += / ++ 같은 증감 연산자로 사용
		int plus_num = 1;
		plus_num = plus_num +1;
		plus_num += 1;
		plus_num++;
		++plus_num;
		System.out.println(plus_num);
		
		// 모두다 같은 -1씩 감소하는 식이다
		// 계산 대상 값이 1인 경우 -= / -- 같은 증감 연산자로 사용
				int minus_num = 5;
		minus_num = minus_num -1;
		minus_num -= 1;
		minus_num--;
		--minus_num;
		System.out.println(minus_num);
	}

}
