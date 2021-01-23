package JavaRevision;

public class TwoDArray {

	public static void main(String[] args) {
		
		String a[][] = new String[3][4];
		a[0][0] = "shikha";
		a[0][1] = "ritesh";
		a[0][2] = "harsh";
		a[0][3] = "arti";
		a[1][0] = "gaurav";
		a[1][1] = "tannu";
		a[1][2] = "ayushi";
		a[1][3] = "karan";
		a[2][0] = "anna";
		a[2][1] = "sam";
		a[2][2] = "viraj";
		a[2][3] = "samar";
		
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.println(a[i][j]);
			}
		}

	}

}
