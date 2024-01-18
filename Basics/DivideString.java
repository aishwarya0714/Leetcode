public class DivideString {
    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";
        if(str1.contains(str2)){
            String str = str1.substring(str2.length());
            System.out.println(str);
        }
        
        
    }
}
