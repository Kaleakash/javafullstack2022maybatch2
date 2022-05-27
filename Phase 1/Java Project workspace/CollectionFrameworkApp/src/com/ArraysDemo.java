package com;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
	int num[]= {2,1,5,8,7,6,3,9};
	System.out.println("Before sort");
	for(int n : num) {
		System.out.print(" "+n);
	}
	Arrays.sort(num);
	System.out.println();
	System.out.println("After sort");
	for(int n : num) {
		System.out.print(" "+n);
	}
	System.out.println("Search ");
	//System.out.println(Arrays.binarySearch(num, 5)); it will provide you index position
	//System.out.println(Arrays.binarySearch(num, 100));	if not present it return less than 0
	if(Arrays.binarySearch(num, 6)>=0) {
		System.out.println("Number present ");
	}else {
		System.out.println("Number is not present");
	}

	}

}
