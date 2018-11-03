
package challenge1;

/**
 *
 * @author ketikanMD.blogspot.com
 */
import java.util.Scanner;

public class Kasus2 {

    public static void main(String[] args) {
        boolean cek = true;
        String jawab;
        do {
            String teksAwal, teksKebalikan = "";
            Scanner in = new Scanner(System.in);
            System.out.println("Masukkan kalimat yang ingin dicek apakah palindrome atau tidak:");
            teksAwal = in.nextLine().toLowerCase();
            String sub = ".";
            String sub1 = ",";
            String sub2 = " ";
            String sub3 = "'";
            teksAwal = teksAwal.replace(sub, "");
            teksAwal = teksAwal.replace(sub1, "");
            teksAwal = teksAwal.replace(sub2, "");
            teksAwal = teksAwal.replace(sub3, "");
            int ukuran = teksAwal.length();
            for (int i = ukuran - 1; i >= 0; i--) {
                teksKebalikan += teksAwal.charAt(i);
            }

            /*cek apakah teks awal dan teks kebalikan sama tanpa
membandingkan huruf besar dan kecil sebuah string*/
            if (teksAwal.equalsIgnoreCase(teksKebalikan)) {
                System.out.println("ini kalimat PALINDROME.");
            } else {
                System.out.println("ini bukan kalimat PALINDROME.");
            }
            System.out.println("==========================================");
            System.out.println("Apakah anda ingin keluar?");
            System.out.print("Jawab [Y/T]> ");
            jawab = in.nextLine();
            if (jawab.equalsIgnoreCase("Y")) {
                cek = false;
            }

        } while (cek);

    }

}
