public abstract class Buku {
    private String judul;
    private String penulis;
    private int harga;

    public Buku(String judul, String penulis, int harga) {
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
    }

    public String getJudul() { return judul; }
    public String getPenulis() { return penulis; }
    public int getHarga() { return harga; }

    // Abstract method sesuai ketentuan 1
    public abstract int hargaAkhir();
    public abstract String keterangan();

    private String formatRupiah(int nominal) {
        return String.format("Rp%,d", nominal).replace(',', '.');
    }

    // Method konkret tampilkanInfo() sesuai ketentuan 2
    public void tampilkanInfo() {
        System.out.printf("%s (%s)%n", judul, penulis);
        System.out.printf("  Harga       : %s%n", formatRupiah(harga));
        System.out.printf("  Keterangan  : %s%n", keterangan());
        System.out.printf("  Harga akhir : %s%n", formatRupiah(hargaAkhir()));
    }
}