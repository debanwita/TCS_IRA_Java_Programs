import java.util.*;
import java.lang.*;

public class Solution4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++){
            if(i%2!=0){
                System.out.print(str.charAt(i));
            }
        }

    }
}
