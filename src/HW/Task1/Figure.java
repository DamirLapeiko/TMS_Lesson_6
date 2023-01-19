package HW.Task1;
//Написать иерархию классов «Фигуры».
//Фигура(абстрактный класс) -> Треугольник, Прямоугольник, Круг.
//Реализовать функцию подсчета площади для каждого типа фигуры и подсчет
//периметра.
//Создать массив из 5 фигур.
//Вывести на экран сумму периметра всех фигур в массиве.
public abstract class Figure {
    int a;
    int b;

    public Figure(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public abstract void countArea();
    int area = a * b;

    public abstract void countPerimeter();
    int perimeter = a + b;
}