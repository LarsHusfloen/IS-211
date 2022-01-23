package List.LinkedList;

public class Main {

    public static void main(String []args) {
        // Write your code here:
        LinkedList seasons = new LinkedList();
        seasons.addToHead("summer");
        seasons.addToHead("spring");
        seasons.addToTail("fall");
        seasons.addToTail("winter");
        seasons.removeHead();
        seasons.printList();
    }
}
