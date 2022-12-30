package day_07;

import java.util.Scanner;

import javax.swing.DefaultListCellRenderer;

public class WhileTestOper {

	public static void main(String[] args)
	{
		//당신의 MBTI는?
		 String msg = "당신의 mbti는?\r\n"
		         + "1. ISFJ   - 차분하고 인내심이 강하다.\r\n"
		         + "2. INFJ   - 통찰력이 높고 사람들에게 영감을 준다.\r\n"
		         + "3. ESFP   - 호기심이 많고 개발적이다.\r\n"
		         + "4. ENTJ   - 철저히 준비하고 활동적이다.\r\n";
		 String isfj = "차분하고 인내심이 강하다.";        
		 String INFJ = "통찰력이 높고 사람들에게 영감을 준다.";
		 String ESFP = "호기심이 많고 개발적이다.";
		 String ENTJ = "철저히 준비하고 활동적이다.";
		 
		 String result = null ;
		 
		 Scanner sc = new Scanner(System.in);
		 int choice = 0;
		 
		 System.out.println(msg);
		 choice = sc.nextInt();
		 
		 switch (choice)
		 {
		 case 1:
			result = isfj;
			 	break;
		 
		case 2:
			result = INFJ;
				break;
		case 3:
			result = ESFP;
				break;
		case 4:
			result = ENTJ;
				break;
			
		default : 
			break;
		 }
			System.out.println(result);
				
	 }
		 
		 
		 
	}

