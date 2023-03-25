import java.security.spec.RSAOtherPrimeInfo;

public class Main {
    static double youngAdults = 9;
    static double pensioners = 5;
    static double childrens = 11;

    static int youngAdultsdiscount = 0;
    static int pensionetsDiscount = 30;
    static int childrensDiscount = 50;

    static int normalTicket = 70;
    static int youngAdultsTicket = (normalTicket - (normalTicket / 100 * youngAdultsdiscount));
    static int pensionersTicket = (normalTicket - (normalTicket / 100 * pensionetsDiscount));
    static int childrensTicket = (normalTicket - (normalTicket / 100 * childrensDiscount));

    static double DepartureTime = 7.00;
    static int DepartureDate = 1;
    static int travelTimeHours = 4;
    static int travelTimeMinutes = 30;

    static double allPriceYoungAdults = youngAdultsTicket * youngAdults;
    static double allPricePensioners = pensionersTicket *pensioners;
    static double allPriceChildrens = childrensTicket *childrens;

    public static void main(String[] args) {
        System.out.println("Общая стоимость билетов " + (allPriceYoungAdults+allPricePensioners+allPriceChildrens));
        System.out.println("Автобус отпровляеться " +DepartureDate+" июня в " +DepartureTime);
        System.out.println("Время поездки "+ travelTimeHours+" часа "+ travelTimeMinutes+" минут.");

    }
}
