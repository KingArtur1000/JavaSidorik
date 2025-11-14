package com.kingartur1000;

import java.util.Arrays;

/**
 * <b>Задание 62:</b> Классы <code>Person</code> и <code>Teacher</code><br>
 * <code>Person</code> — суперкласс с именем и адресом.<br>
 * <code>Teacher</code> наследует <code>Person</code>, содержит данные о курсах с ограничением максимального количества,<br>
 * методы для добавления и удаления <i>уникальных</i> курсов, а также переопределение <code>toString</code>.<br>
 * Класс <code>TestPerson</code> тестирует функционал <code>Teacher</code>.
 *
 * @author <b>Nikita</b>
 * @version <i>1.2</i>
 */

public class Task_1 {

    /** Суперкласс Person */
    public static class Person {
        private String name;
        private String address;

        public Person(String name, String address) {
            this.name = name;
            this.address = address;
        }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public String getAddress() { return address; }
        public void setAddress(String address) { this.address = address; }

        @Override
        public String toString() {
            return "Person { имя='" + name + "', адрес='" + address + "' }";
        }
    }

    /** Класс Teacher */
    public static class Teacher extends Person {
        private int courseCount;
        private final String[] courses;
        private final int maxCourses;

        public Teacher(String name, String address, int maxCourses) {
            super(name, address);
            this.maxCourses = maxCourses;
            this.courses = new String[maxCourses];
            this.courseCount = 0;
        }

        public boolean addCourse(String courseCode) {
            if (courseCount >= maxCourses) {
                System.out.println("[ОШИБКА]: невозможно добавить курс — достигнут лимит.");
                return false;
            }
            if (hasCourse(courseCode)) {
                System.out.println("[ПРЕДУПРЕЖДЕНИЕ]: курс " + courseCode + " уже существует.");
                return false;
            }
            courses[courseCount++] = courseCode;
            System.out.println("[OK]: курс " + courseCode + " успешно добавлен.");
            return true;
        }

        public boolean removeCourse(String courseCode) {
            int index = -1;
            for (int i = 0; i < courseCount; i++) {
                if (courses[i].equals(courseCode)) {
                    index = i;
                    break;
                }
            }
            if (index == -1) {
                System.out.println("[ОШИБКА]: курс " + courseCode + " не найден.");
                return false;
            }
            for (int i = index; i < courseCount - 1; i++) {
                courses[i] = courses[i + 1];
            }
            courses[--courseCount] = null;
            System.out.println("[OK]: курс " + courseCode + " удалён.");
            return true;
        }

        public boolean hasCourse(String courseCode) {
            for (int i = 0; i < courseCount; i++) {
                if (courses[i].equals(courseCode)) return true;
            }
            return false;
        }

        public int getCourseCount() { return courseCount; }
        public int getMaxCourses() { return maxCourses; }
        public String[] getCourses() { return Arrays.copyOf(courses, courseCount); }

        @Override
        public String toString() {
            return "Teacher { имя='" + getName() + "', адрес='" + getAddress() +
                    "', курсов=" + courseCount + "/" + maxCourses +
                    ", список=" + Arrays.toString(getCourses()) + " }";
        }
    }

    /** Тестовый класс */
    public static class TestPerson {
        public static void execute() {
            System.out.println("ЗАДАНИЕ 62: Тестирование Teacher");

            Teacher teacher = new Teacher("Иван Иванов", "ул. Пушкина, 10", 3);

            System.out.println("Начальное состояние:");
            System.out.println(teacher);

            teacher.setName("Пётр Петров");
            teacher.setAddress("ул. Ленина, 5");
            System.out.println("\nПосле изменения данных:");
            System.out.println(teacher);

            System.out.println("\nДобавляем курсы:");
            teacher.addCourse("MAT101");
            teacher.addCourse("PHY202");
            teacher.addCourse("CHE303");

            System.out.println("\nСостояние после добавления:");
            System.out.println(teacher);

            System.out.println("\nПопытка добавить дубликат:");
            teacher.addCourse("MAT101");

            System.out.println("\nПопытка добавить сверх лимита:");
            teacher.addCourse("BIO404");

            System.out.println("\nУдаляем курс PHY202:");
            teacher.removeCourse("PHY202");
            System.out.println(teacher);

            System.out.println("\nПопытка удалить несуществующий курс:");
            teacher.removeCourse("ART500");

            System.out.println("\nИтог:");
            System.out.println("Текущих курсов: " + teacher.getCourseCount());
            System.out.println("Максимум курсов: " + teacher.getMaxCourses());
        }
    }

    /** Запуск теста */
    public static void execute() {
        TestPerson.execute();
    }
}
