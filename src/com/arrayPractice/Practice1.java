package com.arrayPractice;

// rotate array by one practiced without seeing.

import java.util.Arrays;

public class Practice1 {

    public void rotateArray(int []arr, int n, int d){

        for(int i=0; i<d; i++){
            rotateArrBy1(arr,n);
        }
    }

    public void rotateArrBy1(int []arr, int n){
        int temp;
        temp=arr[0];
        for(int i=0; i<n-1; i++)
            arr[i]=arr[i+1];
            arr[n-1]= temp;

    }
    public void printArr(int[]arr, int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
    int arr[] ={1,2,3,4,5,6,7};
        System.out.println("input ="+ Arrays.toString(arr));
    Practice1 rotateArray = new Practice1();
    rotateArray.rotateArray(arr,7,3);
    rotateArray.printArr(arr,7);
    }
}
