public class Lesson3 {
    public static void main(String[] args) {
        int a = 10;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Число: " + i);
        }
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("Число четное: " + i);
            }
        }
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

        while (a >= 1) {
            System.out.println("Число: " + a);
            a--;
        }
        System.out.println("Поехали!");

        for (int i = 1; i <= 10; i++) {
            System.out.println("5 * " + i + " = " + (5 * i));
            System.out.println("2 * " + i + " = " + (2 * i));
        }
    }
}

