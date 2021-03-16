/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan_d;

import java.util.Scanner;

public class Latihan_d {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sl = new Scanner(System.in);
        
        System.out.print("Masukan nilai1 = ");
        int nilai1 = sl.nextInt();
        System.out.print("Masukan nilai2 = ");
        int nilai2 = sl.nextInt();
        
        int jumlah = nilai1 + nilai2;
        System.out.println("Jumlah = " + jumlah);
    }
    
}
