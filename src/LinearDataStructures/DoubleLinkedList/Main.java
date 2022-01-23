package LinearDataStructures.DoubleLinkedList;

public class Main {

    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        list.addToHead("1");
        list.addToHead("2");
        list.addToHead("3");
        list.toString();
        list.removeByData("2");
        list.toString();

        DoubleLinkedList subway = new DoubleLinkedList();
        subway.addToHead("Times Square");
        subway.addToHead("Grand Central");
        subway.addToHead("Central Park");
        subway.toString();
        subway.addToTail("Penn Station");
        subway.addToTail("Wall Street");
        subway.addToTail("Brooklyn Bridge");
        subway.toString();
        subway.removeTail();
        subway.removeHead();
        subway.toString();
        subway.removeByData("Times Square");
        subway.toString();

        DoubleLinkedList testList = new DoubleLinkedList();
        char alphabet;
        for (alphabet = 'A'; alphabet <= 'Z'; ++alphabet) {
            testList.addToTail(String.valueOf(alphabet));
        }

        testList.toString();
        DoubleLinkedList.swapNodes(testList, "A", "E");
        testList.toString();
    }

}
