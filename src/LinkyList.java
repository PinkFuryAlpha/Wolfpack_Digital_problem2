
public class LinkyList<T extends Comparable<T>> implements Cloneable {

     public Node<T> head;

     public LinkyList(){

    }

    public void addElement(T data){

         if(head==null){
            head=new Node<>(data);
         } else{
             Node<T> curr = head;
             while (curr.next != null) {
                 curr = curr.next;
             }
             curr.next=new Node<T>(data);
         }
    }

    public void showList(){
         Node<T> curr = head;
         while (curr.next!=null){
             System.out.println("Node value: "+curr.data);
             curr=curr.next;
         }

        System.out.println("Node value: "+curr.data);
    }



    //function to return middle element in linked list
    public T findMiddle(){

         //middle is the Node that will be returned
        Node<T> middle=null;

         if(head== null){
             System.out.println("The list is empty! *howl*");
             return null;
         }else{
             //we use curr node to go through the linked list
             Node<T> curr=head;

             //this is the main count in which we count the nodes
             int fastCount=0;

             // we initiate the middle value with the head node value at first lazyCount is the index of the middle
             middle=head;
             int lazyCount=0;


             // the algorithm works as follows
             // we have a fast counter that goes forward and at each new node we divide it by 2 to check the current middle
             // if the middle is not at the index of the current middle, we go from our middle until we reach the real middle index
             // it is greedy approach

             while(curr.next!=null){
                 fastCount++;
                 if(Math.round(fastCount/2)>lazyCount){
                     while(lazyCount<Math.round(fastCount/2)){
                         lazyCount++;
                         middle=middle.next;
                     }
                 }
                 curr=curr.next;
             }

         }

        System.out.println("Middle element is: "+middle.data);

        return middle.data;

    }

}
