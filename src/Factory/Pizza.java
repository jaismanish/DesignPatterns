package Factory;

public abstract class Pizza {
    String name;
    public void prepare(){
        System.out.println("Preparing pizza");
    }
    public void bake(){
        System.out.println("Baking pizza");
    }
    public void cut(){
        System.out.println("Cutting pizza");
    }
    public void box(){
        System.out.println("Boxing pizza");
    }

    public String getName() {
        return name;
    }
}

class NYStyleCheesePizza extends Pizza {
    NYStyleCheesePizza() {
        name = "NY Style Cheese Pizza";
    }
}

class NYStyleVeggiePizza extends Pizza {
    NYStyleVeggiePizza() {
        name = "NY Style Veggie Pizza";
    }
}

class ChicagoStyleCheesePizza extends Pizza {
    ChicagoStyleCheesePizza() {
        name = "Chicago Style Cheese Pizza";
    }

    public void cut() {
        System.out.println("Cutting into square slices");
    }
}

class ChicagoStylePepperoniPizza extends Pizza {
    ChicagoStylePepperoniPizza() {
        name = "Chicago Style pepperoni Pizza";
    }

    public void cut() {
        System.out.println("Cutting into square slices");
    }
}
