public class Main {
    public static void main(String[] args) {
        //Обьявляем переменные для вводных данных
System.out.println("Привет");
        double ticket = 42325; // Данные стоимости билета
        int bonus = 20; // Количество рублей за 1 бонусную милю

        // Расчет количества начисленых бонусных миль
System.out.println("Вам начислено бонусных миль");
        int miles = (int) (ticket / bonus);

        // Производим расчет

        System.out.println(miles);

    }
}
