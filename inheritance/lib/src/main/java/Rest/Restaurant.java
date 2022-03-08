package Rest;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String name = "";
    private int numOfStars = 0;
    private int numOfStarsAfterReview =0 ;
    private String price = "";
    public List<Review> reviewList = new ArrayList<>();

    public Restaurant(String name, int num_of_stars, String price) {
        this.name = name;
        if (num_of_stars > 0 & num_of_stars <= 5) {
            this.numOfStars = num_of_stars;
        } else {
            this.numOfStars = 5;
        }
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getNumOfStars() {
        return numOfStars;
    }

    public int getNumOfStarsAfterReview() {
        return numOfStarsAfterReview;
    }

    public String getPrice() {
        return price;
    }
    public void setNumOfStars(int stars){
        this.numOfStars = stars;

    }

    public void addReview(Review review){
        reviewList.add(review);
        this.numOfStarsAfterReview = review.getNum_of_stars();
    }

    @Override
    public String toString() {


        System.out.println("--------------------------------- " + this.name + " Restaurant" + " --------------------------------- ");
        return '\n' +
                "Name  => " + name + '\n' +
                "Stars => " + numOfStars +'\n' +
                "Price => " + price + '\n' +
                           "---------------------------- " + this.name + " Restaurant With Review"+" --------------------------- " +'\n'+
                 +'\n' +
                "Name  => " + name + '\n' +
                "Stars => " + numOfStarsAfterReview +'\n' +
                "Price => " + price + '\n'
                ;


    }
}
