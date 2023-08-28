import java.util.*;
public class PetyaAndStrings {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        String second = sc.next();
        String ft = first.toLowerCase();
        String sd = second.toLowerCase();
        int c =0;
        for(int i=0;i<ft.length();i++){
            if (ft.charAt(i)>sd.charAt(i)){
                c=1;
                break;
            }
            if(ft.charAt(i)<sd.charAt(i)){
                c=-1;
                break;
            }
        }
        System.out.print(c);


    }
    
}
