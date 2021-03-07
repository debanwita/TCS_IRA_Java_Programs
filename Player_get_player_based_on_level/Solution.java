import java.util.*;
import java.lang.*;

class Player{
    private int playerId;
    private String skill;
    private String level;
    private int points;

    public Player(int id,String skill,String level,int points){
        this.playerId = id;
        this.skill =skill;
        this.level = level;
        this.points = points;
    }
    public String getSkill(){
        return this.skill;
    }
    public int getPoints(){
        return this.points;
    }
    public String getLevel(){
        return this.level;
    }
    public int getId(){
        return this.playerId;
    }
}
public class Solution {
    private static int findPointsForGivenSkill(Player[] players,String parameter){
        int count = 0;
        for(int i=0;i<4;i++){
            if(players[i].getSkill().equalsIgnoreCase(parameter)){
                count += players[i].getPoints();
            }
        }
        return count;
    }
    private static Player getPlayerBasedOnLevel(String level,Player[] players){
        Player p = null;
        for(int i=0;i<4;i++){
            Player ob = players[i];
            String l = ob.getLevel();

            int  points= ob.getPoints();
            if(l.equalsIgnoreCase(level)){
                if(points >= 20){
                    p= players[i];
                    break;
                }
            }
        }
        return p;
    }

    public static void main(String[] args){
        Player[] players = new Player[4];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++){
            players[i] = new Player(sc.nextInt(),sc.next(),sc.next(),sc.nextInt());
        }
        String p = sc.next();
        String level = sc.next();


        int points = findPointsForGivenSkill(players,p);
        if(points==0){
            System.out.println("The given skill is not available");
        }
        else {
            System.out.println(points);
        }

        Player ob = getPlayerBasedOnLevel(level,players);
        if (ob == null) {
            System.out.println("No player is available with specified level, skill and eligibility points");
        }
        else{
            System.out.println(ob.getId());
        }

    }
}
