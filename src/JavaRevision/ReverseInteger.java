package JavaRevision;

public class ReverseInteger {

	public static void main(String[] args) {
		
		int n=121;
		int temp;
		temp=n;
		int rev=0;
		int r=0;
		
		while(temp>0) {
			r=temp%10;
			rev=rev*10+r;
			temp=temp/10;
		}
		
		System.out.println(rev);
		if(n==rev)
			System.out.println("Given Number is Palindrome");
		
		else
			System.out.println("Given Number is not a Palindrome");
			

	}

}
