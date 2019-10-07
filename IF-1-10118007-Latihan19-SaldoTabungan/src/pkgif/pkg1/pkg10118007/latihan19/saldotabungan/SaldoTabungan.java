/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg1.pkg10118007.latihan19.saldotabungan;

import java.text.DecimalFormat;
/**
 * Nama      : Rama Al Halik
 * Kelas     : IF-1
 * NIM       : 10118007
 * Deskripsi : Menampilkan Saldo tabungan perbulan
 * @author Rama
 */
public class SaldoTabungan{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i, Saldo;

        DecimalFormat satuan = new DecimalFormat();

        i = 1;
        Saldo = 2500000;
        while (i < 7) {
            Saldo += (Saldo * 0.15);
            System.out.println("Saldo di bulan ke-" + i + " Rp." + satuan.format(Saldo));
            i++;
        }

    }
    
}
