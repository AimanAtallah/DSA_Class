package module2.Queue;

public class QueueClient {
    public static void main(String[] args){
        QueueOfStrings queueOfStrings = new QueueOfStrings("To");

        queueOfStrings.enqueue("Be");
        queueOfStrings.enqueue("or");
        queueOfStrings.enqueue("not");
        queueOfStrings.enqueue("to");
        queueOfStrings.enqueue("Be");

        queueOfStrings.printQueue();

        queueOfStrings.dequeue();
        queueOfStrings.dequeue();
        queueOfStrings.printQueue();


    }
}
