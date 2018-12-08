package Testmater;

import java.util.Arrays;

public class ArrayExample {
	public static void main(String[] args) {
		int[] arrNumber = new int[3];
		
		arrNumber[0]= 10;
		arrNumber[1] = 11;
		arrNumber[2] = 22;
		
		int[] parramNumber = Arrays.copyOf(arrNumber, arrNumber.length);
		
		int[] newArray = ArrayModification(parramNumber);
		
		for(int number:newArray)
		{
			System.out.println(number);
		}
		System.out.println("--");
		for(int number:arrNumber)
		{
			System.out.println(number);
		}
	}
	
	public static int[] ArrayModification(int[] arrNumber) {
		// TODO Auto-generated constructor stub
		arrNumber[0]=100;
		
		return arrNumber;
	}
	
	
}
