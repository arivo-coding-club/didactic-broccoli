package org.test.www;
import java.util.*;

public class fortictactoe5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] coordinate = null;
		
		while(true) {
			String prompt = "좌표를 입력해 주세요: ";
			System.out.print(prompt);			
			
			String input = s.nextLine();
			
			//앞 뒤로 공백값이 입력되면 잘라줍니다
			input = input.trim();
			
			//콤마를 기준으로 나눠줍니다
			coordinate = input.split(",");
			
			String command = coordinate[0].trim();
			
			
			if("".equals(command)) 
				continue;
		
			//command = command.toLowerCase();
			
			//종료 라고 입력하면 프로그램이 종료됩니다
			if(command.equals("종료")) {
				System.out.println("좌표 입력을 종료합니다.");
				System.exit(0);				
			
			// 값을 두개 입력받으면 첫번째 값은 x 좌표, 두번째 값은 y좌표로 설정하고 출력합니다
			} else if (coordinate.length == 2 ) {
				//사용자가 입력한 값을 배열로 입력받았기 때문에 배열로 출력됩니다. 이 때 붙는 [ ]를 없애주기 위해 subString을 사용합니다.
				String m = sc.substring(1,5);
				String x = String.valueOf(m.charAt(0));
				String y = String.valueOf(m.charAt(3));
				System.out.println("입력된 좌표는 x="+x+", y="+y);					
				continue;
			
			//값을 한자리수로 입력받았을 경우입니다
			} else if (coordinate.length < 2 ) {
				
				// 마이너스 값을 입력받을 때를 대비해 j에 -를 넣어줍니다
				String j = "-";
				// 만약 사용자 입력값에 음수가 있으면 
				if(sc.indexOf(j)>-1) {
					//우선 배열에 붙는 []를 없애주고
					j = sc.substring(1,3);
					//마이너스 값을 절대값으로 바꿔줍니다
					int p = (Math.abs(Integer.parseInt(j)));
					
					String A = ""+p;
			
					String number1 = "2";
					String number2 = "4";
					String number3 = "5";
					String number4 = "9";
					
					//절대값에 2, 4, 5, 9가 포함되었을 경우 사용자 입력값 뒤에 '는 잘못된 좌표입니다'가 출력됩니다
					if( A.indexOf(number1)>-1  || A.indexOf(number2)>-1 || A.indexOf(number3)>-1 || A.indexOf(number4)>-1) {
						System.out.println(j+"는 잘못된 좌표입니다.");
					}
					else
						// 절대값에 2, 4, 5, 9가 포함되지 않았을 경우 '은 잘못된 좌표입니다'가 출력됩니다
						System.out.println(j+"은 잘못된 좌표입니다.");
					continue;
				
				} else {
				//위의 경우와 같은데 이번에는 양수일 경우입니다
				String A = sc.substring(1,2);

				String number1 = "2";
				String number2 = "4";
				String number3 = "5";
				String number4 = "9";
				
				if( A.indexOf(number1)>-1  || A.indexOf(number2)>-1 || A.indexOf(number3)>-1 || A.indexOf(number4)>-1) {
					System.out.println(sc.substring(1,2)+"는 잘못된 좌표입니다.");
				}
				else
					System.out.println(sc.substring(1,2)+"은 잘못된 좌표입니다.");
				continue;
				}
				
			//세개 이상의 값을 입력받았을 경우입니다
			} else if (coordinate.length > 2) {
				  // 사용자 입력값에서 [ ]을 떼낸 후, 값을 거꾸로 만듭니다 
				  // 1,2,3을 입력받았을 경우 3,2,1로 뒤집습니다. 맨 마지막 자리수에 따라 '은'이 붙을지'는'이 붙을지 결정되기 때문입니다.
			      String reverse = (new StringBuffer(sc)).reverse().toString();
			     // 뒤집은 값의 첫번째 자리수를 구합니다
			      char c=reverse.toCharArray()[1]; 
				
			      String A = String.valueOf(c);
				
			      String number1 = "2";
			      String number2 = "4";
			      String number3 = "5";
			      String number4 = "9";
					
					if( A.indexOf(number1)>-1  || A.indexOf(number2)>-1 || A.indexOf(number3)>-1 || A.indexOf(number4)>-1) {
						//사용자 입력값에서 맨 뒤의 ]를 제거하기 위해서 입력받은 개수에서 하나를 빼준 값까지만 출력합니다
						System.out.println(sc.substring(1, sc.length()-1)+"는 잘못된 좌표입니다.");
					}
					else
						System.out.println(sc.substring(1, sc.length()-1)+"은 잘못된 좌표입니다.");
					continue;
			}
		}
	}
}
	