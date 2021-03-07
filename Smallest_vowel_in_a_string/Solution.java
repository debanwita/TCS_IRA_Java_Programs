import java.util.*;
import java.lang.*;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        char[] char_array = string.toCharArray();
        char min_v = '#';
        for(int i=0;i<char_array.length;i++){
            char c= char_array[i];
            if(c=='A' || c=='a' || c=='e' || c=='E' || c=='i' || c=='o' || c=='O' || c=='U' || c=='u'){
                if(min_v=='#'){
                    min_v = c;
                }
                else{
                    if(c<min_v){
                        min_v = c;
                    }
                }
            }
        }
        if(min_v!='#'){
            System.out.println(min_v);
        }
    }
}
