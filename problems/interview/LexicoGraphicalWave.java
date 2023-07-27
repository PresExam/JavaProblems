package problems.interview;

public class LexicoGraphicalWave{
    static void wave(int arr[], int n){
//        int a = 0;
//        int i = arr[a];
//        arr[a] = arr[a+1];
//        arr[a+1] = i;
//        i = arr[a+2];
//        arr[a+2] = arr[a+3];
//        arr[a+3] = i;
//        i = arr[a+4];
//        arr[a+4] = arr[a+5];
//        arr[a+5] = i;
        int temp;
        for(int i = 0; i < arr.length-1; i+=2){
            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int n = arr.length;
        wave(arr, n);
        for(int x : arr){
            System.out.print(x+"\t");
        }
    }
}
