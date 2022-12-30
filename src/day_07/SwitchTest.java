package day_07;

import java.util.Scanner;

import javax.swing.DefaultListCellRenderer;

public class SwitchTest
{	public static void main(String[] args)
	{	// 1부터 200까지 입력받아 입력받은 값이 짝수인지 홀수인지 확인하기
	
	Scanner sc = new Scanner(System.in);
	int choice = 0;
	String result = null;
	String msg = "1부터 200까지 정수 입력 : ";
	
	System.out.println(msg);
	choice = sc.nextInt();
	
	System.out.println(choice);
	
	int Middle = choice % 2 ;
	switch(Middle)
	{
	case 1:
		result = "홀수 입니다.";
		break;
	case 0:
		result = "짝수 입니다.";
		break;
	default:
		result = "errCode:001";
		}
		
	System.out.println(result);
	}

}
