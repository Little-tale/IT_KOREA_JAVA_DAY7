package day_07;

public class ForTest02 {
	public static void main(String[] args)
	{
		a:for(int i = 10; true; --i)
		{
			System.out.println("김재형 해야하는 남은 횟수 : " + i);
			//무한 루프 ;true; 도 가능
			if(i <= 0) // 이게 조건식이 되는 것이다@^@
			{
				break a;
			}
			// 순서 초기값 확인 -> 조건식 확인 -> 증감식 작동 -> 출력 ->
		}
	}

}
