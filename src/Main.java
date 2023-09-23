public class Main {
    public static void main(String[] args) {

        int price = 1200;

        int bonus;
        if (price > 1000) {
            bonus = price / 100;
        } else {
            bonus = 0;
        }

        int amount = price + bonus;
        System.out.println("Итоговый счёт: " + amount);
        System.out.println("Бонусные рубли: " + bonus);
    }
}