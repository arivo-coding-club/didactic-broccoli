package org.test.www;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class fortictactoe7 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String coordinate = "";
		
		while(true) {
			System.out.print("좌표를 입력해 주세요: ");			
			
			String input = s.nextLine();
			input = input.trim();
			
			if("".equals(input)) 
				continue;

		
			if(input.equals("종료")) {
				System.out.println("좌표 입력을 종료합니다.");
				System.exit(0);	
			}
			
			//입력값을 콤마를 기준으로 구분하고 배열문에서 [ ]을 제거합니다
			coordinate = Arrays.toString(input.split(","));
			coordinate = coordinate.substring(1,coordinate.length()-1);
			
			
			Pattern p = Pattern.compile("[0-9].[0-9]");
			Matcher m = p.matcher(input);
			
			
			//입력값 첫번째를 x값으로 설정합니다(입력값 개수에 따라 if문을 나누었기 때문에, 한자리수는 반드시 입력받으므로 x값만 우선 설정했습니다)
			String x = String.valueOf(coordinate.charAt(0));	
			
			
			//숫자 두개가 있는 패턴과 입력값이 일치하는지 확인합니다
			if (m.matches()) {
			
			//일치한다면 두번째 입력값을 y값으로 설정합니다
			String y = String.valueOf(coordinate.charAt(3));
			System.out.println("입력된 좌표는 x="+x+", y="+y);			
			
			continue;
			} 
			
			
			//숫자 두개가 있는 패턴과 일치하지 않는 경우, 숫자 한개 패턴을 만든 후 일치하는지 확인합니다
			Pattern a = Pattern.compile("[0-9]");
			Matcher b = a.matcher(coordinate);
	
			
			if (b.matches()) {
	
				CountNumber cn = new CountNumber();
			
				String negative = "-";
			
				//한자리 수 중 음수인지 확인합니다
				if(coordinate.indexOf(negative)>-1) {
					System.out.print(negative);
					cn.negativeone(coordinate);
					continue;
					
				//한자리 수 중 양수인지 확인합니다
				} else {
					cn.positiveone(coordinate);
					continue;
				}
			}
			
			//숫자 한개의 패턴과도 일치하지 않는 경우 자동으로 세개 이상의 값을 입력받았을 경우로 넘어갑니다
			CountNumber cn = new CountNumber();
			System.out.print(coordinate);
			cn.threeormore(coordinate);
			
			continue;
		}
	}
}


class CountNumber {

	//숫자 한개를 입력받았고, 그 값이 음수인 경우입니다
	String negativeone(String coordinate)  {
		
		//마이너스 부호를 빼고 절대값을 구합니다
		coordinate = coordinate.substring(1);
			
		Is is = new Is();
		is.eunnun(coordinate);
		
		return coordinate;
	}
	
	//숫자 한개를 입력받았고, 그 값이 양수인 경우입니다
	void positiveone(String coordinate) {
		
		System.out.print(coordinate);
			
		Is is = new Is();
		is.eunnun(coordinate);
	}
	
	
	//숫자 세개를 입력받았을 경우입니다
	void threeormore(String coordinate) {
		// 1,2,3을 입력받았을 경우 3,2,1로 뒤집습니다. 맨 마지막 자리수에 따라 '은'이 붙을지'는'이 붙을지 결정되기 때문입니다.
		String reverse = (new StringBuffer(coordinate)).reverse().toString();
		// 뒤집은 값의 첫번째 자리수를 구합니다
		char tmp=reverse.toCharArray()[0]; 
		
		String A = String.valueOf(tmp);
		
		Is is = new Is();
		is.eunnun(A);      
	}
}


class Is {
	void eunnun(String A){
		//2,4,5,9가 입력값에 포함되었는지 확인하는 패턴을 만들고 확인합니다
		Pattern c = Pattern.compile("2||4||5||9");
		Matcher d = c.matcher(A);
		
		if (d.matches()) {
			System.out.println("는 잘못된 좌표입니다.");
		} else {
			System.out.println("은 잘못된 좌표입니다.");	
		}
	}
}
