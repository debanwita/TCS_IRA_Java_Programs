import java.lang.*;
import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        char[] rev_str = str.toCharArray();
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(rev_str[i]);
        }

    }
}
