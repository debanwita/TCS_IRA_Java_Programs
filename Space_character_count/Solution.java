import java.util.*;
import java.lang.*;
public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        char[] char_array = string.toCharArray();
        int char_count=0,space_count=0;
        for(int i=0;i<char_array.length;i++){
            char c = char_array[i];
            if(c==' '){
                space_count++;
            }
            else{
                char_count++;
            }
        }
        System.out.println("No of spaces : " + space_count + " and characters : " + char_count);
    }
}
