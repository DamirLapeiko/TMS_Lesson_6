package HW.Task2;
//Создать классы "Директор", "Рабочий", "Бухгалтер".
//Реализовать интерфейс с методом, который печатает название
//должности и имплементировать этот метод в созданные классы.
public class Accountant implements Printable{
    @Override
    public void print(){
        System.out.println("Your post is Accountant");
    }

    public static void main(String[] args) {
        Accountant accountant = new Accountant();
        accountant.print();
    }
}

