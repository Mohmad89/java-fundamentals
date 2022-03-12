
package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Shop implements AddReview {

    private String name;
    private String description;
    private String numOfDollarSigns;
    private List<Review> reviewList = new ArrayList<>();
    public String reviewText, aother;


    public Shop(String name, String description, String numOfDollarSigns) {
        this.name = name;
        this.description = description;
        this.numOfDollarSigns = numOfDollarSigns;
    }

    public String getName() {
        return name;
    }

    public String getNumOfDollarSigns() {
        return numOfDollarSigns;
    }

    public String getAother() {
        return aother;
    }

    @Override
    public void addReview(Review review) {
        reviewList.add(review);
        reviewText = review.getBody();
        aother = review.getAuthor();
    }

    @Override
    public String toString() {
        if (reviewText != null) {
            return "Shop{" +
                    "name='" + name + '\'' +
                    ", description='" + description + '\'' +
                    ", numOfDollarSigns='" + numOfDollarSigns + '\'' +
                    '}' + "Review{" +", Body='" + reviewText + ", Author='" + aother + "}";
        }
        else {
            return "Shop{" +
                    "name='" + name + '\'' +
                    ", description='" + description + '\'' +
                    ", numOfDollarSigns='" + numOfDollarSigns + '\'' +
                    '}';
        }

    }


}
