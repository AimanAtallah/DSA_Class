package module2.stack;

public class StackClient {
    public static void main(String[] args){
        StackOfStrngs stackOfStrngs = new StackOfStrngs( "To");

        stackOfStrngs.push("be" );
        stackOfStrngs.push("or" );
        stackOfStrngs.push("not" );
        stackOfStrngs.push("to" );
        stackOfStrngs.push("be" );

        stackOfStrngs.printStacks();

        stackOfStrngs.pop();
        stackOfStrngs.pop();


        stackOfStrngs.printStacks();


    }

}
