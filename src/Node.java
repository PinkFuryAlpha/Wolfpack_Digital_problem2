
public class Node<T extends Comparable<T>> {

    // I made Node to be of generic type so that it can be any data type we want
    public T data;
    public Node<T> next;

    public Node(T data){
        this.data=data;
    }

}
