import java.util.*;
public class A_Soldier_and_Bananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k,n,w,total=0;
        k = sc.nextInt();
        n = sc.nextInt();
        w = sc.nextInt();
        for(int i=1;i<=w;i++){
            total += k*i;               
    }
        if(total>n){
            System.out.println(total-n);
        }
        else{
            System.out.println("0");
        }
    }
}