import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] array = str.split(" ");
        for(int i=0;i<array.length;i++){
            if(array[i].length()>0){
                int len = array[i].length();
                char c = array[i].charAt(len-1);
                if((c>='A' && c<='Z')||(c>='a' && c<='z')){
                    System.out.print(c);
                }
            }
        }
    }
}

