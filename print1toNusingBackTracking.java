//printing 1 to N using backtracking
class HelloWorld {
    public static void main(String[] args) {
        printname(5,5);
    }
    static void printname(int n,int i){
        if(i==0){
            return;
        }
        
        printname(n,i-1);
        System.out.println(i);
    }
}
