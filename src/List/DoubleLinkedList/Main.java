package List.DoubleLinkedList;

public class Main {

    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        list.addToHead("1");
        list.addToHead("2");
        list.addToHead("3");
        list.printList();
        list.removeByData("2");
        list.printList();

        DoubleLinkedList subway = new DoubleLinkedList();
        subway.addToHead("Times Square");
        subway.addToHead("Grand Central");
        subway.addToHead("Central Park");
        subway.printList();
        subway.addToTail("Penn Station");
        subway.addToTail("Wall Street");
        subway.addToTail("Brooklyn Bridge");
        subway.printList();
        subway.removeTail();
        subway.removeHead();
        subway.printList();
        subway.removeByData("Times Square");
        subway.printList();

        DoubleLinkedList testList = new DoubleLinkedList();
        char alphabet;
        for (alphabet = 'A'; alphabet <= 'Z'; ++alphabet) {
            testList.addToTail(String.valueOf(alphabet));
        }

        testList.printList();
        DoubleLinkedList.swapNodes(testList, "A", "E");
        testList.printList();
    }

}
