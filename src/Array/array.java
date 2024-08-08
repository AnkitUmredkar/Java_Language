package Array;

public class array {
    public static void main(String[] args) {

        //todo 1D Array
        //declaration
        int a[] = new int[5];
        a = new int[]{1, 2, 3};

        // creation
        int b[] = {1, 2, 3, 4, 5, 6};


        //todo iteration
//        for(int i=0; i<a.length; i++){
//            System.out.println(a[i]);
//        }

        //todo iteration using for each loop
//        for(int elem : b){
//            System.out.println(elem);
//        }

        //todo 2D Array
        int[][] arr;
        arr = new int[3][3];

        for(int[] row : arr){
            for(int col : row){
                System.out.println(col);
            }
            System.out.println("--------");
        }
    }
}
