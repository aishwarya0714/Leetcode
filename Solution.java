class Solution {
    public String restoreString(String s, int[] indices) {
        
        StringBuffer  str = new StringBuffer();
        for(int i=0;i<indices.length;i++){
            str.insert(i,s.charAt(indices[i]));
        }
        return str.toString();

    }
}

//https://leetcode.com/problems/shuffle-string/
