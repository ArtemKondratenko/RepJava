import java.util.Scanner;

public class Main {

    // Вводятся длины трех сторон предполагаемого треугольника.
    // Определить, может ли существовать треугольник с такими сторонами
    // при условии что, треугольник существует только тогда, когда ни одна
    // его сторона не превышает сумму двух других.
    public static void main(String[] args) {
        // Ввод длины трех сторон треугольника
        Scanner sc = new Scanner(System.in);

        int sideOne = sc.nextInt();
        int sideTwo = sc.nextInt();
        int sideThree = sc.nextInt();
        // Алгоритм решения
        if (sideOne > sideThree + sideTwo) {
            System.out.println("Не может");
        } else if (sideTwo > sideOne + sideThree) {
            System.out.println("Не может");
        } else if (sideThree > sideOne + sideTwo) {
            System.out.println("Не может");
        } else {
            System.out.println("может");
        }
    }
    // С клавиатуры задаются координаты точки, а также радиус круга,
    // центр которого находится в начале координат. Определить, принадлежит
    // ли данная точка кругу.
    public static void taskTwo(String[] args) {
        // Ввод координат
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double radius = sc.nextDouble();

        double lenHypot = (x * x) + (y * y);

        if (lenHypot <= radius) {
            System.out.println("Принадлежит");
        } else {
            System.out.println("Не принадлежит");
        }
    }
    // Написать программу, которая в зависимости от выбора пользователя
    // вычисляет площадь одной из трех геометрических фигур: прямоугольника,
    // треугольника или круга.(1,2,3)
    public static void taskThree(String[] args) {
        Scanner sc  = new Scanner(System. in);

        int user = sc.nextInt();
        double a = 10;
        double b = 5;
        double c = 15;
        int radius = 1;

        if(user == 1) {
            System.out.println(a * b);
        } else if(user == 2) {
            double s = (a + b + c) / 2;
            System.out.println(Math.sqrt(s * (s-a) * (s -b) * (s-c)));
        } else if(user == 3) {
            System.out.println(Math.PI * (radius * radius));
        }
    }
    // С клавиатуры вводится год. Программа должна определять високосный
    // это год или нет. Вывести на экран соответствующую надпись, а также
    // количество дней в году.
    public static void taskFour(String[] args) {
        Scanner sc  = new Scanner(System. in);

        int year = sc.nextInt();
        if(year % 4 != 0) {
            System.out.println("Не високосный" + 365);
        } else {
            System.out.println("Високосный" + 366);
        }
    }
}
