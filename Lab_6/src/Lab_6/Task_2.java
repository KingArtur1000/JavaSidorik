package Lab_6;

import java.util.Arrays;

public class Task_2 {

    public static class Person {
        private String name;
        private String address;

        public Person(String name, String address) {
            this.name = name;
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        @Override
        public String toString() {
            return "Person{name='" + name + "', address='" + address + "'}";
        }
    }

    public static class Teacher extends Person {
        private int courseCount;
        private final String[] courses; // теперь final
        private final int maxCourses;

        public Teacher(String name, String address, int maxCourses) {
            super(name, address);
            this.maxCourses = maxCourses;
            this.courses = new String[maxCourses];
            this.courseCount = 0;
        }

        public boolean addCourse(String courseCode) {
            if (courseCount >= maxCourses) {
                System.out.println("Нельзя добавить курс: достигнуто максимальное количество курсов.");
                return false;
            }
            if (hasCourse(courseCode)) {
                System.out.println("Курс " + courseCode + " уже добавлен.");
                return false;
            }
            courses[courseCount++] = courseCode;
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
                System.out.println("Курс " + courseCode + " не найден.");
                return false;
            }
            // Сдвигаем оставшиеся элементы массива
            for (int i = index; i < courseCount - 1; i++) {
                courses[i] = courses[i + 1];
            }
            courses[--courseCount] = null;
            return true;
        }

        public boolean hasCourse(String courseCode) {
            for (int i = 0; i < courseCount; i++) {
                if (courses[i].equals(courseCode)) {
                    return true;
                }
            }
            return false;
        }

        public int getCourseCount() {
            return courseCount;
        }

        public int getMaxCourses() {
            return maxCourses;
        }

        public String[] getCourses() {
            return Arrays.copyOf(courses, courseCount);
        }

        @Override
        public String toString() {
            return "Teacher{" +
                    "name='" + getName() + '\'' +
                    ", address='" + getAddress() + '\'' +
                    ", courseCount=" + courseCount +
                    ", maxCourses=" + maxCourses +
                    ", courses=" + Arrays.toString(getCourses()) +
                    '}';
        }
    }


    public static class TestPerson {
        public static void execute() {
            System.out.println("Тестируем учителя :)");

            Teacher teacher = new Teacher("Иван Иванов", "ул. Пушкина, 10", 3);

            System.out.println("Начальное состояние объекта Teacher:");
            System.out.println(teacher);

            // Используем setName и setAddress, чтобы убрать предупреждения
            teacher.setName("Пётр Петров");
            teacher.setAddress("ул. Ленина, 5");
            System.out.println("После изменения данных: " + teacher);

            System.out.println("\nДобавляем курсы:");
            System.out.println("addCourse MAT101 -> " + teacher.addCourse("MAT101"));
            System.out.println("addCourse PHY202 -> " + teacher.addCourse("PHY202"));
            System.out.println("addCourse CHE303 -> " + teacher.addCourse("CHE303"));

            System.out.println("После добавления курсов:");
            System.out.println(teacher);

            System.out.println("\nПопытка добавить курс MAT101 повторно:");
            System.out.println("addCourse MAT101 -> " + teacher.addCourse("MAT101"));

            System.out.println("\nПопытка добавить курс при максимуме:");
            System.out.println("addCourse BIO404 -> " + teacher.addCourse("BIO404"));

            System.out.println("\nУдаляем курс PHY202:");
            System.out.println("removeCourse PHY202 -> " + teacher.removeCourse("PHY202"));
            System.out.println(teacher);

            System.out.println("\nПопытка удалить несуществующий курс ART500:");
            System.out.println("removeCourse ART500 -> " + teacher.removeCourse("ART500"));

            // Используем getCourseCount и getMaxCourses
            System.out.println("\nТекущих курсов: " + teacher.getCourseCount());
            System.out.println("Максимум курсов: " + teacher.getMaxCourses());
        }
    }

    public static void main(String[] args) {
        TestPerson.execute();
    }
}
