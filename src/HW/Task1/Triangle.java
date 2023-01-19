package HW.Task1;

//Написать иерархию классов «Фигуры».
//Фигура(абстрактный класс) -> Треугольник, Прямоугольник, Круг.
//Реализовать функцию подсчета площади для каждого типа фигуры и подсчет
//периметра.
//Создать массив из 5 фигур.
//Вывести на экран сумму периметра всех фигур в массиве.
public class Triangle extends Figure {
    int c;

    public Triangle(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    @Override
    public void countArea() {
        int countArea = a * b * c;
        System.out.println("Area of Triangle is: " + countArea);
    }

    @Override
    public void countPerimeter() {
        int countPerimeter = a + b + c;
        System.out.println("Perimeter of Triangle is: " + countPerimeter);
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        triangle.countPerimeter();
        triangle.countArea();
    }
}