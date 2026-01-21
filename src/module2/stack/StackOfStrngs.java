package module2.stack;

public class StackOfStrngs {
    private Node top;

    private int height;

    static class Node{
        String value;
        Node next;

        Node(String value){
            this.value = value;
        }
    }

    public StackOfStrngs(String value){
        Node newNode = new Node(value);

        top = newNode;
        height = 1;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void push(String item){
        Node oldFirst = top;
        top = new Node(item);

        top.value = item;
        top.next = oldFirst;

        height++;
    }

    public String pop(){
        String item = top.value;
        top = top.next;
        height--;
        return item;
    }


    public void peek(){
        System.out.println("Top of the stack is" + top.value);
    }

    public void printStacks(){
        Node temp = top;
        System.out.println("This is the string stack");
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }



}


