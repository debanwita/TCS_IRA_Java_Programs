import java.util.*;
import java.lang.*;

class Sim{
    private int simId;
    private String customerName;
    private double balance;
    private double ratePerSecond;
    private String circle;

    public Sim(int simId,String customerName,double balance,double ratePerSecond,String circle){
        this.simId = simId;
        this.customerName = customerName;
        this.balance = balance;
        this.ratePerSecond = ratePerSecond;
        this.circle = circle;
    }
    public String getCircle(){
        return this.circle;
    }
    public void setCircle(String circle){
        this.circle =circle;
    }
    public double getRatePerSecond(){
        return this.ratePerSecond;
    }
    public int getId(){
        return this.simId;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public double getBalance(){
        return this.balance;
    }
}
public class Solution {

    private static Sim[] transferCircle(Sim[] sims,String circle1,String circle2){
        Sim[] new_sim = new Sim[0];
        for(int i=0;i<5;i++){
            if(sims[i].getCircle().equalsIgnoreCase(circle1)){
                new_sim = Arrays.copyOf(new_sim,new_sim.length+1);
                new_sim[new_sim.length-1]=sims[i];
                new_sim[new_sim.length-1].setCircle(circle2);
            }
        }
        for(int i=0;i<new_sim.length-1;i++){
            for(int j=0;j<new_sim.length-i-1;j++){
                if(new_sim[j].getRatePerSecond() < new_sim[j+1].getRatePerSecond()){
                    Sim s = new_sim[j];
                    new_sim[j] = new_sim[j+1];
                    new_sim[j+1] = s;
                }
            }
        }
        return new_sim;
    }
    public static void main(String[] args){
        Sim[] sims = new Sim[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            sims[i] = new Sim(sc.nextInt(),sc.next(),sc.nextDouble(),sc.nextDouble(),sc.next());
        }
        String c1 = sc.next();
        String c2 = sc.next();
        Sim[] new_sim = transferCircle(sims,c1,c2);

        for(int i=0;i<new_sim.length;i++){
            System.out.println(new_sim[i].getId() + " " + new_sim[i].getCustomerName() + " " + new_sim[i].getBalance() + " " + new_sim[i].getRatePerSecond() );
        }
    }
}
