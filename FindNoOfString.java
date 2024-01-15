import java.util.ArrayList;
import java.util.Arrays;

public class FindNoOfString {
    public static void main(String[] args) {
        String[] s = {"leet","cod","emp"};
        String x = "e";
        ArrayList<Integer> newArr = new ArrayList<>();
        for(int i = 0;i<s.length;i++){
            if(s[i].contains(x)){
                newArr.add(i);
            }
        }
        System.out.println(newArr);
    }
}
