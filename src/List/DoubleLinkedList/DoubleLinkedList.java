package List.DoubleLinkedList;

import List.Node.Node;

import java.util.Objects;

public class DoubleLinkedList {

    public Node head;
    public Node tail;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addToHead(String data) {
        Node newHead = new Node(data);
        Node currentHead = this.head;

        if (currentHead != null) {
            currentHead.setPreviousNode(newHead);
            newHead.setNextNode(currentHead);
        }
        this.head = newHead;

        if (this.tail == null) {
            this.tail = newHead;
        }
    }

    public void addToTail(String data) {
        Node newTail = new Node(data);
        Node currentTail = this.tail;

        if (currentTail != null) {
            currentTail.setNextNode(newTail);
            newTail.setPreviousNode(currentTail);
        }
        this.tail = newTail;

        if (this.head == null) {
            this.head = newTail;
        }
    }

    public String removeHead() {
        Node removedHead = this.head;

        if (removedHead == null) {
            return null;
        }
        this.head = removedHead.getNextNode();

        if (this.head != null) {
            this.head.setPreviousNode(null);
        }
        if (removedHead == this.tail) {
            this.removeTail();
        }
        return removedHead.data;
    }

    public String removeTail() {
        Node removedTail = this.tail;

        if (removedTail == null) {
            return null;
        }
        this.tail = removedTail.getPreviousNode();

        if (this.tail != null) {
            this.tail.setNextNode(null);
        }
        if (removedTail == this.head) {
            this.removeHead();
        }
        return removedTail.data;
    }

    public Node removeByData(String data) {
        Node nodeToRemove = null;
        Node currentNode = this.head;

        while (currentNode != null) {
            if (Objects.equals(currentNode.data, data)) {
                nodeToRemove = currentNode;
                break;
            }
            currentNode = currentNode.getNextNode();
        }

        if (nodeToRemove == null) {
            return null;
        }
        if(nodeToRemove == head){
            removeHead();
        } else if(nodeToRemove == tail){
            removeTail();
        } else {
            Node nextNode = nodeToRemove.getNextNode();
            Node previousNode = nodeToRemove.getPreviousNode();
            nextNode.setPreviousNode(previousNode);
            previousNode.setNextNode(nextNode);
        }
        return nodeToRemove;
    }

    public static void swapNodes(DoubleLinkedList list, String data1, String data2) {
        System.out.println("Swapping " + data1 + " with " + data2);

        Node node1Prev = null;
        Node node2Prev = null;
        Node node1 = list.head;
        Node node2 = list.head;

        if (Objects.equals(data1, data2)) {
            System.out.println("Elements are the same - no swap to be made");
            return;
        }

        while (node1 != null) {
            if (Objects.equals(node1.data, data1)) {
                break;
            }
            node1Prev = node1;
            node1 = node1.getNextNode();
        }

        while (node2 != null) {
            if (Objects.equals(node2.data, data2)) {
                break;
            }
            node2Prev = node2;
            node2 = node2.getNextNode();
        }

        if (node1 == null || node2 == null) {
            System.out.println("Swap not possible - one or more element is not in the list");
            return;
        }

        if (node1Prev == null) {
            list.head = node2;
        } else {
            node1Prev.setNextNode(node2);
        }

        if (node2Prev == null) {
            list.head = node1;
        } else {
            node2Prev.setNextNode(node1);
        }

        Node temp = node1.getNextNode();
        node1.setNextNode(node2.getNextNode());
        node2.setNextNode(temp);
    }

    public String toString() {
        Node currentNode = this.head;
        StringBuilder output = new StringBuilder("<head> ");
        while (currentNode != null) {
            output.append(currentNode.data).append(" ");
            currentNode = currentNode.getNextNode();
        }
        output.append("<tail>");
        System.out.println(output);
        return output.toString();
    }
}
