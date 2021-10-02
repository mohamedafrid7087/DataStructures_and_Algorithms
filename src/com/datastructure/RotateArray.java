package com.datastructure;


/*
 * Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
    * cant understand how the rotation works.
 */

import java.util.Arrays;


class RotateArray {
    /*Function to left rotate arr[] of size n by d*/
  public void leftRotate(int arr[], int d, int n)
    {
        for (int i = 0; i < d; i++)
            leftRotatebyOne(arr, n);
    }

   public void leftRotatebyOne(int arr[], int n)  {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[n - 1] = temp;
   }

    /* utility function to print an array */
    void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");}
    }

    // Driver program to test above functions
    public static void main(String[] args)
    {
        RotateArray rotate = new RotateArray();
        int arr[] = { 1, 2, 3, 4, 5, 6, 8, 9};
        System.out.println("input ="+ Arrays.toString(arr));
        rotate.leftRotate(arr, 2, 8); // left rotate by 2 value
        rotate.printArray(arr, 8);

        // output: 3,4,5,6,7,1,2
    }
}
