public class BukuCetak extends Buku {
    private int beratGram;

    public BukuCetak(String judul, String penulis, int harga, int beratGram) {
        super(judul, penulis, harga);
        this.beratGram = beratGram;
    }

    @Override
    public int hargaAkhir() {
        // Ongkir Rp5.000 per 500 gram (sisa dibulatkan ke atas)
        int kelipatan500 = (beratGram + 499) / 500;
        int ongkir = kelipatan500 * 5000;
        return getHarga() + ongkir;
    }

    @Override
    public String keterangan() {
        int kelipatan500 = (beratGram + 499) / 500;
        int ongkir = kelipatan500 * 5000;
        String formatOngkir = String.format("Rp%,d", ongkir).replace(',', '.');
        return beratGram + " gram, ongkir " + formatOngkir;
    }
}