//printing in reverse 
class HelloWorld {
    public static void main(String[] args) {
        printname(5,5);
    }
    static void printname(int n,int i){
        if(i==0){
            return;
        }
        System.out.println(i);
        printname(n,i-1);
        
    }
}
