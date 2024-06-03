class Topup extends Transaction {
    private String nomorReferensi;
    private String metodePembayaran;

    public Topup(double nominal, String tanggal, Customer customer, String nomorReferensi, String metodePembayaran) {
        // mengakses konstruktor superclass
        super(nominal, tanggal, customer);
        this.nomorReferensi = nomorReferensi;
        this.metodePembayaran = metodePembayaran;
    }

    // set get nomor referensi
    public void setNomorReferensi(String nomorReferensi) {
        this.nomorReferensi = nomorReferensi;
    }

    public String getNomorReferensi() {
        return nomorReferensi;
    }

    // set get metode pembayaran
    public void setMetodePembayaran(String metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
    }

    public String getMetodePembayaran() {
        return metodePembayaran;
    }

    @Override
    // customer, nominal, tanggal dari superclass
    // no ref, payment method dari subclass
    public void cetakInformasiTransaksi(String namaCustomer) {
        System.out.println(namaCustomer+ " topup sejumlah: " + getNominal() + " pada " + getTanggal() +
                " dengan no. ref: " + nomorReferensi + " menggunakan " + metodePembayaran);
    }
}