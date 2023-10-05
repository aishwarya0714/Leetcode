package Array;
public class FindGreatsSumOfArrElm2D {
    public static void main(String[] args) {
        int[][] accounts = {
            {1,2,3},
            {2,4},
            {4,5,7,8},        
        };

        // call our method here
        System.out.println(findElm(accounts));
    }
    static int findElm(int[][] account){
        // initialize max value
        int max = Integer.MIN_VALUE;
        // itrate throw row in array
        for(int row =0;row<account.length;row++){
            // initialize sum 
            int sum = 0;
            // iterate through columns of each row
            for(int col =0;col<account[row].length;col++){
                sum+=account[row][col];
            }
            // check sum with max value
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
}
