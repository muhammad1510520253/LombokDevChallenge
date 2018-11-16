package challenge1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ketikanMD.blogspot.com
 */
public class Kasus3 {

    public static void main(String[] args) {
        //membuat atau menginstansi objek baru input
        Scanner input = new Scanner(System.in);

        //membuat atau menginstansi variabel baru
        boolean jawaban = true;
        String jawab;

        do {
            boolean cek = true;
            //membuat array dengan tipe data String
            String huruf[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
            int jml, hasil;
            String tebakan;
            int nilaiTebakan = 0;
            jml = huruf.length;//menghitung panjang dari array huruf

            //variabel hasil menampung hasil random jml
            hasil = (int) (Math.random() * jml);
            do {
                System.out.print("Masukkan Tebakanmu: ");
                //mengambil nilai input tipe data String
                //mengubah inputan menjadi huruf kecil atau Lower Case
                tebakan = input.next().toLowerCase();

                //melakukan perulangan sesuai dengan panjang Array huruf
                for (int i = 0; i < jml; i++) {

                    //mengecek apakah tebakan sama dengan elemen yang ada pada array huruf 
                    if (tebakan.equals(huruf[i])) {//jika sama,set variabel nilaiTebakan dengan i(index dari elemen)
                        nilaiTebakan = i;
                    }
                }
                //mengecek tebakan apakah lebih besar,lebih kecil atau tebakan benar
                if (nilaiTebakan > hasil) {
                    System.out.println("terlalu besar");
                    cek = true;
                } else if (nilaiTebakan == hasil) {
                    System.out.println("Huruf Tebakan: " + huruf[hasil]);
                    System.out.println("Selamat,tebakan benar");
                    cek = false;
                } else {
                    System.out.println("terlalu kecil");
                    cek = true;
                }
                System.out.println("==========================================");
            } while (cek);
            System.out.println("Main lagi?");
            System.out.print("Jawab [Y/T]> ");
            jawab = input.next();
            if (jawab.equalsIgnoreCase("T")) {
                jawaban = false;
            }

        } while (jawaban);
    }
}
