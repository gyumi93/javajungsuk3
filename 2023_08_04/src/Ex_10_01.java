public class Ex_10_01 {

	public static void main(String[] args) {
		   for (int i=0; i<5;i++) {
	            for (int j=0;j<5;j++) {
	              
	                if ((i + j < 5) || (i>=j)) {
	                    if (j < 2 && i + j <= 3 && i > j) {
	                        System.out.print(" ");
	                    } else {
	                        System.out.print("*");
	                    }
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println("");
	        }
	    }
	}