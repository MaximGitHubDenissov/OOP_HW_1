package CoffeeMachine;

public class main{
    public static void main(String[] args) {
        CoffeeMachine cm = new CoffeeMachine();
        Product americano = new Coffee("Американо", 0.3, 25, 1,false,true);
        Product latte = new Coffee("Латте", 0.3,25,2,true,true);
        Product cappuccino = new Coffee("Капучино", 0.3, 23, 2.5, true,false);
        Product englishBlack = new Tea("Английский", 0.3, 24, 2.3,false,true, "черный");
        Product chineGreen = new Tea("Китайский", 0.3, 25, 2.4, false,false,"зеленый");
        Product erlGray = new Tea("Эрл Грэй", 0.3, 25,2.5, false,false,"с бергамотом");
        Product fanta = new Juice("Fanta", 0.5,5,1.5,"апельсин", true);
        Product sprite = new Juice("Спрайт",0.5,5,1.5,"лимон",true);
        Product granat = new Juice("Бомба",0.5,5,1.8,"гранатовый",false);
        cm.Loadproduct(americano, 10)
        .Loadproduct(latte, 15)
        .Loadproduct(cappuccino, 7)
        .Loadproduct(englishBlack, 10)
        .Loadproduct(chineGreen, 7)
        .Loadproduct(erlGray, 12)
        .Loadproduct(fanta, 15)
        .Loadproduct(sprite, 15)
        .Loadproduct(granat, 15);
        System.out.println(cm.toString());
        System.out.println(cm.searchProduct("Fanta"));
        System.out.println("---------------------------");
        System.out.println(cm.Sale("Fanta", 2));
        System.out.println(cm.Sale("Бомба",3));
        System.out.println("----------------------------");
        System.out.println(cm.toString());
        System.out.println(cm.Sale("Fanta", 14));
    
    }
}
