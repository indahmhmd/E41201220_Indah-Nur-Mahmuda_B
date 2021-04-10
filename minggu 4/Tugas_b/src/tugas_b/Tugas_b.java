/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_b;

// @indah
public class Tugas_b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number = 2;

        System.out.println("         Case 1");
        System.out.println("    Perkalian 2 (1-100)");
        System.out.println("============================");

        System.out.print("     " + number + " ");
        do {
            number *= 2;
            if (number > 100){
                break;
            }
            System.out.print(number + " ");
        } while (number < 100);
        System.out.println("");
       
        System.out.println("----------------------------");
        
        //Case 2 Kelipatan 2
        int bil;
        
        System.out.println("         Case 2");
        System.out.println("    Kelipatan 2 (1-100)");
        System.out.println("============================");
        for(bil=2;bil<=100;bil++){
            if(bil%2==0) {
                System.out.print(" " + bil + " ");
            }
        }
    }
    
}
