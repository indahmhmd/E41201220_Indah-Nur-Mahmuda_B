/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_d;

import java.util.Scanner;
public class Tugas_d {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner idh = new Scanner(System.in);
        
        String Nama;
        int hrg1;
        int hrg2;
        int hrg3;
        int hrg4;
        int hrg5;
        
        
        System.out. println("-----------------------------------------------");
        System.out. println("         Kharisma Agung Plaza <KAP>");
        System.out. println("          Promo belanja Berhadiah");
        System.out. println("      Khusus Pembelian 5 Barang Pertama");
        System.out. println("       Dengan harga minimum Rp 10000,00");
        System.out. println("-----------------------------------------------");
        
        System.out. print("masukan nama pembeli : ");
        Nama = idh.nextLine();
        System.out. println("");
        System.out.print("Masukkan harga barang-1     : " );
        hrg1 = idh.nextInt();
        System.out.print("Masukkan harga barang-2     : " );
        hrg2 = idh.nextInt();
        System.out.print("Masukkan harga barang-3     : " );
        hrg3 = idh.nextInt();
        System.out.print("Masukkan harga barang-4     : " );
        hrg4 = idh.nextInt();
        System.out.print("Masukkan harga barang-5     : " );
        hrg5 = idh.nextInt();
        
        int jumlah = hrg1 + hrg2 + hrg3 + hrg4 + hrg5;
        System.out.println("Total pembelian atas nama " + Nama + " adalah " + jumlah);
        
        if (jumlah >=10000) {
            String total = "Anda mendapatkan hadiah 1 buah mug cantik";
            System.out.println("");
            System.out.println("Selamat......");
            System.out.println(total);
            System.out.println("");    
        } else {
            String total = " ";
        }
        
        System.out.println("-----------------------------------------------");
        System.out.println("                Terima Kasih");
        System.out.println("   Anda sudah belanja di Kharisma Agung Plaza");
        
    }
    
}
