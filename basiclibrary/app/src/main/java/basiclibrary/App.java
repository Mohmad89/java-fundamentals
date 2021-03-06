/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.*;

public class App {


    public static void main(String[] args) {

        int[]b = roll(4);
        int [] dupl = {1,2,3,4,5};
        System.out.println(Arrays.toString(b));
        System.out.println(containsDuplicates(dupl));
        System.out.println(calculateAverage(dupl));
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        System.out.println(arrayAverage(weeklyMonthTemperatures));

        // challenge 3
        Challenge3 ch3 = new Challenge3();
        //tally method
        ch3.tallayMetodResulte();



    }
    // 1)roll function ()
    public static int[] roll(int number){
        int arr[]=new int[number];
        Random r = new Random();
        for (int i =0 ; i< arr.length; i++){
            arr[i] = r.nextInt(6 ) + 1;
        }
        return arr;
    }

    // 2) ContainsDuplicates function ()
    public static boolean containsDuplicates(int [] arr){
        int count = -1;
        boolean resulte = false;
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    count ++;
                }
            }
            if (count > 0){
                resulte = true;
            }
            count = -1;
        }
        return resulte;
    }
    // 3) CalculateAverage function()
    public static double calculateAverage(int [] arr){
        double average = 0.0;
        for (int i = 0; i < arr.length; i++){
            average += arr[i];
        }
        return average / arr.length;
    }

    // 4) arrayAverage function ()
    public static double arrayAverage(int[][] arr){
        double newAverage = 0.0;
        double oldAverage = 0.0;
        double lowestAverage = 0.0;
        for (int i =0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                newAverage += arr[i][j];
            }
            if(i == 0) {
                lowestAverage = newAverage / arr[i].length;
            }
            if (newAverage < lowestAverage){
                lowestAverage = newAverage;
            }
            newAverage = 0.0;
        }
        return lowestAverage;
    }


}
