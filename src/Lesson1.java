public class Lesson1 {
    public static void main(String[] args) {
        String myName = "Kir";
        int myAge = 22;
        String myCity = "Moscow";
        double myCash = 8000.00;
        System.out.println("Меня зовут " + myName + ", мне " + myAge + " лет, я из " + myCity + ", хочу зарабатывать " + myCash);


        int a = 10;
        int b = 3;
        int sum = a + b;
        int dil = a / b;
        int rad = a - b;
        int mul = a * b;

        System.out.println("прибавление: " + sum);
        System.out.println("Деление: " + dil);
        System.out.println("Вычетание: " + rad);
        System.out.println("Умножение: " + mul);

        int c = 8;
        int k = 2;
        System.out.println(c / k);
        System.out.println(c / 2.0);

        // int number = "Test"; //java: incompatible types: java.lang.String cannot be converted to int
        // int num = 5.5; // java: incompatible types: possible lossy conversion from double to int


    }
}
