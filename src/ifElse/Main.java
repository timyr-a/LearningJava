package ifElse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество яблок: ");
        int apples = scanner.nextInt();
        if(apples > 0) {
            System.out.println("Я съел " + apples + " яблок(о,а)");
            if(apples >= 10)
                System.out.println("Я обжора :(");
            else
                System.out.println("Я наелся :)");
        } else {
            if(apples == 0)
                System.out.println("Я не съел ни одного яблока");
            else
                System.out.println("Вы шутите?");
            System.out.println("Я голодный!!!");
        }
        System.out.print("Программа завершена");
    }
}