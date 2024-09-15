package kausik_khuntia_week04_assignment;
import java.util.Scanner;

	class CustomException extends Exception {
	    public CustomException(String message) {
	        super(message);
	    }
	}

	public class ExceptionHandlingDemo {

	    public static void performOperations(int number) throws CustomException {
	        if (number < 0) {
	            throw new CustomException("Custom Exception: Negative numbers are not allowed!");
	        }

	        
	        String str = null;
	        if (number == 0) {
	            System.out.println(str.length());
	        }

	       
	        System.out.println("Result of division by number: " + (10 / number));
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a number: ");
	        int number = sc.nextInt();

	        try {
	            performOperations(number);
	        } catch (NullPointerException e) {
	            System.out.println("Caught NullPointerException: " + e.getMessage());
	        } catch (ArithmeticException e) {
	            System.out.println("Caught ArithmeticException: " + e.getMessage());
	        } catch (CustomException e) {
	            System.out.println(e.getMessage());
	        } finally {
	            System.out.println("Operation complete.");
	        }

	       
	    }
	}


