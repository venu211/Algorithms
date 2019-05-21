
public class SubArrays {

    public static void main(String[] args) {

        int[] x = new int[]{1, 2, 3, 4};
        
        for(int sp = 0; sp<x.length; sp++ ) {   //Loop for start point in array

            for(int ep = sp; ep < x.length; ep++) {   //Loop for end point in array

                for(int i = sp; i <=ep; i++) {      // Loop to traverse from start to end array index
                    System.out.println(x[i] + " ");
                }
                System.out.println();
            }
        }
    }
}

//output: 1
//        1 2
//        1 2 3
//        1 2 3 4
//        2
//        2 3
//        2 3 4
//        3
//        3 4
//        4

//Ref:   https://algorithms.tutorialhorizon.com/print-all-subarrays-of-a-given-array/
