import java.util.*;
import java.lang.*;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] char_array = str.toCharArray();
        int vowel_count=0,consonant_count=0;
        for(int i=0;i<char_array.length;i++){
            char ch = char_array[i];
            if(ch!=' '){
                if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U'){
                    vowel_count++;
                }
                else{
                    if((ch>=65 && ch<=90) || (ch>=97 && ch<=122))
                        consonant_count++;
                }
            }
        }
        System.out.println("Vowels count - " + vowel_count);
        System.out.println("Consonant count - " + consonant_count);
    }
}
