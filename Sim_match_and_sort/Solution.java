import java.util.*;
import java.lang.*;

class Sim{
    private int id;
    private String company;
    private int balance;
    private double ratePerSecond;
    private String circle;
    public Sim(int id,String company,int balance,double ratePerSecond,String circle){
        this.id = id;
        this.company = company;
        this.balance = balance;
        this.ratePerSecond = ratePerSecond;
        this.circle = circle;
    }
    public double getRate(){
        return this.ratePerSecond;
    }
    public String getCircle(){
        return this.circle;
    }
    public int getBalance(){
        return this.balance;
    }
    public int getId(){
        return this.id;
    }
}
public class Solution {
    private static Sim[] matchAndSort(Sim[] sims,String search_circle,double search_rate){
        Sim[] result = new Sim[0];
        for(int i=0;i<4;i++){
            Sim s = sims[i];
            if(s.getCircle().equalsIgnoreCase(search_circle) && search_rate > s.getRate()){
                result = Arrays.copyOf(result,result.length+1);
                result[result.length-1] = s;
            }
        }
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result.length-i-1;j++){
                if(result[j].getBalance() < result[j+1].getBalance()){
                    Sim temp = result[j];
                    result[j] = result[j+1];
                    result[j+1] = temp;
                }
            }
        }
        return result;
    }
    public static void main(String[] args){
        Sim[] sims = new Sim[4];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++){
            sims[i] = new Sim(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextDouble(),sc.next());
        }
        String circle = sc.next();
        double rate = sc.nextDouble();

        Sim[] new_sims=matchAndSort(sims,circle,rate);
        for(int i=0;i<new_sims.length;i++){
            System.out.println(new_sims[i].getId());
        }
    }
}
