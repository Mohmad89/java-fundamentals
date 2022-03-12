package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theater {

    private List<String> movie;
    public List<Review> reviewList = new ArrayList<>();
    private String movieReviewName;
    private Review review = new Review();


    public Theater (List<String> movie) {
        this.movie = movie;
    }

    public void addMovie (String movieName) {
        if (!movie.contains(movieName)){
            movie.add(movieName);
        }
        else {
            System.out.println("The "+ movieName+ " Movie " + "is already exists !!!! ");
        }
    }

    public void removeMovie (String movieName) {
        if (movie.contains(movieName)){
            movie.remove(movieName);
        }
        else {
            System.out.println("The "+ movieName+ " Movie " + "don't exists !!!! ");
        }
    }

    public int length () {
        return movie.size();
    }

    public boolean getMovie (String movieName) {
        return movie.contains(movieName);
    }


    public void addReview(Review review, String movieName) {
        reviewList.add(review );
        movieReviewName = movieName + " ";
    }

    @Override
    public String toString() {
        if (movieReviewName != null){
            return "Theater{" +
                    "movie=" + movie +
                    '}' + " Movie Name for Review {"+ movieReviewName + review.toString();
        }
        return "Theater{" +
                "movie=" + movie +
                '}';
    }


}
