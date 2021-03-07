import java.util.*;
import java.lang.*;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] char_array = str.toCharArray();
        char[] new_str = new char[0];
        for(int i=0;i<char_array.length;i++){
            char ch = char_array[i];
            if(ch!=' '){
                boolean find=false;
                for(int j=0;j<new_str.length;j++){
                    if(new_str[j] == ch){
                        find = true;
                        break;
                    }
                }
                if(find==false){
                    new_str = Arrays.copyOf(new_str,new_str.length+1);
                    new_str[new_str.length-1] = ch;
                }
            }
        }
        System.out.println();
        for(int i=0;i<new_str.length;i++) {
            System.out.print(new_str[i]);
        }
    }
}
