import java.util.*;
public class Team{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i=0;i<n;i++){
            int ans =0;
            for (int j=0;j<3;j++){
                ans = ans + sc.nextInt();
            }
            if (ans>1){
                count++;
            }

        }
        System.out.print(count);
    }
}