package module2.Queue;

public class GenericQueue<E> implements Iterable <E> {

    private GenericQueue.Node first, last;

    private int length;
    static class Node{
        E value;
        GenericQueue.Node next;

        Node(E value){
            this.value = value;
        }
    }

    public GenericQueue(E item){
        GenericQueue.Node newNode = new QueueOfStrings.Node(item);
        first = newNode;
        last = newNode;
        length = 1;
    }

    public void enqueue(E item ){
        GenericQueue.Node newNode = new QueueOfStrings.Node(item);

        if(isEmpty()){
            first = newNode;
            last = newNode;
        }else{
            last.next = newNode;
            last = newNode;
        }
        length++;
    }
    public E dequeue(){
        if(isEmpty()) return null;

        GenericQueue.Node temp = first;

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
        GenericQueue.Node temp = first;
        System.out.println("This is the item Queue: ");

        while(temp != null){
            System.out.println(temp.value+" ");
            temp = temp.next;
        }
    }

    private class QueueIterator implements Iterable<E>{


    }



}

