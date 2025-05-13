/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lingkaran;

/**
 *
 * @author - LENOVO -
 */
public class LingkaranBeraksi {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        double r = 11.78;
        double luas = lingkaran.hitungLuas(r);

        // Menampilkan hasil dalam berbagai format
        System.out.println("Luas dalam pecahan (desimal): " + luas);
        System.out.println("Luas dalam bilangan bulat (type-casting): " + (int) luas);
        System.out.println("Luas setelah pembulatan (rounding): " + Math.round(luas));
    }
}