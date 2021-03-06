/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test void RestaurantTest (){
        Restaurant restaurant = new Restaurant("Macdonaldz", 5, "500$");
        assertEquals("Macdonaldz", restaurant.getName());
    }

    @Test void ReviewTest () {
        Review review = new Review("good", "Mohammad", 4);
        assertEquals("Mohammad", review.getAuthor());
    }

    @Test void addReview () {
        Restaurant restaurant = new Restaurant("Mac", 5, "900");
        Review review = new Review("good" , "Ali", 2);
        restaurant.addReview(review);
        assertEquals(2, restaurant.getNumOfStarsAfterReview());
    }

    @Test void toStringReview () {
        Review review = new Review("good" , "Ali", 2);
        assertEquals("Review{body='good', author='Ali', num_of_stars=2}", review.toString());
    }
    @Test void shopTest () {
        Shop shop = new Shop("LoLo", "Mall", "$$$");
        assertEquals("LoLo", shop.getName());
    }

    @Test void addReviewShopTest () {
        Shop shop = new Shop("LoLo", "Mall", "$$$");
        Review review = new Review("So Good", "Mohammad", 7);
        shop.addReview(review);
        assertEquals("Mohammad", shop.aother);
    }

    @Test void theaterTest () {
        ArrayList<String> movieName = new ArrayList<>();
        movieName.add("Spider Man");
        movieName.add("Taken");
        movieName.add("John wik");
        Theater theater = new Theater(movieName);
        assertEquals(3, theater.length());
    }

    @Test void theaterFunctionality () {
        ArrayList<String> movieName = new ArrayList<>();
        movieName.add("Spider Man");
        movieName.add("Taken");
        movieName.add("John wik");
        Theater theater = new Theater(movieName);
        theater.addMovie("Batman");
        theater.removeMovie("Taken");
        assertEquals(false, theater.getMovie("Taken"));
    }





}
