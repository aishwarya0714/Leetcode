package Array;
// https://leetcode.com/problems/search-insert-position/
public class findNum {
    public static void main(String[] args) {
        int[] arr = {1,3,5,8};
        int target = 9;
        System.out.println(findNumInd(arr,target));
    }
    static int findNumInd(int[] arr,int target){
        int s=0;
        int e= arr.length-1;

        while(s<=e){
            int mid=(s+e)/2;
            if(target<arr[mid]){
                e=mid-1;
            }
            else if(target>arr[mid]){
                s=mid+1;  
            }
            else{
                return mid;
            } 
        }
        return s;
    }
}
