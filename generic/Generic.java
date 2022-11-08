/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generic;

/**
 *
 * @author Gabriella Natasya
 */
public class Generic {

    public static void main(String[] args) {
        
        All_in_One<String> nama = new All_in_One<>();
        nama.setManusia("Gaby");
        System.out.println("Nama Saya: " + nama.getManusia());
            
        All_in_One<Integer> umur = new All_in_One<>();
        umur.setManusia(18);
        System.out.println("Umur Saya: " + umur.getManusia() + " Tahun");
        
        All_in_One<String> Karakter = new All_in_One<>();
        Karakter.setManusia("G");
        System.out.println("Huruf Awalan Nama Saya Adalah: " + Karakter.getManusia());
    }
}
