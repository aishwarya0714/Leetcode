import java.util.Arrays;

public class NoOfWordsInArray {
    public static void main(String[] args) {
        String[] arr = {"alice and bob love leetcode","i think so too","this is great thanks very much"};
/* 
// ===================== broutforn approach ====================//
        // 1. traver each index then 
        // 4.create new int array which store length of each seperated arr index
        int[] count = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            // 2. create new string array, split reach word from sentence and add it to new array
            String[] s = arr[i].split("\\s+");
            // 3.add the length of array into new int array
            count[i]=s.length;
            // System.out.println(Arrays.toString(s));
        }
        //5.print greatest fron count array- sort the array and pring last elm
        Arrays.sort(count);
        System.out.println(count[count.length-1]);
*/
// ===================== optimized approach ============================

        int max=0;
        for(int i =0;i<arr.length;i++){
            String[] count = arr[i].split("\\s+");
            int no = count.length;
            max = Math.max(max, no);
        }
        System.out.println(max);
        
    }
}
