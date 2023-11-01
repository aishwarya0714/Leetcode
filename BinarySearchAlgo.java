package Array;

public class BinarySearchAlgo{
    public static void main(String[] args) {
        int[] arr = {1,2,4,7,8,10};
        int target = 8;
        System.out.println(findNum(arr,target));
    }
    static int findNum(int[] arr,int target){
        int s = 0;
        int e = arr.length -1;

        while(s<=e){
            int mid = s+(e-s)/2;

            if(target>arr[mid]){
                s = mid+1;
            }
            else if(target<arr[mid]){
                e = mid -1;
            }
            else{
                return mid;
            }
        }

        return -1;
    }
}