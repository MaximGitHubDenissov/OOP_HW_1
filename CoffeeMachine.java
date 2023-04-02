package CoffeeMachine;

import java.util.List;
import java.util.ArrayList;

public class CoffeeMachine {
    private List<Product> products = new ArrayList<>();
    double cash = 0.0;

    public CoffeeMachine Loadproduct(Product type, int count) {
        type.setCount(count);
        products.add(type);
        return this;
    }

    public Product searchProduct(String name) {
        for (Product item : products) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null;
    }

    public double Sale(String name, int ammount) {
        Product type = searchProduct(name);
        if (type.getCount() >= ammount) {
            cash += type.getValue() * ammount;
            type.setCount(type.getCount() - ammount);
            return cash;
        } 
        else {
            System.out.println("Недостаточно товара в автомате");
            return cash;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Product item : products) {
            sb.append(item);
            sb.append("\n");

        }
        return sb.toString();
    }

}
