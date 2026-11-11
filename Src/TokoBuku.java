public class TokoBuku {
    // Method static hitungTotal sesuai ketentuan 5
    public static int hitungTotal(Buku[] keranjang) {
        int total = 0;
        for (Buku b : keranjang) {
            total += b.hargaAkhir();
        }
        return total;
    }

    public static void main(String[] args) {
        // Ketentuan 6: Uji coba instansiasi abstract class lalu dikomentari
        // Buku b = new Buku("X", "Y", 1);
        // Pesan error: java: Buku is abstract; cannot be instantiated

        // Membuat object di variabel masing-masing sesuai instruksi 5
        BukuCetak cetak1 = new BukuCetak("Pemrograman Java", "John Doe", 120000, 750);
        BukuCetak cetak2 = new BukuCetak("Algoritma Dasar", "Jane Smith", 95000, 400);
        BukuDigital digital = new BukuDigital("Belajar OOP", "Ani Wijaya", 80000, 12.5);
        BukuAudio audio = new BukuAudio("Kisah Programmer", "Budi Santoso", 60000, 240);

        // Memasukkan ke array polimorfik
        Buku[] keranjang = { cetak1, cetak2, digital, audio };
        BisaDiunduh[] unduhan = { digital, audio };

        System.out.println("=============== KERANJANG ===============");
        for (Buku b : keranjang) {
            b.tampilkanInfo();
        }
        System.out.println("-----------------------------------------");
        String formatTotal = String.format("Rp%,d", hitungTotal(keranjang)).replace(',', '.');
        System.out.println("Total bayar   : " + formatTotal);

        System.out.println("\n============== LINK UNDUH ===============");
        for (BisaDiunduh u : unduhan) {
            System.out.println(u.linkUnduh());
        }
    }
}