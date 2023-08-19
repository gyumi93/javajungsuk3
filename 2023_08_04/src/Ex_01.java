// 2023_08_04 수업내용 : 별찍기 10문제+@ (풀이 완료)

public class Ex_01 {

	public static void main(String[] args) {
		for (int i=1;i<6;i++) {
			for (int j=1;j<6;j++) {
				
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