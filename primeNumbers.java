
public class primeNumbers {

	public static void main(String[] args) {
		System.out.println("Program to print Prime Numbers: ");
		
		int number = 13;
		int flag = 0;
		int mid = number/2;
		//number to check wheather is prime or not
		
		if(number == 0 || number ==1) {
			System.out.println("Number is not Prime!");
		}
		else {
			for(int i = 2; i<=mid;i++) {
				
				if(number%i==0) {
					System.out.println("Number is not Prime");
					flag = 1;
					break;
				}
			}
			if (flag==0) {
				System.out.println(number+"  is Prime Number");
			}
		}
		

	}

}
