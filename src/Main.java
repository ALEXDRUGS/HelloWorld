public class Main {
    public static void main(String[] args) {
        int g = (1000 * 7);
        int days1 = (g / 250);
        int days2 = (g / 500);
        int mean = ((days1 + days2) / 2);
        System.out.println("Теряя 250г в день: " + days1 + " дней");
        System.out.println("Теряя 500г в день: " + days2 + " дней");
        System.out.println("В среднем " + mean + " дней");
    }
}