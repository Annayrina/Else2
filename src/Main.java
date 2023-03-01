public class Main {
    public static void main(String[] args) {
        System.out.println("task1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");

        }
    }

    public static void main(String[] args) {task2(); }

    public static void task2() {
        int clientOs = 0;
        int clientDeviceYear = 2020;

        if (clientOs = 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию для IOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для IOS по ссылке");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }
}





