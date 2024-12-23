public class Fibonaccitugas {
    public static void fibonacci(int n, int a, int b){
        if(n == 1){
            return;
        }else{
            System.out.print(a+ " ");
            fibonacci(n-1,b,a+b);
        }
    }
    public static void main(String[] args) {
        int n = 10;
        int a = 1;
        int b = 1;
        fibonacci(n,a,b);
    }
}
