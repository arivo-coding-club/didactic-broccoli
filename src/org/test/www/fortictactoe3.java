package org.test.www;
import java.util.*;

public class fortictactoe3 {
	public static void main(String[] args) {
		/*
		Scanner s = new Scanner(System.in);
		String name = "";
		for (int i = 0; i < args.length; i++) {
			System.out.print("��ǥ�� �Է��� �ּ���: ");
			name += args[i];
		}
		System.out.println("�Էµ� ��ǥ�� " + name);
		
		*/
		
		Scanner s = new Scanner(System.in);
		String coordinate = null;
		// String a = "����";
		//String A = sc;
		
		while(true) {
			String prompt = "��ǥ�� �Է��� �ּ���: ";
			System.out.print(prompt);			
			
			String input = s.nextLine();
			
			input = input.trim();
			//lastStr = String.valueOf(sc).charAt(0);
			//String A = sc;
			
			coordinate = input.split(",");
			
			String command = coordinate.trim();
			
			
			if("".equals(command)) continue;
		
			command = command.toLowerCase();
			
			if(command.equals("����")) {
				System.out.println("��ǥ �Է��� �����մϴ�.");
				System.exit(0);
			} else if (coordinate.length == 2 ) {
				System.out.println("�Էµ� ��ǥ�� "+sc.substring(1,5));					
				continue;
			} else if (coordinate.length < 2 ) {
				String A = sc;
				if ((A.equals(String.valueOf(2))))
					System.out.println(sc.substring(1,2)+"�� �߸��� ��ǥ�Դϴ�.");
					else if ((A.equals(String.valueOf(4))))
						System.out.println(sc.substring(1,2)+"�� �߸��� ��ǥ�Դϴ�.");
					else if ((A.equals(String.valueOf(5))))
						System.out.println(sc.substring(1,2)+"�� �߸��� ��ǥ�Դϴ�.");
					else if ((A.equals(String.valueOf(9))))
						System.out.println(sc.substring(1,2)+"�� �߸��� ��ǥ�Դϴ�.");				
					else
						System.out.println(sc.substring(1,2)+"�� �߸��� ��ǥ�Դϴ�.");
				continue;
					
				
			//} else if (coordinate.length > 2) {
				//if (String.valueOf(sc.charAt(0))==String.valueOf(3))// || String.valueOf(A.charAt(0)==6) || String.valueOf(A.charAt(0)==7) || String.valueOf(A.charAt(0)==8) || String.valueOf(A.charAt(0)==0)) {
				//	System.out.println("sc.substring(1,5)+�� �߸��� ��ǥ�Դϴ�.");
				}
				else {
					System.out.println(sc+"�� �߸��� ��ǥ�Դϴ�.");
				} continue;
			
			//String A = (sc).substring(1,5);
			//	String A = sc;	
			}
			//	System.out.println("�Էµ� ��ǥ�� "+sc.substring(1,5));	
		
	}
}
	

