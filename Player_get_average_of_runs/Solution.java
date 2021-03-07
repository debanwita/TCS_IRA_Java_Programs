import java.util.*;
import java.lang.*;
class Player{
    private int id;
    private String name;
    private int iccRank;
    private int matchesPlayed;
    private int runsScored;
    public Player(int id,String name,int rank,int matchesPlayed,int runsScored){
        this.id = id;
        this.name = name;
        this.iccRank = rank;
        this.matchesPlayed = matchesPlayed ;
        this.runsScored = runsScored;
    }
    public int getMatchesPlayed(){
        return this.matchesPlayed;
    }
    public int getRunsScored(){
        return this.runsScored;
    }
}
public class Solution {
    private static double[] findAverageOfRuns(Player[] players,int target){
        double[] d= new double[0];
        for(int i=0;i<4;i++){
            if(target <=players[i].getMatchesPlayed()){
                double avg = (double)(players[i].getRunsScored()/players[i].getMatchesPlayed());
                d = Arrays.copyOf(d,d.length+1);
                d[d.length-1] = avg;
            }
        }
        return d;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Player[] players = new Player[4];
        for(int i=0;i<4;i++){
            players[i] = new Player(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt());
        }
        int test = sc.nextInt();
        double[] d = findAverageOfRuns(players,test);
        for(int i=0;i<d.length;i++){
            if(d[i]>=80 && d[i]<=100){
                System.out.println("Grade A");
            }
            else if(d[i]>=79 && d[i]<=50){
                System.out.println("Grade B");
            }
            else{
                System.out.println("Grade C");
            }
        }
    }
}
