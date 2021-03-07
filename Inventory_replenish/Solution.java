import java.util.*;
import java.lang.*;

class Inventory{
    private String inventoryId;
    private int maximumQuantity;
    private int currentQuantity;
    private int threshold;
    public Inventory(String id,int max_q,int c_q,int t){
        this.inventoryId = id;
        this.maximumQuantity = max_q;
        this.currentQuantity = c_q;
        this.threshold = t;
    }
    public int getThreshold(){
        return this.threshold;
    }
    public String getId(){
        return this.inventoryId;
    }
}
public class Solution
{
    private static Inventory[] replenish(Inventory[] inv_array,int limit){
        Inventory[] new_inv = new Inventory[0];
        for(int i=0;i<4;i++){
            if(limit >= inv_array[i].getThreshold()){
                new_inv = Arrays.copyOf(new_inv,new_inv.length+1);
                new_inv[new_inv.length-1] = inv_array[i];
            }
        }
        return new_inv;
    }
    public static void main(String[] args) {
        Inventory[] inv_array = new Inventory[4];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++){
            inv_array[i] = new Inventory(sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt());
        }
        int l = sc.nextInt();
        Inventory[] new_array = replenish(inv_array,l);
        for(int i=0;i<new_array.length;i++){
            if(new_array[i].getThreshold()>=75)
                System.out.println(new_array[i].getId() + " Critical Filling");
            else if((new_array[i].getThreshold()>=50) && (new_array[i].getThreshold()<=74))
            System.out.println(new_array[i].getId() + " Moderate Filling");
	       else
            System.out.println(new_array[i].getId() + " Non-Critical Filling");
        }
    }
}