import java.util.*;
public class bit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x =0;
        while(n>0){
            String st = sc.next();
            if(st.charAt(1)=='+'){
                ++x;
            }
            else if(st.charAt(1)== '-'){
                --x;
            }
            n--;
        }
        System.out.print(x);

    }
    
}
