public class Main {
    public static void main(String[] args) {
       int bananas = (5 * 80);
       int milk = (200 / 100 * 105);
       int icecream = (2 * 100);
       int eggs = (4 * 70);
       int weight = (bananas + milk + icecream + eggs);
       int convert;
        convert = (weight / 1000);
        System.out.println("Общий вес продуктов: " + weight + "г" + "\n                        "
               + convert + "кг");
    }
}