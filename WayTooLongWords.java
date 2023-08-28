import java.util.*;
public class WayTooLongWords{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            ans.add(sc.next());
        }
        for(int i=0;i<n-1;i++){
            String a = ans.get(i);
            int num = a.length();
            if (num> 10){
                System.out.println(Character.toString(a.charAt(0)) + Integer.toString(num-2) + Character.toString(a.charAt(num-1)));            
            }
            else{
                System.out.println(a);
            }      
                    
        }
        String a = ans.get(n-1);
        int num = a.length();
        if (num> 10){
            System.out.print(Character.toString(a.charAt(0)) + Integer.toString(num-2) + Character.toString(a.charAt(num-1)));            
        }
        else{
            System.out.print(a);
        }
        

    }
}