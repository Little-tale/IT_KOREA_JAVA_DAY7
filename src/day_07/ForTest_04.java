package day_07;

public class ForTest_04 {
	public static void main(String[] args)
	{
		// 1부터 100까지 출력
		// 짝수만
		// 100부터 1까지
		for (int i = 1; i<101; ++i )
		{
			System.out.println("1번 숫자 : "+i);
		}

		for (int i = 0; i<101; i+=2 )
		{			
			System.out.println("2번숫자 : "+i);
			// Test if문 없이 하는 법으로 수정됨으로 주석처리
			//System.out.println("숫자 : "+i);
		}
		
		for (int i = 100; i>=1; --i )
		{
			System.out.println("3번 숫자 : "+i);
		}
		char a = 64;
		for (int i = 0; i<26; ++i )
		{
			if(a%2==0)
			{
				System.out.println("알파벳 : "+(a+=1));
			}
			else
			{
				System.out.println((char)(a+=1));
			}
		}
		
	}

}
