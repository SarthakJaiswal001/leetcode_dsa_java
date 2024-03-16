//sum of first n numbers using recursion using parameters
class HelloWorld {
    public static void main(String[] args) {
        sum(5,0);
    }
    static void sum(int n,int sum){
        if(n<1){
            System.out.println(sum);
            return;
        }
        sum(n-1, sum+n);
    }
    
}
//sum of first n numbers using recursion using function return
class HelloWorld {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
       return n + sum(n-1);
    }
    
}
