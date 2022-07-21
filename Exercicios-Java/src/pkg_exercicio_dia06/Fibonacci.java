package pkg_exercicio_dia06;

public class Fibonacci {
    static long fibo(int n) {
        return (n < 2) ? n : fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        for (int n = 1; n < 100; n++) {
            System.out.println(n + Fibonacci.fibo(n));
        }
    }
}
