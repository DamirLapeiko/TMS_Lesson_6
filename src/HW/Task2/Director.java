package HW.Task2;
//Создать классы "Директор", "Рабочий", "Бухгалтер".
//Реализовать интерфейс с методом, который печатает название
//должности и имплементировать этот метод в созданные классы.
public class Director implements Printable{
    @Override
    public void print(){
        System.out.println("Your post is Director");
    }
    public static void main(String[] args) {
        Director director = new Director();
        director.print();
    }
}

