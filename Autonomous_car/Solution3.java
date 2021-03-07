import java.util.*;

class AutonomousCar{
    int carId;
    String brand;
    int noOfTestConducted;
    int noOfTestsPassed;
    String environment;
    String grade;

    public AutonomousCar(int carId,String brand,int noOfTestConducted, int noOfTestsPassed,String environment){
        this.carId=carId;
        this.brand=brand;
        this.noOfTestConducted = noOfTestConducted;
        this.noOfTestsPassed=noOfTestsPassed;
        this.environment=environment;
    }

    public int getId(){
        return this.carId;
    }
    public String getBrand(){
        return this.brand;
    }
    public int getNoOfTestsPassed(){
        return this.noOfTestsPassed;
    }
    public int getNoOfTestsConducted(){
        return this.noOfTestConducted;
    }
    public String getEnvironment(){
        return this.environment;
    }
    public String getGrade(){
        return this.grade;
    }
}
public class Solution3 {
    private static int finalTestPassedByEnv(AutonomousCar cars[], String env){
        int sum=0;
        for(int i=0;i<4;i++){
            if(cars[i].environment.equals(env)){
                sum += cars[i].noOfTestsPassed;
            }
        }
        return sum;
    }

    private static AutonomousCar updateCarGrade(String brand,AutonomousCar[] cars){
        int i;
        for(i=0;i<4;i++){
            if(cars[i].brand.equals(brand)){
                int ratings = (cars[i].noOfTestsPassed*100)/(cars[i].noOfTestConducted);
                if(ratings>=80){
                    cars[i].grade="A1";
                }
                else{
                    cars[i].grade="B2";
                }
                break;
            }
        }
        return cars[i];
    }
    public static void main(String[] args){
        AutonomousCar carlists[] = new AutonomousCar[4];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4 ;i++){
            carlists[i] = new AutonomousCar(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextInt(),sc.next());
        }
        String env = sc.next();

        int fv=finalTestPassedByEnv(carlists,env);
        String brand = sc.next();
        if(fv==0){
            System.out.println("There are no tests passed in this particular environment");
        }
        else {
            System.out.println(fv);
        }

        AutonomousCar a = updateCarGrade(brand,carlists);
        System.out.println(a.brand + "::" + a.grade);

    }
}
