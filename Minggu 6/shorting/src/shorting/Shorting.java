/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shorting;

/**
 *
 * @author indah
 */
public class Shorting {
    static void bblsrt(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i=0; i < n; i++) {
            for(int j=1; j < (n-i); j++) {
                if(arr[j-1] > arr[j]) {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int arr[] ={8,34,3,152,7};
        
        System.out.println("Array sebelum menggunakan metode Bubble Sort");
        for (int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();
        bblsrt(arr);
        System.out.println("Array sesudah menggunakan metode Bubble Sort");
        for(int i=0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
}
