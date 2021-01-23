package project;

public class MissingNumberInArray {

	public static void main(String[] args) {

		int a[] = {1,2,3,4,6,7,8,9,10};
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			sum = sum + a[i];
		}
		System.out.println(sum);
		
		int ActualSum = 0;
		for(int i=1;i<=10;i++) {
			ActualSum = ActualSum+i;
		}
		System.out.println(ActualSum);
		
		if(ActualSum == sum) {
			System.out.println("All number are available in array");
		}
		else
		System.out.println("Missing Number is ::::"+(ActualSum-sum));

	}

}
