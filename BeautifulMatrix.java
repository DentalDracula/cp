import java.util.*;
import java.lang.Math;
public class BeautifulMatrix {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                int a = sc.nextInt();
                if(a==1){
                    System.out.print(Math.abs(i-3)+Math.abs(j-3));   
                }
            }
        }

    }
    
}
