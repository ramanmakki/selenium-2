package project3;

public class project4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int fact = 1;
		// compute the factorial of the numbers through 5 
		for(int i = 1; i <= 5; i++) {
		sum += i; // i is known throughout the loop
		fact = fact*i;
		
		// but, i is not known here.
		System.out.println("Sum is " + sum); 
		System.out.println("Factorial is " + fact);
		}
	}
}

