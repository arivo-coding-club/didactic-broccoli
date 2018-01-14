package org.test.www;

import java.util.Scanner;

public class fortictactoe2 {
	  public static void main(String[] args) {

		  Scanner scan = new Scanner(System.in);

			String name; 
		    int age;

			System.out.print("이름을 입력하세요: ");
			name = scan.next();

	        System.out.print("나이를 입력하세요: ");
			age = scan.nextInt();

			System.out.println("안녕하세요 "+age+"살 "+name+"님!");
	        //Java에서 문자열(string)을 연결할 때는 "+"를 사용하는 거 잊지마세요!
		}
		  
}		  
		  
	/*	  
	        /*
	         * 몸무게(kg)와 키(cm)를 사용자에게 입력을 받아 비만인지 판별하여 출력
	         *
	         * 신체 질량 지수(BMI) = 체중(kg) / [신장(m)]2 <-제곱
	         * 저체중 20 미만
	         * 정상 20이상 - 25미만
	         * 과체중 25이상 - 30미만
	         * 비만 30이상
	         */
	 /*
	  Scanner scan = new Scanner(System.in);
	        
	        System.out.print("몸무게를 입력하세요(kg) : ");
	        int weight = scan.nextInt();
	        System.out.print("키를 입력하세요(cm) : ");
	        int height = scan.nextInt();
	         
	        double heightM = (height /100.);
	        double myBmi = weight / (heightM * heightM);
	 
	        if (myBmi >= 30) {
	            System.out.println("비만");
	        } else if (myBmi >= 25) {
	            System.out.println("과체중");
	        } else if (myBmi >= 20) {
	            System.out.println("정상");
	        } else {
	            System.out.println("저체중");
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