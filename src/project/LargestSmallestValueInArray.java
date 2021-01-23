package project;

import java.util.Arrays;

public class LargestSmallestValueInArray {

	public static void main(String[] args) {
		
		int numbers[] = {25 , -65 , 87 , 99};
		int largest = numbers[0];
		int smallest = numbers[0];
		for(int i=1;i<numbers.length;i++) {
			if(numbers[i]>largest) {
				largest = numbers[i];
			}
			else if(numbers[i]<smallest) {
				smallest = numbers[i];
			}
		}
		
		System.out.println("The given Array is::"+Arrays.toString(numbers));
		System.out.println("Smallest number is::"+smallest);
		System.out.println("Largest number is::"+largest);

	}

}
