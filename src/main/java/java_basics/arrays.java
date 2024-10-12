package java_basics;

import java_basics.utils.base;

public class arrays extends base {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        arr[0][0] = 2;
        arr[0][1] = 3;
        arr[0][2] = 4;
        arr[1][0] = 4;
        arr[1][1] = 1;
        arr[1][2] = 8;
        arr[2][0] = 7;
        arr[2][1] = 8;
        arr[2][2] = 9;
        printMe(arr[0][2]);


        printMe("----------------------");
        for(int i=0;i<3;i++){
            System.out.println();
            for(int j=0;j<3;j++)
                System.out.print(arr[i][j]+"\t");
        }
        int minNum = arr[0][0];
        int maxNum = 0;
        int minCol = 0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++) {
                if (arr[i][j] < minNum) {
                    minNum = arr[i][j];
                    minCol = j;
                }
                if (arr[i][j] > maxNum)
                    maxNum = arr[i][j];
            }
        }
        printMe("\nMinimum number is: "+minNum);
        printMe("Maximum number is: "+maxNum);

        int k = 0;
        int maxNumInCol = 0;
        while(k<3){
            if(arr[k][minCol]>maxNumInCol)
                maxNumInCol = arr[k][minCol];
            k++;
        }
        printMe("Maximum num in minimums column is: "+maxNumInCol);

        printMe("----------------------------------");
        int[] arr1 = {3,4,7,2,5,8};
        printMe("Swapping array without temp variable");

        for(int i=0;i<arr1.length;i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] > arr1[j]) {
                    arr1[i] = arr1[i] + arr1[j];
                    arr1[j] = arr1[i] - arr1[j];
                    arr1[i] = arr1[i] - arr1[j];
                }
            }
        }
        for(int i=0;i<arr1.length;i++)
            System.out.print(arr1[i]+"\t");

    }

}
