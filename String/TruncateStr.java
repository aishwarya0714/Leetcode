import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TruncateStr {
    public static void main(String[] args) {
        String str = "Hello how are you Contestant";
        int k = 4;
        StringBuilder re = new StringBuilder();
        String[] arr = str.split("\\s+");
        for(int i =0;i<k;i++){
            re.append(arr[i]+" ");
        }
        System.out.println(re.toString().trim());
        
    }
}
