public class Fibonacci {
    public static void main(String[] args) {
        long n = 6;
        System.out.println(fibonacci(n));
    }

    public static long fibonacci(long n){
        if((n==0)||(n==1)){
            return n;
        }
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
        
    }
}
