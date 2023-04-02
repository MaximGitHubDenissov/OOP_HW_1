package CoffeeMachine;
/**
 * Product
 */
public class Product {

    private String name;
    private double volume;
    private double temperature;
    private double value;
    int count;

 public Product(String name, double volume, double temperature, double value){
    this.name = name;
    this.volume = volume;
    this.temperature = temperature;
    this.value = value;
    this.count = 0;
 }
 public int getCount() {
     return count;
 }
 public void setCount(int count) {
     this.count = count;
 }
 public String getName() {
     return name;
 }
 public double getValue() {
     return value;
 }
 @Override
 public String toString() {
     String res = String.format("Название: %s, Объем: %.1f, Температура: %.1f, Объем: %.1f, Количество: %d", name,volume,temperature,value, count);
     return res;
 }
}
