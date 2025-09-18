package Lab_2;
import javax.swing.*; // подключаем графическую библиотеку Swing

public class Task_7 {
    public static void main(String args[]) {
// Для ввода данных используем графическое окно из библиотеки Swing
// результат в переменной input типа String
        String answer = JOptionPane.showInputDialog(null,
                "Введите вариант ответа от 1 до 3",
                "Вариант ответа", JOptionPane.OK_CANCEL_OPTION);
// конвертируем символьную переменную input
// в целую variant
        int variant = Integer.parseInt(answer);
// анализируем значение переменной variant
        switch (variant) {
            case 1:
                System.out.println("Вы выбрали первый вариант");
                break;
            case 2:
                System.out.println("Вы выбрали второй вариант");
                break;
            case 3:
                System.out.println("Вы выбрали третий вариант");
                break;
            default:
                System.out.println("Ваш выбор не соответствует заданному");
        }
    }
}