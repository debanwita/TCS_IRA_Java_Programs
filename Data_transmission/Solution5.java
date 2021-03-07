import java.util.*;
import java.lang.*;


public class Solution5 {
    private static int isPrime(int n){
        int flag=1;
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                flag=0;
                break;
            }
        }
        return (flag);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        /*String input=null;
        input = input1.substring(0,input1.length()-1);
        String[] input_array = input.split(" ");*/

        input=input.replace(";"," ");
        String [] input_array = input.split(" ");
        int [] input_number = new int[input_array.length];

        for(int i=0;i<input_array.length;i++){
            input_number[i] = Integer.parseInt(input_array[i]);
        }


        int prime1=0,prime2=0,count=0;
        for(int i=0;i<input_array.length;i++){
            //System.out.print(input_number[i] + " ");
            if(isPrime(input_number[i])==1){
                count++;
                if(prime1==0 && prime2==0){
                    prime1=input_number[i];
                    prime2=input_number[i];
                }
                else{
                    if(input_number[i] >prime1){
                        prime2 = prime1;
                        prime1 = input_number[i];
                    }
                    else{
                        if(input_number[i]>prime2){
                            prime2= input_number[i];
                        }
                    }
                }
            }
        }
        int prefix = count+prime2;
        System.out.println(prefix);
    }
}
