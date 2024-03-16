//sum of first n numbers using recursion
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
