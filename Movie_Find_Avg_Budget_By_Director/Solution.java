import java.util.*;
import java.lang.*;

class Movie{
    private int movieId;
    private String director;
    private int rating;
    private int budget;

    public Movie(int id,String d,int r, int b){
        this.movieId = id;
        this.director = d;
        this.rating = r;
        this.budget = b;
    }
    public String getDirector(){
        return this.director;
    }
    public int getBudget(){
        return this.budget;
    }
    public int getRating(){
        return this.rating;
    }
    public int getId(){
        return this.movieId;
    }
}
public class Solution {
    private static int findAvgBudgetByDirector(Movie[] movies,String director){
        int b = 0,count =0;
        for(int i=0;i<4;i++){
            if(movies[i].getDirector().equalsIgnoreCase(director)){
                b+= movies[i].getBudget();
                count++;
            }
        }
        if(count!=0)
            b = b /count;
        return b;
    }

    private static Movie getMovieByRatingBudget(int rating,int budget,Movie[] movies){
        Movie m = null;
        if(budget%rating==0){
            for(int i=0;i<4;i++){
                int b = movies[i].getBudget();
                int r = movies[i].getRating();
                if(b==budget && r==rating){
                    m = movies[i];
                }
            }
        }
        return m;
    }
    public static void main(String[] args){
        Movie[] movies = new Movie[4];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++){
            movies[i] = new Movie(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextInt());
        }
        String director = sc.next();
        int rating = sc.nextInt();
        int budget = sc.nextInt();

        int b = findAvgBudgetByDirector(movies,director);
        if(b>0) {
            System.out.println(b);
        }
        else{
            System.out.println("Sorry - The given director has not yer directed any movie");
        }

        Movie m = getMovieByRatingBudget(rating,budget,movies);
        if(m!=null){
            System.out.println(m.getId());
        }
        else{
            System.out.println("Sorry - No movie is available with the specified rating and budget requirement");
        }
    }
}
