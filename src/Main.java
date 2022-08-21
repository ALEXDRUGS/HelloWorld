public class Main {
    public static void main(String[] args) {
        int masha = 67760;
        int uptom = (masha / 100 * 10);
        int summ = (masha + uptom);
        int yearm = (summ * 12);
        int diffm = (yearm - masha * 12);
        System.out.println("Маша теперь получает: " + summ + "р" + "\n"
        + "Годовой доход вырос на " + diffm + "р");
        int denis = 83690;
        int uptod = (denis / 100 * 10);
        int sumd = (denis + uptod);
        int yeard = (sumd * 12);
        int diffd = (yeard - denis * 12);
        System.out.println("Денис теперь получает: " + sumd + "р" + "\n"
        + "Годовой доход вырос на " + diffd + "р");
        int kristina = 76230;
        int uptok = (kristina / 100 * 10);
        int sumk = (kristina + uptok);
        int yeark = (sumk *12);
        int diffk = (yeark - kristina * 12);
        System.out.println("Кристина теперь получает: " + sumk + "р" + "\n"
        + "Годовой доход вырос на " + diffk + "р");

    }
}