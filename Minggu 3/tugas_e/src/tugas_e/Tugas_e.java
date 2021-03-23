/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_e;

import java.util.Scanner;
public class Tugas_e {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner idh = new Scanner(System.in);
        
        String nama;
        String menu;
        
        System.out. println("              CAFE CERIA");
        System.out. println("             ANEK MINUMAN");
        System.out. println("------------------------------------------");
        System.out. println("             SPECIAL MENU :");
        System.out. println("             1. Soft drinks");
        System.out. println("             2. Mix juice");
        System.out. println("             3. Nescafe");
        System.out. println("             4. Soda milk");
        System.out. println("             5. Tea");
        System.out. println("------------------------------------------");
        
        System.out.print("Masukkan nama pembeli anda : ");
        nama = idh.nextLine();
        System.out.println("");
        
        System.out.print("Silahkan masukkan pilihan anda : ");
        menu = idh.nextLine();
        switch (menu) {
            case "1":
                System.out.println("Minuman yang anda pesan adalah Soft drinks");
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terima Kasih " + nama + " telah berkunjung diCafe Ceria");
                break;
            case "2":
                System.out.println("Minuman yang anda pesan adalah Mix juice");
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terima Kasih " + nama + " telah berkunjung diCafe Ceria");
                break;
            case "3":
                System.out.println("Minuman yang anda pesan adalah nescafe");
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terima Kasih " + nama + " telah berkunjung diCafe Ceria");
                break;
            case "4":
                System.out.println("Minuman yang anda pesan adalah Soda milk");
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terima Kasih " + nama + " telah berkunjung diCafe Ceria");
                break;
            case "5":
                System.out.println("Minuman yang anda pesan adalah Tea");
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terima Kasih " + nama + " telah berkunjung diCafe Ceria");
                break;
            default:
                System.out.println("Menu yang anda masukakan tidak tersedia, silahkan pilih pada menu yang sudah tertera.");
        }
        
    }
    
}
