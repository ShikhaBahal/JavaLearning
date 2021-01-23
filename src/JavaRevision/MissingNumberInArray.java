package JavaRevision;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4};
		int sum = 0;
		int actualsum = 0;
		System.out.println(a.length);
		for(int i=0;i<a.length;i++) {
			sum = sum+a[i];
		}
		
		for(int j=1;j<=4;j++) {
			actualsum = actualsum+a[j];
		}
		
		if(sum==actualsum)
			System.out.println("All numbers are available in array");
		else {
			int missing_num = actualsum-sum;
			System.out.println("Missing number is "+missing_num);
			
		}
			

}
}
