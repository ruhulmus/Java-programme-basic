public class ArrayExercise4 {
    public static void main(String[] args) {
        int[][] integers = {{3,5,7},{10,2,9}};


        for(int i = 0; i<integers.length;i++){
//            System.out.println(integers[0][0]);
//            System.out.println(integers[0][1]);
//            System.out.println(integers[0][2]);
//
//
//            System.out.println(integers[1][0]);
//            System.out.println(integers[1][1]);
//            System.out.println(integers[1][2]);
//            System.out.println(integers[i].length);

            for(int j =0; j<integers[i].length;j++){
                System.out.print(integers[i][j] + " ");
            }
            System.out.println();
        }
    }

}
