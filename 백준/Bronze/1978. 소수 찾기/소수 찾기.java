import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        boolean pN[] = new boolean[1001];
        pN[1] = true;
        for(int i=2; i*i<=1000; i++)
            if(!pN[i])
                for(int j=i*i; j<=1000; j+=i)
                    pN[j] = true;
        int isPN;
        int cnt=0;
        for(int i=0; i<num; i++){
            isPN = input.nextInt();
            if(!pN[isPN])
                cnt++;
        }
        System.out.println(cnt);
    }
}