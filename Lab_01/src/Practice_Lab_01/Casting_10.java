package Practice_Lab_01;

public class Casting_10 {
    public static void main(String[] args) {
        short age = 25;
        char sex = 'M';
        byte iq = 95;
        int height = 180;
        long distance = 500;
        float price = 149.99f;
        double money = 1250.75;

        System.out.println("=== НАЧАЛЬНЫЕ ЗНАЧЕНИЯ ===");
        System.out.println("age = " + age);
        System.out.println("sex = " + sex);
        System.out.println("iq = " + iq);
        System.out.println("height = " + height);
        System.out.println("distance = " + distance);
        System.out.println("price = " + price);
        System.out.println("money = " + money);

        System.out.println("\n=== ЭКСПЕРИМЕНТЫ С ПРИВЕДЕНИЕМ ТИПОВ ===");

        // Раскомментируем и проверим какие компилируются
        // age = sex; // НЕ КОМПИЛИРУЕТСЯ - нужно явное приведение
        // sex = iq;  // НЕ КОМПИЛИРУЕТСЯ - нужно явное приведение

        iq = (byte) height; // Явное приведение - КОМПИЛИРУЕТСЯ, но данные могут потеряться
        distance = height;  // Неявное расширение - КОМПИЛИРУЕТСЯ

        // price = money; // НЕ КОМПИЛИРУЕТСЯ - потеря точности
        sex = (char) money; // Явное приведение - КОМПИЛИРУЕТСЯ

        System.out.println("=== ПОСЛЕ ПРИВЕДЕНИЙ ===");
        System.out.println("age = " + age);
        System.out.println("sex = " + sex + " (символ с кодом " + (int)sex + ")");
        System.out.println("iq = " + iq + " (потеря данных при приведении " + height + " к byte)");
        System.out.println("height = " + height);
        System.out.println("distance = " + distance);
        System.out.println("price = " + price);
        System.out.println("money = " + money);

        System.out.println("\n=== ДОПОЛНИТЕЛЬНЫЕ ПРИМЕРЫ ===");
        int intVal = 100;
        double doubleVal = 3.14;
        double result1 = intVal + doubleVal; // int автоматически к double
        System.out.println("int + double = " + result1);
        
        char letter = 'A';
        int letterCode = letter; // char к int
        char nextLetter = (char)(letter + 5); // int к char с приведением
        System.out.println("Символ " + letter + " имеет код " + letterCode);
        System.out.println("Символ через 5 позиций: " + nextLetter);
    }
}
