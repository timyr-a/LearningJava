package switchCase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите номер дня недели: ");
        Scanner scanner = new Scanner(System.in);
        byte dayNum = scanner.nextByte();
        switch (dayNum) {
            case 1:
                System.out.println("понедельник");
                break;
            case 2:
                System.out.println("вторник");
                break;
            case 3:
                System.out.println("среда");
                break;
            case 4:
                System.out.println("четверг");
                break;
            case 5:
                System.out.println("пятница");
                break;
            case 6:
                System.out.println("суббота");
                break;
            case 7:
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("неверный номер");
                System.out.print("Программа завершена");
        }
    }
}