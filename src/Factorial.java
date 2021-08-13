public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(3));
        System.out.println(factorial(4));
        System.out.println(factorial(5));
    }

    private static int factorial(int n) {
        if( n == 0){
            return 1;
        }else{
            return n * factorial(n -1);
        }
    }
}
