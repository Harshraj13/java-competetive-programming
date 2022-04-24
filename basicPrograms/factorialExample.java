package basicPrograms;
import java.util.Scanner;

public class factorialExample {
    
    public int factorial(int number){
        // resursive
        if (number == 1)
            return 1;
        else
            return number*factorial(number-1);
    }
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        factorialExample fe = new factorialExample();
        System.out.println(fe.factorial(number));
        sc.close();
    }
}
