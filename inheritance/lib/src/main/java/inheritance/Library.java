/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import Rest.Restaurant;
import Rest.Review;

public class Library {


    public static void main(String[] args) {
//        Restaurant Mac = new Restaurant("MACDONALD", 6, "6000");
//        Review review = new Review("the food is good", "Mohammad",2);
//        Mac.addReview(review);
//        System.out.println(Mac);
//        Restaurant Kfc = new Restaurant("KFC" , 4, "7000");
//        Review review1 = new Review("the food is delisious", "Ali", 3);
//        Kfc.addReview(review1);
//        System.out.println(Kfc.toString());

        Restaurant restaurant = new Restaurant("Mac", 5, "900");
        Review review2 = new Review("good" , "Ali", 2);
        restaurant.addReview(review2);
        System.out.println(restaurant.toString());
    }
}
