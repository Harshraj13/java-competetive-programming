
public class fibonacciExample1 {
	public static void main(String arg[]) {
		
		System.out.println("Hello World");
		
		fibonacciExample1 f1 = new fibonacciExample1();
		
		f1.PrintFibonaci(10);
	}
	public int PrintFibonaci(int count) {
		int n1 = 0;
		int n2 = 1;
		int n3;
		
		System.out.println(" "+n1+" \n"+" "+n2); 
		
		for(int i =2 ;i<count;i++) {
			n3 = n1 +n2;
			System.out.println(" "+n3);
			n1 = n2;
			n2 = n3;
		}
		return 0;
	}
}
