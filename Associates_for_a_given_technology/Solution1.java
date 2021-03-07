import java.util.*;
import java.lang.*;

class Associate{
    int id;
    String name;
    String technology;
    int exp_years;

    public Associate(int id,String name,String technology,int exp_years){
        this.id = id;
        this.name=name;
        this.technology=technology;
        this.exp_years=exp_years;
    }

}
public class Solution1 {
    private static Associate[] associatesForGivenTechnology(Associate[] a,String searchTechnology){
        Associate[] a2 = new Associate[0];
        for(int i=0;i<5;i++){
            if(a[i].technology.equalsIgnoreCase(searchTechnology) && a[i].exp_years %5 ==0){
                a2 = Arrays.copyOf(a2,a2.length+1);
                a2[a2.length-1] = a[i];
            }
        }
        return a2;
    }
    public static void main(String[] args){
        Associate[] a1= new Associate[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            int id = sc.nextInt();
            String name = sc.next();
            String technology = sc.next();
            int exp_years=sc.nextInt();
            a1[i] = new Associate(id,name,technology,exp_years);
        }

        String t = sc.next();
        Associate[] a2 = associatesForGivenTechnology(a1,t);

        for(int i=0;i<a2.length;i++){
            System.out.println(a2[i].id);
        }
    }
}
