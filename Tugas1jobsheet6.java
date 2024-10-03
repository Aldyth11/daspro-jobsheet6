import java.util.Scanner;

public class Tugas1jobsheet6 {
    public static void main(String[] args) {
        Scanner input14 = new Scanner(System.in);
        int jmlBuku;
        String jenisBuku;
        double diskon = 0, harga = 20000, totalDiskon, totalHarga; 

        System.out.println("Masukkan jenis buku: ");
        jenisBuku = input14.nextLine();
        System.out.println("Masukkan jumlah buku: ");
        jmlBuku = input14.nextInt();
    
        if (jenisBuku.equalsIgnoreCase("kamus")) {
            if (jmlBuku > 2) {
                diskon  += 0.12;          
            } else
            diskon = 0.1;
        }
        else if (jenisBuku.equalsIgnoreCase("novel")) {
            if (jmlBuku > 3) {
                diskon = 0.09;          
            } else
            diskon = 0.08;
        }
        else  if (jmlBuku > 3) {
            diskon = 0.05;
        }
        totalDiskon = diskon * (jmlBuku * harga);
        totalHarga = harga - totalDiskon;
    System.out.println("Total diskon: " + totalDiskon);
    System.out.println("Total harga: " + totalHarga);
}
}