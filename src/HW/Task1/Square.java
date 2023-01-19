package HW.Task1;
//Написать иерархию классов «Фигуры».
//Фигура(абстрактный класс) -> Треугольник, Прямоугольник, Круг.
//Реализовать функцию подсчета площади для каждого типа фигуры и подсчет
//периметра.
//Создать массив из 5 фигур.
//Вывести на экран сумму периметра всех фигур в массиве.
public class Square extends Figure{
    public Square(int a, int b) {
        super(a, b);
    }

    @Override
    public void countArea() {
int countArea = a * b;
        System.out.println("Area of Square is: " + countArea);
    }

    @Override
    public void countPerimeter() {
int countPerimeter = a + a + b + b;
        System.out.println("Perimeter of Square is: " + countPerimeter);
    }

    public static void main(String[] args) {
        Square square = new Square(4,5);
        square.countPerimeter();
        square.countArea();
    }
}
