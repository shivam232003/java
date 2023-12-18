package M1;

public class Q39 {
	public static void main(String[] args) {
		 try {
	            int[] a = new int[5];

	            try {
	                // Trying to access an element beyond the array size
	                a[5] = 30 / 0;
	            } catch (ArrayIndexOutOfBoundsException e) {
	                System.out.println("Inner catch block: ArrayIndexOutOfBoundsException");
	            } catch (ArithmeticException e) {
	                System.out.println("Inner catch block: ArithmeticException");
	            }

	        } catch (Exception e) {
	            System.out.println("Outer catch block: Exception");
	        }
	    }
	}