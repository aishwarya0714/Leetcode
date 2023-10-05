package Array;
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class FindEvenDigitNum{
    public static void main(String[] args) {
        int[] arr = {12,4,222,6443,67,3};
        System.out.println(EvenDigitNum(arr));
    }

    static int EvenDigitNum(int[] arr){
        int count = 0;

        for(int i =0;i<arr.length;i++){
            if(arr[i]>0){
                String s=Integer.toString(arr[i]);
                if(s.length()%2==0){
                    count++;
                }
            }
        }

        return count;

    }
}
