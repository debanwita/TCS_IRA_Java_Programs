import java.lang.*;
import java.util.*;

class Movie{
    private String movieName;
    private String company;
    private String genre;
    private int budget;

    public Movie(String n,String c,String g,int b){
        this.movieName = n;
        this.company = c;
        this.genre = g;
        this.budget = b;
    }
    public String getGeneration(){
        return this.genre;
    }
    public int getBudget(){
        return this.budget;
    }
}
public class Solution {
    private static Movie[] getMovieByGenre(Movie[] movies,String searchGenre){
        Movie[] mv=new Movie[0];
        for(int i=0;i<4;i++){
            if(movies[i].getGeneration().equalsIgnoreCase(searchGenre)){
                mv = Arrays.copyOf(mv,mv.length+1);
                mv[mv.length-1] = movies[i];
            }
        }
        return mv;
    }
    public static void main(String[] args){
        Movie[] movies = new Movie[4];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++){
            movies[i] = new Movie(sc.next(),sc.next(),sc.next(),sc.nextInt());
        }
        String g = sc.next();
        Movie[] mv = getMovieByGenre(movies,g);
        for(int i=0;i<mv.length;i++){
            int b = mv[i].getBudget();
            if(b>80000000

            )
                System.out.println("High Budget Movie");
            else
                System.out.println("Low Budget Movie");
        }
    }
}
