package org.test.www;
import java.util.*;

public class fortictactoe5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] coordinate = null;
		
		while(true) {
			String prompt = "��ǥ�� �Է��� �ּ���: ";
			System.out.print(prompt);			
			
			String input = s.nextLine();
			
			//�� �ڷ� ���鰪�� �ԷµǸ� �߶��ݴϴ�
			input = input.trim();
			
			//�޸��� �������� �����ݴϴ�
			coordinate = input.split(",");
			
			String command = coordinate[0].trim();
			
			
			if("".equals(command)) 
				continue;
		
			//command = command.toLowerCase();
			
			//���� ��� �Է��ϸ� ���α׷��� ����˴ϴ�
			if(command.equals("����")) {
				System.out.println("��ǥ �Է��� �����մϴ�.");
				System.exit(0);				
			
			// ���� �ΰ� �Է¹����� ù��° ���� x ��ǥ, �ι�° ���� y��ǥ�� �����ϰ� ����մϴ�
			} else if (coordinate.length == 2 ) {
				//����ڰ� �Է��� ���� �迭�� �Է¹޾ұ� ������ �迭�� ��µ˴ϴ�. �� �� �ٴ� [ ]�� �����ֱ� ���� subString�� ����մϴ�.
				String m = sc.substring(1,5);
				String x = String.valueOf(m.charAt(0));
				String y = String.valueOf(m.charAt(3));
				System.out.println("�Էµ� ��ǥ�� x="+x+", y="+y);					
				continue;
			
			//���� ���ڸ����� �Է¹޾��� ����Դϴ�
			} else if (coordinate.length < 2 ) {
				
				// ���̳ʽ� ���� �Է¹��� ���� ����� j�� -�� �־��ݴϴ�
				String j = "-";
				// ���� ����� �Է°��� ������ ������ 
				if(sc.indexOf(j)>-1) {
					//�켱 �迭�� �ٴ� []�� �����ְ�
					j = sc.substring(1,3);
					//���̳ʽ� ���� ���밪���� �ٲ��ݴϴ�
					int p = (Math.abs(Integer.parseInt(j)));
					
					String A = ""+p;
			
					String number1 = "2";
					String number2 = "4";
					String number3 = "5";
					String number4 = "9";
					
					//���밪�� 2, 4, 5, 9�� ���ԵǾ��� ��� ����� �Է°� �ڿ� '�� �߸��� ��ǥ�Դϴ�'�� ��µ˴ϴ�
					if( A.indexOf(number1)>-1  || A.indexOf(number2)>-1 || A.indexOf(number3)>-1 || A.indexOf(number4)>-1) {
						System.out.println(j+"�� �߸��� ��ǥ�Դϴ�.");
					}
					else
						// ���밪�� 2, 4, 5, 9�� ���Ե��� �ʾ��� ��� '�� �߸��� ��ǥ�Դϴ�'�� ��µ˴ϴ�
						System.out.println(j+"�� �߸��� ��ǥ�Դϴ�.");
					continue;
				
				} else {
				//���� ���� ������ �̹����� ����� ����Դϴ�
				String A = sc.substring(1,2);

				String number1 = "2";
				String number2 = "4";
				String number3 = "5";
				String number4 = "9";
				
				if( A.indexOf(number1)>-1  || A.indexOf(number2)>-1 || A.indexOf(number3)>-1 || A.indexOf(number4)>-1) {
					System.out.println(sc.substring(1,2)+"�� �߸��� ��ǥ�Դϴ�.");
				}
				else
					System.out.println(sc.substring(1,2)+"�� �߸��� ��ǥ�Դϴ�.");
				continue;
				}
				
			//���� �̻��� ���� �Է¹޾��� ����Դϴ�
			} else if (coordinate.length > 2) {
				  // ����� �Է°����� [ ]�� ���� ��, ���� �Ųٷ� ����ϴ� 
				  // 1,2,3�� �Է¹޾��� ��� 3,2,1�� �������ϴ�. �� ������ �ڸ����� ���� '��'�� ������'��'�� ������ �����Ǳ� �����Դϴ�.
			      String reverse = (new StringBuffer(sc)).reverse().toString();
			     // ������ ���� ù��° �ڸ����� ���մϴ�
			      char c=reverse.toCharArray()[1]; 
				
			      String A = String.valueOf(c);
				
			      String number1 = "2";
			      String number2 = "4";
			      String number3 = "5";
			      String number4 = "9";
					
					if( A.indexOf(number1)>-1  || A.indexOf(number2)>-1 || A.indexOf(number3)>-1 || A.indexOf(number4)>-1) {
						//����� �Է°����� �� ���� ]�� �����ϱ� ���ؼ� �Է¹��� �������� �ϳ��� ���� �������� ����մϴ�
						System.out.println(sc.substring(1, sc.length()-1)+"�� �߸��� ��ǥ�Դϴ�.");
					}
					else
						System.out.println(sc.substring(1, sc.length()-1)+"�� �߸��� ��ǥ�Դϴ�.");
					continue;
			}
		}
	}
}
	