import java.util.*;
public class ThreaterSquare {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long l = sc.nextInt();
        long b = sc.nextInt();
        long a = sc.nextInt();
        long c = l/a;
        long d = b/a;
        if(l%a !=0) ++c;
        if(b%a !=0) ++d;
        System.out.print(c*d);
    }
    
}
