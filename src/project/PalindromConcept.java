package project;

public class PalindromConcept {
	
	
	
	public static void Palindrom(int num) {
		
		int r = 0;
		int sum = 0;
		int temp = num;
		System.out.println("Temp "+temp);
		
		while(num > 0) {
			r = num % 10;
			System.out.println("r "+r);
			sum = sum*10 + r;
			System.out.println("sum "+sum);
			num = num/10;
			System.out.println("num "+num);
		}
		
		if(temp == num) {
			System.out.println(temp+" is a Palindrom");
		}
		
		System.out.println(temp+" is not a Palindrom");
		
	}

	public static void main(String[] args) {
		
		Palindrom(140);
		
	}

}
