package org.test.www;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class fortictactoe7 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String coordinate = "";
		
		while(true) {
			System.out.print("��ǥ�� �Է��� �ּ���: ");			
			
			String input = s.nextLine();
			input = input.trim();
			
			if("".equals(input)) 
				continue;

		
			if(input.equals("����")) {
				System.out.println("��ǥ �Է��� �����մϴ�.");
				System.exit(0);	
			}
			
			//�Է°��� �޸��� �������� �����ϰ� �迭������ [ ]�� �����մϴ�
			coordinate = Arrays.toString(input.split(","));
			coordinate = coordinate.substring(1,coordinate.length()-1);
			
			
			Pattern p = Pattern.compile("[0-9].[0-9]");
			Matcher m = p.matcher(input);
			
			
			//�Է°� ù��°�� x������ �����մϴ�(�Է°� ������ ���� if���� �������� ������, ���ڸ����� �ݵ�� �Է¹����Ƿ� x���� �켱 �����߽��ϴ�)
			String x = String.valueOf(coordinate.charAt(0));	
			
			
			//���� �ΰ��� �ִ� ���ϰ� �Է°��� ��ġ�ϴ��� Ȯ���մϴ�
			if (m.matches()) {
			
			//��ġ�Ѵٸ� �ι�° �Է°��� y������ �����մϴ�
			String y = String.valueOf(coordinate.charAt(3));
			System.out.println("�Էµ� ��ǥ�� x="+x+", y="+y);			
			
			continue;
			} 
			
			
			//���� �ΰ��� �ִ� ���ϰ� ��ġ���� �ʴ� ���, ���� �Ѱ� ������ ���� �� ��ġ�ϴ��� Ȯ���մϴ�
			Pattern a = Pattern.compile("[0-9]");
			Matcher b = a.matcher(coordinate);
	
			
			if (b.matches()) {
	
				CountNumber cn = new CountNumber();
			
				String negative = "-";
			
				//���ڸ� �� �� �������� Ȯ���մϴ�
				if(coordinate.indexOf(negative)>-1) {
					System.out.print(negative);
					cn.negativeone(coordinate);
					continue;
					
				//���ڸ� �� �� ������� Ȯ���մϴ�
				} else {
					cn.positiveone(coordinate);
					continue;
				}
			}
			
			//���� �Ѱ��� ���ϰ��� ��ġ���� �ʴ� ��� �ڵ����� ���� �̻��� ���� �Է¹޾��� ���� �Ѿ�ϴ�
			CountNumber cn = new CountNumber();
			System.out.print(coordinate);
			cn.threeormore(coordinate);
			
			continue;
		}
	}
}


class CountNumber {

	//���� �Ѱ��� �Է¹޾Ұ�, �� ���� ������ ����Դϴ�
	String negativeone(String coordinate)  {
		
		//���̳ʽ� ��ȣ�� ���� ���밪�� ���մϴ�
		coordinate = coordinate.substring(1);
			
		Is is = new Is();
		is.eunnun(coordinate);
		
		return coordinate;
	}
	
	//���� �Ѱ��� �Է¹޾Ұ�, �� ���� ����� ����Դϴ�
	void positiveone(String coordinate) {
		
		System.out.print(coordinate);
			
		Is is = new Is();
		is.eunnun(coordinate);
	}
	
	
	//���� ������ �Է¹޾��� ����Դϴ�
	void threeormore(String coordinate) {
		// 1,2,3�� �Է¹޾��� ��� 3,2,1�� �������ϴ�. �� ������ �ڸ����� ���� '��'�� ������'��'�� ������ �����Ǳ� �����Դϴ�.
		String reverse = (new StringBuffer(coordinate)).reverse().toString();
		// ������ ���� ù��° �ڸ����� ���մϴ�
		char tmp=reverse.toCharArray()[0]; 
		
		String A = String.valueOf(tmp);
		
		Is is = new Is();
		is.eunnun(A);      
	}
}


class Is {
	void eunnun(String A){
		//2,4,5,9�� �Է°��� ���ԵǾ����� Ȯ���ϴ� ������ ����� Ȯ���մϴ�
		Pattern c = Pattern.compile("2||4||5||9");
		Matcher d = c.matcher(A);
		
		if (d.matches()) {
			System.out.println("�� �߸��� ��ǥ�Դϴ�.");
		} else {
			System.out.println("�� �߸��� ��ǥ�Դϴ�.");	
		}
	}
}
