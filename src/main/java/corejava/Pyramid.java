package corejava;

import java.util.Arrays;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int s[][] = new int[4][4];
		
		for(int i=0;i<4;i++) {
			for(int j=4;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
