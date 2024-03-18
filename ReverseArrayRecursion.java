//reversing an array using recursion
class HelloWorld {
    public static void main(String[] args) {
       int arr[]={1,2,3,4,5};
       reverse(arr,0, arr.length-1);
       for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
       }
    }
    static void reverse(int[] arr, int i, int e){
        if(i>=e){
            return;
        }
        int temp = arr[i];
        arr[i]=arr[e];
        arr[e]=temp;
        
        reverse(arr, i+1, e-1);
    }
}
