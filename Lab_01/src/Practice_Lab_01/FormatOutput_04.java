package Practice_Lab_01;

public class FormatOutput_04 {
    public static void main(String[] args) {
        boolean ans = true;
        char letter = 'b';
        float sum = 45.4789f;

        System.out.printf("\nЭто пример 1: \n ans = %5b", ans);
        System.out.printf("\nЭто пример 2: \n letter = %2c", letter);
        System.out.printf("\nЭто пример 3: \n sum = %5.2f", sum);
        System.out.printf("\nЭто пример 4:" +
                        "\n ans = %5b \n letter = %2c \n sum = %5.2f", ans, letter, sum);

        double disc = 5432167.12345678;
        String text = "Artur";
        int age = 22;

        System.out.printf("\nДополнительные примеры:");
        System.out.printf("\n double = %12.3f", disc);
        System.out.printf("\n string = %s", text);
        System.out.printf("\n integer = %3d", age);
        System.out.printf("\n Экспоненциальная запись = %e", disc);
    }
}
