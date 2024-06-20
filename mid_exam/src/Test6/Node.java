package Test6;

public class Node<E> {
    private int data;
    private String nextNodeAddress;

    public Node() {
    }

    public Node(int data, String nextNodeAddress) {
        this.data = data;
        this.nextNodeAddress = nextNodeAddress;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String getNextNodeAddress() {
        return nextNodeAddress;
    }

    public void setNextNodeAddress(String nextNodeAddress) {
        this.nextNodeAddress = nextNodeAddress;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
