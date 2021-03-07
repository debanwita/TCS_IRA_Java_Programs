import java.util.*;
import java.lang.*;

class TravelAgencies{
    private int regNo;
    private String agencyName;
    private String packageType;
    private int price;
    private boolean flightFacility;

    public TravelAgencies(int regNo,String agencyName,String packageType,int price,boolean flightFacility){
        this.regNo = regNo;
        this.agencyName = agencyName;
        this.packageType = packageType;
        this.price = price;
        this.flightFacility = flightFacility;
    }
    public int getPrice(){
        return this.price;
    }
    public int getId(){
        return this.regNo;
    }
    public String getPackage(){
        return this.packageType;
    }
    public String getAgencyName(){
        return this.agencyName;
    }
    public boolean getFlightFacility(){
        return this.flightFacility;
    }
}
public class Solution {
    private static int findAgencyWithHighestPackagePrice(TravelAgencies[] tas){
        int high=0;
        for(int i=0;i<4;i++){
            if(tas[i].getPrice()>high){
                high = tas[i].getPrice();
            }
        }
        return high;
    }

    private static TravelAgencies agencyDetailsForGivenIdAndType(TravelAgencies[] tas,int regNo,String packageType){
        TravelAgencies ob = null;
        for(int i=0;i<4;i++){
            TravelAgencies t = tas[i];
            if(t.getId()==regNo && t.getPackage().equalsIgnoreCase(packageType)){
                ob = t;
            }
        }
        return ob;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        TravelAgencies[] tas = new TravelAgencies[4];
        for(int i=0;i<4;i++){
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String ptype = sc.next();
            int price = sc.nextInt();
            boolean b = sc.nextBoolean();
            tas[i] = new TravelAgencies(id,name,ptype,price,b);
        }

        /*for(int i=0;i<4;i++){
            TravelAgencies ob = tas[i];
            System.out.println(ob.getId() + " : " + ob.getAgencyName() + " : "  + ob.getPackage() + " : " + ob.getPrice() + " : " + ob.getFlightFacility());
        }*/
        int regno = sc.nextInt();
        String type = sc.next();
        System.out.println(findAgencyWithHighestPackagePrice(tas));
        TravelAgencies ob = agencyDetailsForGivenIdAndType(tas,regno,type);
        if(ob!=null){
            System.out.println(ob.getAgencyName() + ":" + ob.getPrice());
        }
    }
}
