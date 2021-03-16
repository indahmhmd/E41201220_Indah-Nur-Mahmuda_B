/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan_c;

class book{
    int price;
    int pages;
    
    public void set (int price, int pages) {
        this.price = price;
        this.pages = pages;
    }
    
    public void show () {
        System.out.println("informasi buku");
        System.out.println("harga buku : " +price);
        System.out.println("halaman buku : " +pages);
    }
}


public class Latihan_c {

    public static void main(String[] args) {
        book javabook = new book();
        javabook.set(70000, 200);
        javabook.show();
    }
    
}
