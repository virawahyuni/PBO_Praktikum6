package praktikum6;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    	Tupperware tupperware = new Tupperware();
        // Perulangan untuk menambahkan Tupperware
        while (true) {
            String namaTupperware = tupperware.tambahTupperware();
            if(namaTupperware.equals("")) {
                break;
            }
        }

        // Cek Jumlah Tupperware [EMPTY]
        if(!tupperware.cekTupperware()){
            return;
        }

        // Cek Data Teratas [PEEK]
        tupperware.peekTupperware();

        // hapus Tupperware [DELETE]
        tupperware.hapusTupperware();

        // Perulangan untuk mencari Tupperware [SEARCH]
        while (true) {
        	Scanner scanner = new Scanner(System.in);
            System.out.print("Masukan nama tupperware yang akan dicari (jika selesai input, kosongkan) [*SEARCH]= ");
            String namaTupperware = scanner.nextLine();
            if(namaTupperware.equals("")) {
                break;
            }
            tupperware.cariTupperware(namaTupperware);
        }
    }
}