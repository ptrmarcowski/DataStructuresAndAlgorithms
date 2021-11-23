package Lists;

public class EmployeeDoublyLinkedList {

    private EmployeeNodeDoubly head;
    private EmployeeNodeDoubly tail;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNodeDoubly node = new EmployeeNodeDoubly(employee);

        if (head == null) {
            tail = node;
        } else {
            head.setPrevious(node);
            node.setNext(head);
        }
        head = node;
        size++;
    }

    public void addToEnd(Employee employee) {
        EmployeeNodeDoubly nodeDoubly = new EmployeeNodeDoubly(employee);
        if (tail == null) {
            head = nodeDoubly;
        } else {
            tail.setNext(nodeDoubly);
            nodeDoubly.setPrevious(tail);
        }

        tail = nodeDoubly;
        size++;
    }

    public EmployeeNodeDoubly removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        EmployeeNodeDoubly removedNode = head;

        if (head.getNext() == null) {
            tail = null;
        } else {
            head.getNext().setPrevious(null);
        }

        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public EmployeeNodeDoubly removeFromEnd() {
        if (isEmpty()) {
            return null;
        }

        EmployeeNodeDoubly removedNode = tail;

        if (tail.getPrevious() == null) {
            head = null;
        } else {
            tail.getPrevious().setNext(null);
        }

        tail = tail.getPrevious();
        size--;
        removedNode.setPrevious(null);
        return removedNode;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        EmployeeNodeDoubly current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" <-> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
