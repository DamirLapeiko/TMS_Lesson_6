package TheoryAbstractClass;
public class Vehicle extends Car implements Printable {
    int weight;

    public Vehicle(String name, int weight){
        super(name);
        this.weight = weight;
    }
    public void drive(){
        System.out.println("Lets go drive!");
    }
    @Override
    public void print(){
        System.out.println("Your vehicle is: " + name + "\n" +  "Weight: " + weight);
    }
}
