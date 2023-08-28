import java.util.*;
public class NextRound {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count =0;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            ans.add(sc.nextInt());
        }
        int comp = ans.get(k-1);
        
        for(int i=0;i<n;i++){
            if(comp<=ans.get(i) && ans.get(i) !=0){
                count++;
            }
        }
        System.out.print(count);

    }
    
}
