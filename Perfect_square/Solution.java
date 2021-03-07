import java.util.*;
public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        double res = Math.sqrt(number);
        if((int)res == number){
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }
    }
}
