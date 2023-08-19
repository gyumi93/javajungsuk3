public class Ex_07 {

	public static void main(String[] args) {
		for (int i=1;i<6;i++) {
			for (int j=1;j<i+5;j++) {
				
				if (i>=j || i<j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
// 