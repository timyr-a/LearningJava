package array;

import java.util.Random;

/**
 * Created by User on 11.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        double avgTemp = 0;
        final byte dayCount = 30;
        Random random = new Random();
        byte[] tempArray = new byte[dayCount];
        for(int i=0; i<dayCount; i++){
            tempArray[i] = (byte)(random.nextInt(20) + 10);
            System.out.println((i+1) + " июля - " + tempArray[i] + "°C");
            avgTemp += tempArray[i];
        }
        avgTemp /= dayCount;
        System.out.print("Средняя температура июля: " + avgTemp + "\u00b0C");
    }
}
