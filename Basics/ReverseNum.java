import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a =0;
        while(num>0){
            int rem = num %10;
            num /=10;
            a = a* 10 +rem;
            
        }
        System.out.println(a); 
    }
}
