package org.test.www;
import java.util.*;

public class fortictactoe6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] coordinate = null;
		
		while(true) {
			System.out.print("��ǥ�� �Է��� �ּ���: ");			
			
			String input = s.nextLine();
			
			//�� �ڷ� ���鰪�� �ԷµǸ� �߶��ݴϴ�
			input = input.trim();
			
			//�޸��� �������� �����ݴϴ�
			coordinate = input.split(",");
			
			
			String command = coordinate[0].trim();
			
			
			if("".equals(command)) 
				continue;
	
			
			//���� ��� �Է��ϸ� ���α׷��� ����˴ϴ�
			if(command.equals("����")) {
				System.out.println("��ǥ �Է��� �����մϴ�.");
				System.exit(0);				
			
			//���� 2���Է¹޾��� ����Դϴ�. ��ü�� �����ؼ� �ٸ� Ŭ������ �����߽��ϴ�
			} else if (coordinate.length == 2 ) {				
				CountNumber cn = new CountNumber();
				cn.two(coordinate);
				
				continue;
				
			//���� �ϳ� �Է¹޾��� ����Դϴ�
			} else if (coordinate.length < 2 ) {
				CountNumber cn = new CountNumber();
				String sc = Arrays.toString(coordinate);
				
				String negative = "-";
				// ���� ����� �Է°��� ������ ������ negativeone��
				if(sc.indexOf(negative)>-1) {
					cn.negativeone(coordinate);
				// ������ positiveone�� �ҷ��ɴϴ�
				} else {
					cn.positiveone(coordinate);
				}
				
				continue;
		
				
			//���� �̻��� ���� �Է¹޾��� ����Դϴ�
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
		// ���̳ʽ� ���� �Է¹��� ���� ����� negative�� -�� �־��ݴϴ�
		String negative = "-";
		// ���� ����� �Է°��� ������ ������ 
		if(sc.indexOf(negative)>-1) {
			//�켱 �迭�� �ٴ� []�� �����ְ�
			negative = sc.substring(1,3);
			//���̳ʽ� ���� ���밪���� �ٲ��ݴϴ�
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
		System.out.println("�Էµ� ��ǥ�� x="+x+", y="+y);					
		return y; //�ƹ��ǹ̾���

	}
	String threeormore(String[] coordinate) {
	
		String sc = Arrays.toString(coordinate);
		// ����� �Է°����� [ ]�� ���� ��, ���� �Ųٷ� ����ϴ� 
		// 1,2,3�� �Է¹޾��� ��� 3,2,1�� �������ϴ�. �� ������ �ڸ����� ���� '��'�� ������'��'�� ������ �����Ǳ� �����Դϴ�.
		String reverse = (new StringBuffer(sc)).reverse().toString();
		// ������ ���� ù��° �ڸ����� ���մϴ�
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
	
		//���밪�� 2, 4, 5, 9�� ���ԵǾ��� ��� ����� �Է°� �ڿ� '�� �߸��� ��ǥ�Դϴ�'�� ��µ˴ϴ�
		if( A.indexOf(number1)>-1  || A.indexOf(number2)>-1 || A.indexOf(number3)>-1 || A.indexOf(number4)>-1) {
			System.out.println("�� �߸��� ��ǥ�Դϴ�.");
		} else
		// ���밪�� 2, 4, 5, 9�� ���Ե��� �ʾ��� ��� '�� �߸��� ��ǥ�Դϴ�'�� ��µ˴ϴ�
		System.out.println("�� �߸��� ��ǥ�Դϴ�.");
		return number1;
	}
	
}

