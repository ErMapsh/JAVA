package practice;

public class _6ArrayPractice {
    public static void main(String[] args) {
        System.out.println("----Array Practice----");
        /* 1. create an array of 5 floats and calculate the sum

        float [] marks = {2.4f, 3.4f, 2.1f, 4.2f, 5.0f};
        float sum = 0;
        for (float element: marks) {
            sum = sum + element;
        }
        System.out.println(sum);
        */

        /* 2. Find out whether a given int is present in array
        int [] arr = {1, 2, 3, 4, 5};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        boolean flag = false;
        for (int element: arr) {
            if (element == num){
                flag = true;
                break;
            }
        }

        if (flag){
            System.out.println("Humfrey!! We got Element");
        }else{
            System.out.println("We don't found element in array");
        }
        */


        /* 3. Average of Marks

        int [] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int element : arr) {
            sum = sum + element;
        }

        System.out.println("average of marks is "+ sum/arr.length);
        */

        /* 4. java program to add two matrices
        Note: While adding to matrices should have same size of both matrices

        int [] [] mat1= {{1,2,3},
                            {4,5,6}};
        int [] [] mat2= {{1,2,3},
                            {4,5,6}};

        int [] [] mat3 = new int[2][3];

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                mat3 [i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        for (int i = 0; i < mat3.length; i++) {
            for (int j = 0; j < mat3[i].length; j++) {
                System.out.printf("%d ", mat3[i][j]);
            }
            System.out.println();
        }
        */

        /*5. Write a program to reverse a array
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        int temp;
        for (int i = 0; i < arr.length/2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length - i -1 ] = temp;
        }
        display(arr);
        */

//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);

        /* 6.Write a program to find maximum number
        int [] arr = {1, 2, 3, 41, 5, 6, 7, 8};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
        */

        /* 7.Write a program to find minimum number

        int [] arr = {11, 2, 3, -1, 5, -6, 7, 8, 1 };

        int min = Integer.MAX_VALUE;

        for (int e: arr) {
            if (e < min ){
                min = e;
            }
        }
        System.out.println("min is " + min);
        */

         /* 8.find a array is sorted or not */

        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8};
//        int [] arr = {1, 2, 3, 4, 5, 16, 7, 8};

        if (sortedOrNot(arr)){
            System.out.println("Its sorted Array");
        }else{
            System.out.println("Its not sorted Array");
        }

    }

    private static boolean sortedOrNot(int[] arr) {

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]> arr[i+1]){
                return false;
            }
        }
        return  true;
    }

    private static void display(int [] arr) {
        for (int ele: arr) {
            System.out.printf("%d ",ele);
        }
    }
}
