public class Lesson2 {
    public static void main(String[] args) {
        int temp = 25;
        if (temp > 25) {
            System.out.println("Жарко");
        } else {
            System.out.println("Нормально");
        }

        int a = 10;
        int b = 5;
        if (a > b) {
            System.out.println("a больше b");
        } else if (a < b) {
            System.out.println("a меньше b");
        } else {
            System.out.println("a равно b");
        }

        String color = "Зеленый";
        if (color.equals("Зеленый")) {
            System.out.println("Иди");
        } else if (color.equals("Красный")) {
            System.out.println("Стой");
        } else if (color.equals("Желтый")) {
            System.out.println("Жди");
        } else {
            System.out.println("Неизвестный цвет");
        }
    }
}

