package project;

public class ReverseInteger {

	public static void main(String[] args) {

		int num = 123456;
		int sum = 0;
		int r = 0;

		while (num > 0) {
			r = num % 10;
			sum = sum * 10 + r;
			num = num / 10;
		}
		System.out.println(sum);

	}

}
