package HW.Task1;
//Написать иерархию классов «Фигуры».
//Фигура(абстрактный класс) -> Треугольник, Прямоугольник, Круг.
//Реализовать функцию подсчета площади для каждого типа фигуры и подсчет
//периметра.
//Создать массив из 5 фигур.
//Вывести на экран сумму периметра всех фигур в массиве.
public class Circle extends Figure{
int radius;

    public Circle(int a, int b, int radius) {
        super(a, b);
        this.radius = radius;
    }

    @Override
    public void countArea() {
double countArea = 3.14 * (radius^2);
        System.out.println("Area of Circle is: " + countArea);
    }

    @Override
    public void countPerimeter() {
double countPerimeter = 2 * 3.14 * radius;
        System.out.println("Perimeter of Circle is: " + countPerimeter);
    }

    public static void main(String[] args) {
        Circle circle = new Circle(1,4,6);
        circle.countPerimeter();
        circle.countArea();
    }
}
