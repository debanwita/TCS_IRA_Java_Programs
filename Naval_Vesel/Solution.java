import java.util.*;
import java.lang.*;

class NavalVessel {
    private int vesselId;
    private String vesselName;
    private int noOfVoyagesPlanned;
    private int noOfVoyagesCompleted;
    private String purpose;
    private String classification ;
    public NavalVessel(int id,String name, int p,int c,String purpose){
        this.vesselId = id;
        this.vesselName = name;
        this.noOfVoyagesPlanned = p;
        this.noOfVoyagesCompleted = c;
        this.purpose = purpose;

    }
    public int getNoOfVoyagesCompleted(){
        return this.noOfVoyagesCompleted;
    }
    public int getNoOfVoyagesPlanned(){
        return this.noOfVoyagesPlanned;
    }
    public String getPurpose(){return this.purpose;}
    public void setClassification(String c){
        this.classification = c;
    }
    public String getClassification(){
        return this.classification;
    }
    public String getVesselName(){
        return this.vesselName;
    }
}
public class Solution {
    private static int findAvgVoyagesPct(NavalVessel[] nv, int parameter_percentage){
        int count=0;
        NavalVessel[] nv_new = new NavalVessel[0];
        for(int i=0;i<4;i++){
            int v = ((nv[i].getNoOfVoyagesCompleted()*100)/nv[i].getNoOfVoyagesPlanned());
            if(v>=parameter_percentage){
                nv_new = Arrays.copyOf(nv_new,nv_new.length+1);
                nv_new[nv_new.length-1] = nv[i];
                count++;
            }
        }
        int sum = 0;
        for(int i=0;i<nv_new.length;i++){
            sum += nv_new[i].getNoOfVoyagesCompleted();
        }
        sum = sum / count;
        return sum;
    }

    private static NavalVessel findVesselByGrade(NavalVessel[] nv,String purpose){
        NavalVessel n=null;
        int i=0;
        for(i=0;i<4;i++){
            if(nv[i].getPurpose().equalsIgnoreCase(purpose)){
                n = nv[i];
                break;
            }
        }
        if(n!=null){
            int p = ((nv[i].getNoOfVoyagesCompleted()*100)/nv[i].getNoOfVoyagesPlanned());
            if(p==100) {
                nv[i].setClassification("Star");
            }
            else if(p>=80 && p<=99){
                nv[i].setClassification("Leader");;
            }
            else if(p>=55 &&p<=79){
                nv[i].setClassification("Inspirer");;
            }
            else
                nv[i].setClassification("Striver");
            n = nv[i];
        }
        return n;
    }

    public static void main(String[] args){
        NavalVessel[] nv = new NavalVessel[4];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++){
            nv[i] = new NavalVessel(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextInt(),sc.next());
        }
        int p = sc.nextInt();
        String purpose = sc.next();
        int c=findAvgVoyagesPct(nv,p);
        System.out.println(c);
        NavalVessel n = findVesselByGrade(nv,purpose) ;
        if(n==null){
            System.out.println("No Naval Vessel is available with the specified purpose");
        }
        else{
            System.out.println(n.getVesselName() + "%" + n.getClassification());
        }

    }
}
