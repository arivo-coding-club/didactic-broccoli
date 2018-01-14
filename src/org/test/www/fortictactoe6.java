package org.test.www;
import java.util.*;

public class fortictactoe6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] coordinate = null;
		
		while(true) {
			System.out.print("좌표를 입력해 주세요: ");			
			
			String input = s.nextLine();
			
			//앞 뒤로 공백값이 입력되면 잘라줍니다
			input = input.trim();
			
			//콤마를 기준으로 나눠줍니다
			coordinate = input.split(",");
			
			
			String command = coordinate[0].trim();
			
			
			if("".equals(command)) 
				continue;
	
			
			//종료 라고 입력하면 프로그램이 종료됩니다
			if(command.equals("종료")) {
				System.out.println("좌표 입력을 종료합니다.");
				System.exit(0);				
			
			//값을 2개입력받았을 경우입니다. 객체를 생성해서 다른 클래스와 연결했습니다
			} else if (coordinate.length == 2 ) {				
				CountNumber cn = new CountNumber();
				cn.two(coordinate);
				
				continue;
				
			//값을 하나 입력받았을 경우입니다
			} else if (coordinate.length < 2 ) {
				CountNumber cn = new CountNumber();
				String sc = Arrays.toString(coordinate);
				
				String negative = "-";
				// 만약 사용자 입력값에 음수가 있으면 negativeone을
				if(sc.indexOf(negative)>-1) {
					cn.negativeone(coordinate);
				// 양수라면 positiveone을 불러옵니다
				} else {
					cn.positiveone(coordinate);
				}
				
				continue;
		
				
			//세개 이상의 값을 입력받았을 경우입니다
			} else if (coordinate.length > 2) {
				CountNumber cn = new CountNumber();
				cn.threeormore(coordinate);
				
				continue;
			}
	}	
}

static class CountNumber {
			
	String negativeone(String[] coordinate)  {
		String sc = Arrays.toString(coordinate);
		// 마이너스 값을 입력받을 때를 대비해 negative에 -를 넣어줍니다
		String negative = "-";
		// 만약 사용자 입력값에 음수가 있으면 
		if(sc.indexOf(negative)>-1) {
			//우선 배열에 붙는 []를 없애주고
			negative = sc.substring(1,3);
			//마이너스 값을 절대값으로 바꿔줍니다
			int absnegative = (Math.abs(Integer.parseInt(negative)));
			
			String A = ""+absnegative;
			
			System.out.print(negative);
			Is cn = new Is();
			cn.eunnun(A);
		}
		return sc;
	}
	
	String positiveone(String[] coordinate) {
		String sc = Arrays.toString(coordinate);
		String A = sc.substring(1,2);

		System.out.print(sc.substring(1,2));
		Is cn = new Is();
		cn.eunnun(A);
	
		return sc;
	}

	String two(String[] coordinate) {
		
		String sc = Arrays.toString(coordinate);
		String tmptwo = sc.substring(1,5);
		
		
		String x = String.valueOf(tmptwo.charAt(0));
		String y = String.valueOf(tmptwo.charAt(3));
		System.out.println("입력된 좌표는 x="+x+", y="+y);					
		return y; //아무의미없음

	}
	String threeormore(String[] coordinate) {
	
		String sc = Arrays.toString(coordinate);
		// 사용자 입력값에서 [ ]을 떼낸 후, 값을 거꾸로 만듭니다 
		// 1,2,3을 입력받았을 경우 3,2,1로 뒤집습니다. 맨 마지막 자리수에 따라 '은'이 붙을지'는'이 붙을지 결정되기 때문입니다.
		String reverse = (new StringBuffer(sc)).reverse().toString();
		// 뒤집은 값의 첫번째 자리수를 구합니다
		char c=reverse.toCharArray()[1]; 
	
		String A = String.valueOf(c);
	
		System.out.print(sc.substring(1, sc.length()-1));
		Is cn = new Is();
		cn.eunnun(A);	
      
		return sc;
	}
}
}
class Is2 {
	String eunnun(String A){
		
		String number1 = "2";
		String number2 = "4";
		String number3 = "5";
		String number4 = "9";
	
		//절대값에 2, 4, 5, 9가 포함되었을 경우 사용자 입력값 뒤에 '는 잘못된 좌표입니다'가 출력됩니다
		if( A.indexOf(number1)>-1  || A.indexOf(number2)>-1 || A.indexOf(number3)>-1 || A.indexOf(number4)>-1) {
			System.out.println("는 잘못된 좌표입니다.");
		} else
		// 절대값에 2, 4, 5, 9가 포함되지 않았을 경우 '은 잘못된 좌표입니다'가 출력됩니다
		System.out.println("은 잘못된 좌표입니다.");
		return number1;
	}
	
}

