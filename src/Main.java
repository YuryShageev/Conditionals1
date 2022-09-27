public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Task 1");
        int age = 20;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("У тебя всё ещё впереди!");
        }

        //Задание 2
        System.out.println("Task 2");
        int age1 = 5;
        if (age1 >= 7) {
            System.out.println("Тыы уже школьник!");
        }
        if (age1 < 7) {
            System.out.println("Отдохни ещё. В школу ещё рано!");
        }
        int age2 = 19;
        if (age2 >= 18) {
            System.out.println("Поздравляю! Вы зачислены на кафедру программистов Java!");
        }
        if (age2 < 18) {
            System.out.println("Вы же не вундеркинд! Идите доучивайтесь в школе!");
        }
        int age3 = 22;
        if (age3 >= 24) {
            System.out.println("До свидания! Больше в нашем университете не появляйтесь!");
        }
        if (age3 < 24) {
            System.out.println("Сколько ещё можно вас терпеть?!");
        }

        //Задание 3
        System.out.println("Task 3");
        int carFilled = 200;
        if (carFilled >= 60) {
            System.out.println("Сидячих мест не осталось!");
        }
        if (carFilled < 102) {
            System.out.println("Стоячие ещё есть!");
        }
        if (carFilled >= 102) {
            System.out.println("Стоячих мест тоже не осталось!");
        }
    }
}