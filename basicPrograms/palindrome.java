package basicPrograms;

public class palindrome {
    public static void main(String args[] ) throws Exception {
        // java code to check number is palindrome or not

        int number , temp , remainder ,sum;
        number = 1221;

        temp = number;
        sum = 0;

        while(number>0){
            remainder = number%10;
            sum = (sum*10) + remainder;
            number = number/10;
        }
        if (temp ==sum)
            System.out.println(temp+" The number is palindrome");
        else
            System.out.println(temp+ " The number is not palindrome");
    }
}
