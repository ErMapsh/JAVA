package _6Array;

public class _3MultiDimensionalArray {
    public static void display(int[][] arr){
        System.out.println("size of matrix in row: "+ arr.length);
        System.out.println("size of matrix in column:  "+ arr[1].length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("-----Multi Dimensional Array----");

        /* syntax for multidimensional array
            dataType [] [] Name = new dataType [2] [3];

            here 2 is row and 3 is column
        */

        /* 2D array*/
        int [] [] _2d = new int[2][2];
        _2d [0][0] = 1;
        _2d [0][1] = 2;
        _2d [1][0] = 3;
        _2d [1][1] = 4;
        display(_2d);

        /* 2-3 D array */
        int [] [] matrix = new int[2][3];
        matrix [0][0] = 11;
        matrix [0][1] = 12;
        matrix [0][2] = 13;
        matrix [1][0] = 14;
        matrix [1][1] = 15;
        matrix [1][2] = 16;
        display(matrix);

        /* 3-3D array */
        int [] [] [] _3d = new int [2] [3] [4];



    }
}