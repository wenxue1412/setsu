package edu0418.day2;

import java.lang.reflect.Array;
import java.util.Arrays;

import edu0418.day1.Usb;

public class Demo1 {

	public static void main(String[] args) {
		printP99(3);
		AbstractPrint fuji = new FujiPrint();
		AbstractPrint sony = new SonyPrint();

		fuji.run("My number");
		sony.run("My number");

		Usb sonyUsb = new SonyUsb();
		Pc pc = new Pc(sonyUsb);

		forest(3,5,7,8);
	}

	private static void printP99(int n) {
		for (int j = 1; j <= n; j++) {
			for (int k = 1; k <= j; k++) {
				System.out.print(k + "*" + j + "=" + k * j + " ");
			}

			System.out.println();
		}
	}

	private static void forest(int a,int b,int c,int d ) {
		int ft[] = {a,b,c,d};
		Arrays.sort(ft);
		int sum = 0;
		for(int i=0;i<ft.length;i++) {
			sum=sum+(2*ft[i]+1);
		}
		int array1[][]= new int[2*ft[ft.length-1]+1][sum];
		for(int j = 0 ; j<=2*ft[ft.length-1];j++) {
			if(j<=ft[ft.length-1]) {
				if(j<=a) {
					for(int a1 = a-j;a1<=a+j;a1++ ) {
						array1[ft[ft.length-1]-a+j][a1]=1;
					}
				
				}
				if(j<=b) {
					for(int b1 = b-j;b1<=b+j;b1++ ) {
						array1[ft[ft.length-1]-b+j][2*a+1+b1]=1;
					}
				
				}
				if(j<=c) {
					for(int c1 = c-j;c1<=c+j;c1++ ) {
						array1[ft[ft.length-1]-c+j][2*(a+b)+2+c1]=1;
					}
				
				}
				if(j<=d) {
					for(int d1 = d-j;d1<=d+j;d1++ ) {
						array1[ft[ft.length-1]-d+j][2*(a+b+c)+3+d1]=1;
					}
				
				}
				
				
				
		}
			else {
				if(j<ft[ft.length-1]+1+a) {
					array1[j][a]=1;
				}
				if(j<ft[ft.length-1]+1+b) {
					array1[j][2*a+1+b]=1;
				}
				if(j<ft[ft.length-1]+1+c) {
					array1[j][2*a+2*b+2+c]=1;
				}
				if(j<ft[ft.length-1]+1+d) {
					array1[j][2*a+2*b+2*c+3+d]=1;
				}
			}
			
			
		}
		for(int g=0;g<array1.length;g++) {
				for(int h = 0;h<array1[g].length;h++) {
					if(array1[g][h]==0) {
						System.out.print(" ");
					}
					else {
						System.out.print("*");
					}
					
				}
				System.out.println();
			}
		
	}

}
