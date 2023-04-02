package CoffeeMachine;

public class Juice extends Product {
    private String taste;
    private boolean carbonated;
    public Juice(String name, double volume, double temperature, double value, String taste, boolean carbonated){
        super(name, volume, temperature, value);
        this.taste = taste;
        this.carbonated = carbonated;
    }
    @Override
    public String toString() {
        String res = String.format("%s Вкус: %s, С газом: %s", super.toString(), taste, carbonated);
        return res;
    }
}
