package org.test.www;
import java.util.*;

public class fortictactoe3 {
	public static void main(String[] args) {
		/*
		Scanner s = new Scanner(System.in);
		String name = "";
		for (int i = 0; i < args.length; i++) {
			System.out.print("좌표를 입력해 주세요: ");
			name += args[i];
		}
		System.out.println("입력된 좌표는 " + name);
		
		*/
		
		Scanner s = new Scanner(System.in);
		String coordinate = null;
		// String a = "종료";
		//String A = sc;
		
		while(true) {
			String prompt = "좌표를 입력해 주세요: ";
			System.out.print(prompt);			
			
			String input = s.nextLine();
			
			input = input.trim();
			//lastStr = String.valueOf(sc).charAt(0);
			//String A = sc;
			
			coordinate = input.split(",");
			
			String command = coordinate.trim();
			
			
			if("".equals(command)) continue;
		
			command = command.toLowerCase();
			
			if(command.equals("종료")) {
				System.out.println("좌표 입력을 종료합니다.");
				System.exit(0);
			} else if (coordinate.length == 2 ) {
				System.out.println("입력된 좌표는 "+sc.substring(1,5));					
				continue;
			} else if (coordinate.length < 2 ) {
				String A = sc;
				if ((A.equals(String.valueOf(2))))
					System.out.println(sc.substring(1,2)+"는 잘못된 좌표입니다.");
					else if ((A.equals(String.valueOf(4))))
						System.out.println(sc.substring(1,2)+"는 잘못된 좌표입니다.");
					else if ((A.equals(String.valueOf(5))))
						System.out.println(sc.substring(1,2)+"는 잘못된 좌표입니다.");
					else if ((A.equals(String.valueOf(9))))
						System.out.println(sc.substring(1,2)+"는 잘못된 좌표입니다.");				
					else
						System.out.println(sc.substring(1,2)+"은 잘못된 좌표입니다.");
				continue;
					
				
			//} else if (coordinate.length > 2) {
				//if (String.valueOf(sc.charAt(0))==String.valueOf(3))// || String.valueOf(A.charAt(0)==6) || String.valueOf(A.charAt(0)==7) || String.valueOf(A.charAt(0)==8) || String.valueOf(A.charAt(0)==0)) {
				//	System.out.println("sc.substring(1,5)+은 잘못된 좌표입니다.");
				}
				else {
					System.out.println(sc+"는 잘못된 좌표입니다.");
				} continue;
			
			//String A = (sc).substring(1,5);
			//	String A = sc;	
			}
			//	System.out.println("입력된 좌표는 "+sc.substring(1,5));	
		
	}
}
	

