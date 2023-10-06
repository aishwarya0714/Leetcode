package Array;

public class FindMaxNegPos {
   public static void main(String[] args) {
    int arr[] = { -5, -3,1 ,2,3};
    System.out.println(findMax(arr));
   } 
   static int findMax(int[] arr){
    int s=0;
    int e=arr.length-1;
    int p=0;
    int n=0;
    while(s<=e){
        int mid = (s+e)/2;
        if(arr[mid]<0){
            n=mid+1;
            p=e-n;
            if(arr[mid+1]<0){
                n++;
                p--;
            }
        }
        else if(arr[mid]>=0){
            n=mid;
            p=e-(n-1);
        }
       if(n>p){
        return n;
       } 
       else{
        return p;
       }
    }
    return -1;
   }
}
