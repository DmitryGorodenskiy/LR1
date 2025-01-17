import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nЗадание 1:");
        Rectangle rect1 = new Rectangle(4, 40);
        Rectangle rect2 = new Rectangle(3.5, 35.9);
        System.out.println("Прямоугольник 1:");
        System.out.println("Ширина: " + rect1.getWidth());
        System.out.println("Высота: " + rect1.getHeight());
        System.out.println("Площадь: " + rect1.getArea());
        System.out.println("Периметр: " + rect1.getPerimeter());
        System.out.println("Прямоугольник 2:");
        System.out.println("Ширина: " + rect2.getWidth());
        System.out.println("Высота: " + rect2.getHeight());
        System.out.println("Площадь: " + rect2.getArea());
        System.out.println("Периметр: " + rect2.getPerimeter());

        System.out.println("\nЗадание 2:");
        Stock sber = new Stock("SBER", "ПАО Сбербанк");
        sber.setPreviousClosingPrice(281.50);
        sber.setCurrentPrice(282.87);
        System.out.println("Код: " + sber.getSymbol());
        System.out.println("Имя: " + sber.getName());
        System.out.println("Стоимость акций: " + sber.getCurrentPrice());
        System.out.printf("Процент изменения: %.2f%%", sber.getChangePercent());

        System.out.println("\n");
        System.out.println("Задание 3:");
        long[] timeValuesInSeconds = {
                10000L,
                100000L,
                1000000L,
                10000000L,
                100000000L,
                1000000000L,
                10000000000L,
                100000000000L
        };
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, d MMMM yyyy HH:mm:ss", new Locale("ru", "RU"));
        for (long timeInSeconds : timeValuesInSeconds) {
            long timeInMillis = timeInSeconds * 1000;
            Date date = new Date(timeInMillis);
            String formattedDate = dateFormat.format(date);
            System.out.println("Время: " + timeInSeconds + " секунд -> Дата: " + formattedDate);
        }
    }
}