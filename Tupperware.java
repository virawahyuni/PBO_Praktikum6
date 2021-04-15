package praktikum6;
import java.util.Scanner;
import java.util.Stack;

public class Tupperware {
    Stack<String> daftarTupperware;
    Tupperware(){
        daftarTupperware = new Stack<String>();
    }

    public String tambahTupperware() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan nama Tupperware (jika selesai input, kosongkan) [*PUSH]= ");
        String namaTupperware = scanner.nextLine();
        if(namaTupperware.equals("")) {
            return namaTupperware;
        }
        this.daftarTupperware.push(namaTupperware);
        return  namaTupperware;
    }

    public void hapusTupperware() {
        String mantanTupperware = this.daftarTupperware.pop();
        System.out.println(mantanTupperware + " baru saja dihapus dari Daftar Tupperware [*POP]");
    }

    public boolean cekTupperware() {
        if(this.daftarTupperware.empty()) {
            System.out.println("Daftar Tupperware Kosong [*EMPTY]");
            return false;
        }
        System.out.println("Daftar Tupperware ada " + this.daftarTupperware.size() + " tupperware [*EMPTY]");
        return true;
    }

    public void peekTupperware() {
        String newTupperware = this.daftarTupperware.peek();
        System.out.println(newTupperware + " adalah tupperware yang paling terbaru (PEEK)");
    }

    public void cariTupperware(String modelTupperware) {
        Integer pos = (Integer) daftarTupperware.search(modelTupperware);
        if(pos == -1) {
            System.out.println(modelTupperware + " tidak tersedia [*SEARCH]");
            return;
        }
        System.out.println(modelTupperware + " ditemukan [*SEARCH]");
    }

}