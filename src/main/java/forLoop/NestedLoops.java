package forLoop;

public class NestedLoops {
    public static void main(String[] args) {

        /*
        nested loop - loop inside loop
         */
        // dubugger point

        for ( int i = 1; i <= 15; i++){
            for (int e = 1; e <= 15; e++){
                System.out.print(i * e + "\t");
            }
            System.out.println();
        }

        for (int f = 1; f <= 10; f++){ //elo4ka
            for (int x = 1; x <= f; x++){
                System.out.print("*" + "\t");
            }
            System.out.println();
        }


        for (int u = 1; u <=10; u++){

            for (int p = 1; p <= u; p++){

                System.out.print ("*" + " \t");
            }
            System.out.println("");
        }



    }
}
