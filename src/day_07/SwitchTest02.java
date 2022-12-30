package day_07;

import java.util.Scanner;

public class SwitchTest02
{
	public static void main(String[] args)
	{	// month에 12월 대입
		// switch문으로 12월이 맞다면 지금은 12월입니다. 합니다.
		
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		int month = 12;
		String result = null;
		String msg = "몇월? : ";
		
		System.out.print(msg);
		choice = sc.nextInt();
		
		System.out.println(choice);
		
		int Middle = choice % 12 ;
		switch(Middle)
		{
		case 1:
			result = "errCode002 : overMonth";
			break;
		case 0:
			result = "12월 입니다";
			break;
		default:
			if (choice >= 13)
			{
				result = "errCode:002: overMonth";
			}
			else
			{
			result = "\"땡\" errCode:001";
			}
			break;
			}
			
		System.out.println(result);
		}

	}
