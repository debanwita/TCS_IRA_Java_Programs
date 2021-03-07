import java.util.*;
import java.lang.*;

class Institution{
    private int institutionId;
    private String institutionName;
    private int noOfStudentsPlaced;
    private int noOfStudentsCleared;
    private String location;
    private String grade;

    public Institution(int id,String name,int s_placed, int s_cleared,String location){
        this.institutionId = id;
        this.institutionName = name;
        this.noOfStudentsPlaced = s_placed;
        this.noOfStudentsCleared = s_cleared;
        this.location = location;
    }

    public int getId(){
        return this.institutionId;
    }
    public String getName(){
        return this.institutionName;
    }
    public int getPlacedStudents(){
        return this.noOfStudentsPlaced;
    }
    public int getClearedStudents(){
        return this.noOfStudentsCleared;
    }
    public String getLocation(){
        return this.location;
    }
    public String getGrade(){
        return this.grade;
    }

    public void setGrade(String g){
        this.grade = g;
    }

}

public class Solution7{
    private static int findNumClearencedByLoc(Institution[] ins_array,String location) {
        int count=0;
        for(int i=0;i<4;i++){
            if(ins_array[i].getLocation().equalsIgnoreCase(location)){
                count+= ins_array[i].getClearedStudents();
            }
        }
        return count;
    }

    private static Institution updateInstitutionGrade(String ins_name,Institution[] ins_array){
        Institution ob = null;
        for(int i=0;i<4;i++){
            if(ins_array[i].getName().equalsIgnoreCase(ins_name)){
                ob =ins_array[i];
                int r = (ins_array[i].getPlacedStudents()*100)/(ins_array[i].getClearedStudents());
                if(r>=80){
                    ins_array[i].setGrade("A");
                }
                else{
                    ins_array[i].setGrade("B");
                }
                break;
            }
        }
        return ob;
    }
    public static void main(String[] args){
        Institution[] ins_array = new Institution[4];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++){
            ins_array[i] = new Institution(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextInt(),sc.next());

        }
        String location = sc.next();
        String ins_name = sc.next();
        int c = findNumClearencedByLoc(ins_array,location);
        if(c==0){
            System.out.println("There are no cleared students in this particular location");
        }
        else{
            System.out.println(c);
        }
        Institution ins = updateInstitutionGrade(ins_name,ins_array);
        if(ins==null){
            System.out.println("No institute is available with this specified name");
        }
        else{
            System.out.println(ins.getName() + ":" + ins.getGrade());
        }
    }
}