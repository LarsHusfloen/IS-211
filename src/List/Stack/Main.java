package List.Stack;

public class Main {

    public static void main(String[]args) {
        String [] pizzas = {"pepperoni","cheese","veggie","meat","hawaiian", "margherita"};
        PizzaDelivery pizzaDelivery = new PizzaDelivery();
        pizzaDelivery.assign(pizzas);
        pizzaDelivery.deliver();

        System.out.println("---------------------------------------");

        Stack carsInDriveWay = new Stack(3);
        carsInDriveWay.push("van");
        carsInDriveWay.push("convertible");
        carsInDriveWay.push("do");
        carsInDriveWay.pop();
        carsInDriveWay.pop();
        carsInDriveWay.pop();
    }


}
