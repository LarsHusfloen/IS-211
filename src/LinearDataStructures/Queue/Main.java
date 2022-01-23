package LinearDataStructures.Queue;

public class Main {

    public static void main(String[] args) {

        Queue coffeeOrder = new Queue();
        System.out.println("coffeeOrder queue has " + coffeeOrder.size + " orders.");
        coffeeOrder.enqueue("latte");
        coffeeOrder.enqueue("espresso");
        coffeeOrder.enqueue("cappuccino");


        String[] orders = {"green curry", "pad thai", "gyoza", "cucumber salad", "pad see ew", "brown rice", "red curry", "salad rolls"};
        RestaurantOrders foodOrders = new RestaurantOrders();
        foodOrders.assign(orders);
    }
}
