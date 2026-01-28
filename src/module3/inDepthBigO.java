package module3;

public class inDepthBigO {
    public static void OLogNWithRecursion(double n){
        //O(log n)
        if(n>1){
            n = Math.floor(n/2);
            System.out.println("Loop ran");
            OLogNWithRecursion(n);
        }
        System.out.println("finished");

    }

    public static void OLogNWithoutRecursion(double n){
        //O(log n)
        for(int i = 0; n>1; ++i){
            System.out.println("RAN");
            n = Math.floor(n/2);
        }
        System.out.println("finished");
    }

    public static void ONLogN(double n){

        double y = n;

        while(n > 1){
           n = Math.floor(n/2);
            for(int i = 1; i <= y; ++i){
                System.out.println(i);

            }

        }
    }

}
