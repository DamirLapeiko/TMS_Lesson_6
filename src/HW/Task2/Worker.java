package HW.Task2;
//Создать классы "Директор", "Рабочий", "Бухгалтер".
//Реализовать интерфейс с методом, который печатает название
//должности и имплементировать этот метод в созданные классы.
public class Worker implements Printable {
    @Override
    public void print(){
        System.out.println("Your post is Worker");
    }

    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.print();
    }
}
