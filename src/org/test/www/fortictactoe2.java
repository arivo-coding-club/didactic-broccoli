package org.test.www;

import java.util.Scanner;

public class fortictactoe2 {
	  public static void main(String[] args) {

		  Scanner scan = new Scanner(System.in);

			String name; 
		    int age;

			System.out.print("�̸��� �Է��ϼ���: ");
			name = scan.next();

	        System.out.print("���̸� �Է��ϼ���: ");
			age = scan.nextInt();

			System.out.println("�ȳ��ϼ��� "+age+"�� "+name+"��!");
	        //Java���� ���ڿ�(string)�� ������ ���� "+"�� ����ϴ� �� ����������!
		}
		  
}		  
		  
	/*	  
	        /*
	         * ������(kg)�� Ű(cm)�� ����ڿ��� �Է��� �޾� ������ �Ǻ��Ͽ� ���
	         *
	         * ��ü ���� ����(BMI) = ü��(kg) / [����(m)]2 <-����
	         * ��ü�� 20 �̸�
	         * ���� 20�̻� - 25�̸�
	         * ��ü�� 25�̻� - 30�̸�
	         * �� 30�̻�
	         */
	 /*
	  Scanner scan = new Scanner(System.in);
	        
	        System.out.print("�����Ը� �Է��ϼ���(kg) : ");
	        int weight = scan.nextInt();
	        System.out.print("Ű�� �Է��ϼ���(cm) : ");
	        int height = scan.nextInt();
	         
	        double heightM = (height /100.);
	        double myBmi = weight / (heightM * heightM);
	 
	        if (myBmi >= 30) {
	            System.out.println("��");
	        } else if (myBmi >= 25) {
	            System.out.println("��ü��");
	        } else if (myBmi >= 20) {
	            System.out.println("����");
	        } else {
	            System.out.println("��ü��");
	        }
	 
	    }// end of main
	} // end of class


*/
	/*
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println(i*1000);
		sc.close();

	}

}
*/