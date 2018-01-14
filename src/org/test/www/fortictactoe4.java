package org.test.www;
import java.util.*;

public class fortictactoe4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] coordinate = null;
		
		while(true) {
			String prompt = "좌표를 입력해 주세요: ";
			System.out.print(prompt);			
			
			String input = s.nextLine();
			
			input = input.trim();
			
			coordinate = input.split(",");
			
			String command = coordinate[0].trim();
			
			
			if("".equals(command)) continue;
		
			command = command.toLowerCase();
			
			if(command.equals("종료")) {
				System.out.println("좌표 입력을 종료합니다.");
				System.exit(0);
			} else if (coordinate.length == 2 ) {
				String m = sc.substring(1,5);
				String x = String.valueOf(m.charAt(0));
				String y = String.valueOf(m.charAt(3));
				System.out.println("입력된 좌표는 x="+x+", y="+y);					
				continue;
			} else if (coordinate.length < 2 ) {
				
				String j = "-";
				if(sc.indexOf(j)>-1) {
					j = sc.substring(1,3);
					int p = (Math.abs(Integer.parseInt(j)));
					//System.out.println(p);
					String A = ""+p;

					
					//System.out.println(j);
					//if (A.indexOf("-")>-1) {
					//	
					//}
					String number1 = "2";
					String number2 = "4";
					String number3 = "5";
					String number4 = "9";
					
					//if( A.indexOf(number1)>0  || A.indexOf(number2)>0 || A.indexOf(number3)>0 || A.indexOf(number4)>0) {
					if( A.indexOf(number1)>-1  || A.indexOf(number2)>-1 || A.indexOf(number3)>-1 || A.indexOf(number4)>-1) {
						System.out.println(j+"는 잘못된 좌표입니다.");
					}
					else
						System.out.println(j+"은 잘못된 좌표입니다.");
				continue;
				
				} else {
				String A = sc.substring(1,2);
				
				//System.out.println(j);
				//if (A.indexOf("-")>-1) {
				//	
				//}
				String number1 = "2";
				String number2 = "4";
				String number3 = "5";
				String number4 = "9";
				
				//if( A.indexOf(number1)>0  || A.indexOf(number2)>0 || A.indexOf(number3)>0 || A.indexOf(number4)>0) {
				if( A.indexOf(number1)>-1  || A.indexOf(number2)>-1 || A.indexOf(number3)>-1 || A.indexOf(number4)>-1) {
					System.out.println(sc.substring(1,2)+"는 잘못된 좌표입니다.");
				}
				else
					System.out.println(sc.substring(1,2)+"은 잘못된 좌표입니다.");
			continue;
				}
				
				
			
				
				/*
				System.out.println(j);
				//if (A.indexOf("-")>-1) {
				//	
				//}
				String number1 = "2";
				String number2 = "4";
				String number3 = "5";
				String number4 = "9";
				
				//if( A.indexOf(number1)>0  || A.indexOf(number2)>0 || A.indexOf(number3)>0 || A.indexOf(number4)>0) {
				if( A.indexOf(number1)>-1  || A.indexOf(number2)>-1 || A.indexOf(number3)>-1 || A.indexOf(number4)>-1) {
					System.out.println(sc.substring(1,2)+"는 잘못된 좌표입니다.");
				}
				else
					System.out.println(sc.substring(1,2)+"은 잘못된 좌표입니다.");
			continue;
			*/
			} else if (coordinate.length > 2) {
				
			     
			      String reverse = (new StringBuffer(sc)).reverse().toString();
			      
			     
			      char c=reverse.toCharArray()[1]; 
			 
			       
				
				String A = String.valueOf(c);
				
				String number1 = "2";
				String number2 = "4";
				String number3 = "5";
				String number4 = "9";
				
				if( A.indexOf(number1)>-1  || A.indexOf(number2)>-1 || A.indexOf(number3)>-1 || A.indexOf(number4)>-1) {
					System.out.println(sc.substring(1, sc.length()-1)+"는 잘못된 좌표입니다.");
				}
				else
					System.out.println(sc.substring(1, sc.length()-1)+"은 잘못된 좌표입니다.");
			continue;
				}
			}
	}
}
	/*
		  public static int ok() 
		   { 
			  String number1 = "2";
			  String number2 = "4";
			  String number3 = "5";
			  String number4 = "9";
				
			  if( A.indexOf(number1)>-1  || A.indexOf(number2)>-1 || A.indexOf(number3)>-1 || A.indexOf(number4)>-1) {
					System.out.println(sc.substring(1,2)+"는 잘못된 좌표입니다.");
				}
				else
					System.out.println(sc.substring(1,2)+"은 잘못된 좌표입니다.");
			  
		      int minimum; 
		      if (num1 < num2) 
		      { 
		         minimum = num1; 
		      } 
		      else 
		      { 
		         minimum = num2; 
		      } 
		      return minimum; 
		   } 	
	}

	
public class A extends fortic{
if( A.indexOf(number1)>-1  || A.indexOf(number2)>-1 || A.indexOf(number3)>-1 || A.indexOf(number4)>-1) {
	System.out.println(sc.substring(1,2)+"는 잘못된 좌표입니다.");
}
else
	System.out.println(sc.substring(1,2)+"은 잘못된 좌표입니다.");
}}
	*/