package module3;

public class BigOClient {
    public static void main(String[] args) {
        SimpleBigO simpleO = new SimpleBigO();
        inDepthBigO bigO = new inDepthBigO();
/*
        simpleO.printItems(10);

        simpleO.printAlotOfItems(10);

        System.out.println(simpleO.addItems(10));
     */

     bigO.OLogNWithRecursion(8);
        System.out.println();
     bigO.OLogNWithoutRecursion(8);
        System.out.println();
        bigO.ONLogN(8);




    }
}