/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basics;

import java.time.LocalDateTime;
import java.util.Random;

public class App {
    public static void main(String[] args) {

        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        flipNHeads(2);

        clock();
    }
    // 1) Pluralize function ()
    public static String pluralize(String name, int count){

        return count == 1 ? name : name + "s";

    }
    // 2) FlipNHeads function ()
    public static void flipNHeads(int num){
        double random = 0.0 ;
        int count = 0;
        int number_of_flip = 0;
        Random r = new Random();
        while(count != num){
            random = r.nextDouble();
            number_of_flip++;
            if(random < 0.5){
                System.out.println("tails");
            }
            else if (random > 0.5){
                System.out.println("heads");
                count++;
                continue;
            }
            count = 0;
        }
        System.out.println("it took "+number_of_flip+" flips to flip "+num+" head in a row.");
    }
    // Clock function ()
    public static void clock() {
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();
        String yld = hour + ":" + minute + ":" + second;
        System.out.println(yld);
        while (true) {
            now = LocalDateTime.now();
            if (now.getSecond() != second) {
                hour = now.getHour();
                minute = now.getMinute();
                second = now.getSecond();

                yld = hour + ":" + minute + ":" + second;
                System.out.println(yld);
            }
        }
    }
}
