package org.test.www;

public class fortictactoe {
	public static void main(String[] args) {
		String name = "";
		for (int i = 0; i < args.length; i++) {
			name += args[i];
		}
		System.out.println("Hello " + name + "!");
	}

}
