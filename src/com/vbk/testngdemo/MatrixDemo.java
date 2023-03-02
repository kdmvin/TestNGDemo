package com.vbk.testngdemo;

public class MatrixDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] str = { { "vinayak", "Kadam" }, { "kdm", "kdm" }, { "vbk", "vbk" } };
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(str[i][j] + " ");
			}
			System.out.println();
		}
	}

}
