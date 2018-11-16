package challenge1;

/**
 *
 * @author ketikanMD.blogspot.com
 */
import java.util.Scanner;

public class Kasus2 {

    public static void main(String[] args) {
        //inisialisasi variabel
        boolean cek = true;
        String jawab;
        do {
            //inisialisasi variabel
            String teksAwal, teksKebalikan = "";
            Scanner in = new Scanner(System.in);
            System.out.println("Masukkan kalimat yang ingin dicek apakah palindrome atau tidak:");
            teksAwal = in.nextLine().toLowerCase();//mengubah String yang diinput menjadi huruf kecil semua

            //membuat array tandaBaca dengan tipe data String
            String tandaBaca[] = {".", ",", " ", "?", "!", "@", "#", "$", "%", "^", "&", "*", "_", "-", "+", "+", "|", ">", "<", "~", "`"};
            int jml = tandaBaca.length;//menghitung panjang dari array tandaBaca
            for (int i = 0; i < jml; i++) {
                //menghilangkan tanda baca
                teksAwal = teksAwal.replace(tandaBaca[i], "");
            }

            int ukuran = teksAwal.length();//variabel untuk menampung ukuran dari teks yang diinput
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
