package module2.Queue;

public class QueueOfStrings {

    private Node first, last;

    private int length;
    static class Node{
        String value;
        Node next;

        Node(String value){
            this.value = value;
        }
    }

    public QueueOfStrings(String item){
            Node newNode = new Node(item);
            first = newNode;
            last = newNode;
            length = 1;
    }

    public void enqueue(String item ){
        Node newNode = new Node(item);

        if(isEmpty()){
            first = newNode;
            last = newNode;
        }else{
            last.next = newNode;
            last = newNode;
        }
        length++;
    }
    public String dequeue(){
        if(isEmpty()) return null;

        Node temp = first;

        if(length ==1){
            first = null;
            last =  null;
        }else{
            first = first.next;
            temp.next = null;
        }
        length--;
        return temp.value;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void printQueue(){
        Node temp = first;
        System.out.println("This is the String Queue: ");

        while(temp != null){
            System.out.println(temp.value+" ");
            temp = temp.next;
        }
    }


}
