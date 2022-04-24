package basicPrograms;

public class factorial {
    public static void main(String a[]){

        int number = 5;
        int fact =1;
        for (int i =1;i<=number;i++){
            fact = fact*i;

        }
        System.out.println(fact);
    }
}
