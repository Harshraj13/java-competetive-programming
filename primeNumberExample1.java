
public class primeNumberExample1 {
	
	public static void main(String a[]) {
		System.out.println("Program to print Prime numbers ");
		checkPrime(13);
		checkPrime(1);
	}
	public static void checkPrime(int num) {
		int m = num/2;
		int flag=0 ;
		if (num<1) {
			System.out.println("Number is not Prime");
			
		}
		else {
			for (int i =2 ; i<=m;i++) {
				
				if(num%i==0) {
					System.out.println("Number is not Prime");
					flag = 1;
					break;
					
				}
				
			}
			if(flag == 0) {
				System.out.println(num +" Number is prime");
			}
			
		}
	}
}
