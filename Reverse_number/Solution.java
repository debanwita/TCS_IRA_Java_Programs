import java.lang.*;
import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number>0){
            int n =number;
            int d,rev_num=0;
            while(n!=0){
                d = n%10;
                rev_num = rev_num*10 + d;
                n = n /10;
            }
            System.out.println(rev_num);
        }
        else
            System.out.println("Invalid number");
    }
}
