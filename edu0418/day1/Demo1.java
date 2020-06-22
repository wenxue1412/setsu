package edu0418.day1;

public class Demo1 {

	public static void main(String[] args) {

		System.out.println("Hello World");
		System.out.println(addSum(0, 100));
		System.out.println(getRoomCount(10, 3));
		System.out.println(getRoomCount(9, 3));
		printTri(5);
		printTri(3);
		System.out.println(ten2Hex(29));
		int array[]= {8,5,1,3,7,6};
		bubbleSort(array);
		printArray(array);
	}

	private static int addSum(int start, int end) {
		// 从start累加到end
		int i = 0;
		int sum = 0;
		for (i = start; i <= end; i++) {
			sum = sum + i;
		}
		return sum;
	}

	private static int getRoomCount(int n, int c) {
		int sum = 0;
		sum = n / c;
		if (n % c != 0) {
			sum = sum + 1;
		}
		return sum;
	}

	private static void printTri(int i) {
		for (int j = 0; j < i; j++) {
			for (int k = 0; k < i - j; k++) {
				System.out.print(" ");
			}
			for (int l = 0; l < 2 * j + 1; l++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	private static String ten2Binary(int number) {
		StringBuilder strb = new StringBuilder();
		while (number != 0) {
			strb.append(number % 2);
			number = number / 2;
		}
		return strb.reverse().toString();
	}
	private static String ten2Hex(int number) {
		StringBuilder strb = new StringBuilder();
		while (number != 0) {
			String res=null;
			switch(number % 16) {
			    case 10:
			    	res="A";
			        break;
			    case 11:
			    	res="B";
			        break; 
			    case 12:
				    res="C";
				    break; 
				case 13:
					res="D";
					break;
				case 14:
					res="E";
					break;
				case 15:
					res="F";
					break;
				default:
					res=(number%16)+"";
				    break;
			    
			}
			strb.append(res);
			number = number / 16;
		}
		return strb.reverse().toString();
		}
	
	private static void bubbleSort(int[] array) {
		for(int i=0;i<array.length-1;i++) {
			for(int j=i+1; j <array.length;j++) {
				if(array[i]<array[j]) {
					int t = array[i];
					array[i]=array[j];
					array[j]=t;
				}
			}
		}
			
	}
	private static void printArray(int[]array) {
		for(int i :array) {
			System.out.print(i+",");
		}
	}
}
