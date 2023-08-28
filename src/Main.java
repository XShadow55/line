import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        zd1();
        zd2();
        zd3();
    }

    public static void zd1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ФИО сотрудника — ");
        String lastName = scanner.next();
        String firstName = scanner.next();
        String middleName = scanner.next();
        String fullName = lastName + " " + firstName + " " + middleName;
    }

    public static void zd2() {
        String fullName = "Ivanov Ivan Ivanovich";
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);
    }

    public static void zd3() {
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника  — " + fullName);
    }
}