import java.util.*;
import java.lang.*;

class Medicine{
    private String medicineName;
    private String batch;
    private String disease;
    private String price;

    public Medicine(String n,String b,String d,String p){
       this.medicineName = n;
       this.batch = b;
       this.disease = d;
       this.price = p;
    }
    public String getDisease(){
        return this.disease;
    }
    public String getPrice(){
        return this.price;
    }
}
public class Solution {
    private static Medicine[] getPriceByDisease(Medicine[] med_array,String disease){
        Medicine[] med= new Medicine[0];
        for(int i=0;i<4;i++){
            if(med_array[i].getDisease().equalsIgnoreCase(disease)){
                med = Arrays.copyOf(med,med.length+1);
                med[med.length-1] = med_array[i];
            }
        }
        
        return med;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Medicine[] med_array = new Medicine[4];
        for(int i=0;i<4;i++){
            med_array[i] = new Medicine(sc.next(),sc.next(),sc.next(),sc.next());
        }
        String d = sc.next();
        Medicine[] med = getPriceByDisease(med_array,d);
        for(int i=0;i<med.length;i++){
            System.out.println(med[i].getPrice());
        }
    }
}
