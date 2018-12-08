package Testmater;

import java.util.ArrayList;
import java.util.Random;
/*
 * Tạo một danh sách (array/arrayList) gồm 10 phần tử, 
 * sử dụng Random nhập dữ liệu cho danh sách này.
Sau đó đếm xem có bao nhiêu số chẵn, bao nhiêu số lẻ.
 */
public class ArrayListExample {
	public static void main(String[] args) {
		//Count number
		int totalNumber1=0, totalNumber2=0;
		//Define array list to store 10 element
		ArrayList<Integer> arrNumber = new ArrayList<Integer>();
		//Define random to generate number
		Random rd = new Random();
		//Input 10 element
		for(int i=0; i<10; i++)
		{
			int number = rd.nextInt();
			arrNumber.add(number);
		}
		//Print to check
		for(int number:arrNumber)
		{
			System.out.println(number);
			if(number%2==0)
				totalNumber1++;
			else
				totalNumber2++;
		}
		//Print result
		System.out.println("Co "+ totalNumber1 + " so chan va "+ totalNumber2 +" so le");
		
		
		
		
	}
}
