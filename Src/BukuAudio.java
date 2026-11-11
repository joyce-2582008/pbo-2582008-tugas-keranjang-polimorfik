public class BukuAudio extends Buku implements BisaDiunduh {
    private int durasiMenit;

    public BukuAudio(String judul, String penulis, int harga, int durasiMenit) {
        super(judul, penulis, harga);
        this.durasiMenit = durasiMenit;
    }

    @Override
    public int hargaAkhir() {
        // Diskon 10%
        int diskon = (int) (getHarga() * 0.10);
        return getHarga() - diskon;
    }

    @Override
    public String keterangan() {
        return durasiMenit + " menit, diskon 10%";
    }

    @Override
    public String linkUnduh() {
        // Format link: https://toko.buku/audio/<judul> (huruf kecil & spasi diganti '-')
        String formatJudul = getJudul().toLowerCase().replace(' ', '-');
        return "https://toko.buku/audio/" + formatJudul;
    }
}