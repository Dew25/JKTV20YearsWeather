/**
 * Создадим зубчатый массив хранящий температуру каждого дня в году
 * учитывая сезоны и выведем его в консоль
 * 
 */
package jktv20yearsweather;

import java.util.Random;

/**
 *
 * @author Melnikov
 */
public class JKTV20YearsWeather {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int min = -20, max = 20;
        // Создадим зубчатый массив из 12 строк
        int[][] yearsWeather = new int[12][];
        yearsWeather[0]= new int[31];
        yearsWeather[1]= new int[28];
        yearsWeather[2]= new int[31];
        yearsWeather[3]= new int[30];
        yearsWeather[4]= new int[31];
        yearsWeather[5]= new int[30];
        yearsWeather[6]= new int[31];
        yearsWeather[7]= new int[31];
        yearsWeather[8]= new int[30];
        yearsWeather[9]= new int[31];
        yearsWeather[10]=new int[30];
        yearsWeather[11]=new int[31];
        
        Random random = new Random();
        for (int i = 0; i < yearsWeather.length; i++) {
            for (int j = 0; j < yearsWeather[i].length; j++) {
                yearsWeather[i][j] = random.nextInt(max - min + 1) + min;
                System.out.printf("%4d",yearsWeather[i][j]);
            }
            System.out.println();
        }
    }
    
}
