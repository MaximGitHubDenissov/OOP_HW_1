package CoffeeMachine;

public class Coffee extends Product{
    private boolean Milk;
    private boolean Sugar;
    public Coffee (String name, double volume, double temperature, double value, boolean Milk, boolean Sugar){
        super(name, volume, temperature, value);
        this.Milk = Milk;
        this.Sugar = Sugar;
    }
    @Override
    public String toString() {
        String res = String.format("%s Молоко: %s Сахар: %s", super.toString(),Milk,Sugar);
        return res;
    }
    
}
