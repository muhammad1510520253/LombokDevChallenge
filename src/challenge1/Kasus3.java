
package challenge1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ketikanMD.blogspot.com
 */
public class Kasus3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean jawaban = true;
        String jawab;
        do {
            boolean cek = true;
            String huruf[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
            int jml, hasil;
            String tebakan;
            int nilaiTebakan = 0;
            jml = huruf.length;
            hasil = (int) (Math.random() * jml);
            do {

                System.out.print("Masukkan Tebakanmu: ");
                tebakan = input.next().toLowerCase();
                for (int i = 0; i < jml; i++) {
                    if (tebakan.equals(huruf[i])) {
                        nilaiTebakan = i;
                    }
                }
                System.out.println("Tebakan anda: " + tebakan);
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
