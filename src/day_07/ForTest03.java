package day_07;

public class ForTest03 {

	public static void main(String[] args) {
		// 1~100 합 출력
		int total = 0;
		//int i =0;
		for(int i =0 ; i<100; ++i) // 선치로 버릇 들어놔야 실무에서 효율적
		{
			total = total+i ;
			System.out.println(total);
			// C++ 에서는 for문에서 선언된것은 포문안에서만 사용 가능하다로 알고 있는데
			// 자바에서는 포문안에서 생성된 i를 포문안에서도 이해를 못한다.
			
			// 아니였다. ㅠ
		}

	}

}
