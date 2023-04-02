package CoffeeMachine;

public class Tea extends Coffee{
    private String taste;
    public Tea(String name, double volume, double temperature, double value, boolean Milk, boolean Sugar, String taste){
        super(name, volume, temperature, value, Milk, Sugar);
        this.taste = taste;
    }
    @Override
    public String toString() {
        String res = String.format("%s Вкус: %s", super.toString(),taste);
        return res;
    }
}
