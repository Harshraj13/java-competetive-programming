
public class fibonacciExample2 {
	public static void main(String a[]) {
		fibonacciExample2 f2 = new fibonacciExample2();
		f2.fibonacciPrint(10);
	}
	public int fibonacciPrint(int count) {
		
		int n = 0; int n1 = 1; int n3;
		System.out.println(n);
		System.out.println(n1);
		for(int i =2; i<count;i++) {
			n3 = n+n1;
			System.out.println(n3);
			
			n = n1;
			n1 = n3;
			
			
		}
		return 0;
	}
}
