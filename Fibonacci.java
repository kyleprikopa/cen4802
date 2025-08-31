public class Fibonacci {
    
    /**
     * Calculates the nth term in the Fibonacci sequence using recursion.
     * The Fibonacci sequence is defined as: F(0)=0, F(1)=1, F(n)=F(n-1)+F(n-2).
     * 
     * @param n the position in the Fibonacci sequence to calculate (must be non-negative)
     * @return the value of the nth term in the Fibonacci sequence
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    public static void main(String[] args) {
        int n = 10;
        int result = fibonacci(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + ".");
    }
}