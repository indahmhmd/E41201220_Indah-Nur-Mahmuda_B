/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanarray2;

/**
 *
 * @author L E N O V O
 */
public class Latihanarray2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] angka =  {5, 10, 17, 20, 1};
        String[] teks = {"Saya", "Sedang", "belajar", "OOP", "Java"};
        
        for(int i=0; i<angka.length; i++) {
            System.out.println(angka[i]);
        }
        
        for(int j=0; j<teks.length; j++) {
            System.out.print(teks[j]);
            System.out.print(" ");
        }
        
    }
    
}
