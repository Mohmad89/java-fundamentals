package inheritance;

import org.apache.commons.math3.analysis.function.Add;

public class Review {
    private String body;
    private String author;
    private int num_of_stars =0;

    public Review () {}
    public Review(String body, String author, int num_of_stars) {
        this.body = body;
        this.author = author;
        this.num_of_stars = num_of_stars;
    }

    public String getBody() {
        return body;
    }

    public String getAuthor() {
        return author;
    }

    public int getNum_of_stars() {
        return num_of_stars;
    }

    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", num_of_stars=" + num_of_stars +
                '}';
    }


}
