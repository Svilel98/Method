import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void  enterYear(int year){
    if ((year % 4) == 0 && ((year % 100) != 0 || (year % 400) == 0)) {
        System.out.println(year + "  год — високосный год.");
    } else {
        System.out.println(year + " год — невисокосный год");
    }
}
    public static void currentYear(int clientOs, int clientDeviceYear){
        if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOs == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println("Введите корректное число для ОС");
        }
    }
    public static void task1() {
        System.out.println("Задача 1");
        System.out.println("Введите год");
        Scanner scanner = new Scanner(System.in);
        int enterYear = scanner.nextInt();
        enterYear(enterYear);
    }
    public static void task2() {
        System.out.println("Задача 2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свой операционную систему, если IOS, то нажмите 0, если Android, то нажмите 1");
        int clientOs = scanner.nextByte();
        System.out.println("Введите год создания вашего телефона");
        int clientDeviceYear = scanner.nextShort();
        currentYear(clientOs, clientDeviceYear);
    }
    public static void enterDeliverydistance(int deliveryDistance, int deliveryDay){
        /*int deliveryDay = 0;*/
        if (deliveryDistance <= 20) {
            deliveryDay += 1;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (20 < deliveryDistance && deliveryDistance <= 60) {
            deliveryDay += 2;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (60 < deliveryDistance && deliveryDistance <= 100) {
            deliveryDay += 3;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else {
            System.out.println("Доставки нет.");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите расстояние до вашего дома от нашего офиса");
        int deliveryDistance = scanner.nextInt();
        int deliveryDay = 0;
        enterDeliverydistance(deliveryDistance,deliveryDay);
    }
}