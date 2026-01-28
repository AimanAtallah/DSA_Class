package module3;

public class SimpleBigO {
    //O(n) the number of operations is equal to n or the number of times is going to execute

    public static void printItems(int n) {
        for (int i = 0; i < n; i++)
            System.out.println(i);
    }



//O(n^2) nested loops no usages

    public static void printAlotOfItems(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }
    }

    //O(1) constant time

    public static int addItems(int n){
        return n + n;
    }
}
