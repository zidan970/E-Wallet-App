// Class Transfer inherits from Transaction
class Transfer extends Transaction {
    private Customer penerima;

    // constructor
    public Transfer(double nominal, String tanggal, Customer pengirim, Customer penerima) {
        super(nominal, tanggal, pengirim);
        this.penerima = penerima;
    }

    // set get penerima
    public void setPenerima(Customer penerima) {
        this.penerima = penerima;
    }

    public Customer getPenerima() {
        return penerima;
    }

    @Override
    public void cetakInformasiTransaksi(String pengirim) {
        // nominal, tanggal, pengirim dari superclass
        // penerima dari subclass
        System.out.println(pengirim + " transfer sejumlah: " + getNominal() + " pada " + getTanggal() + 
                " ke " + penerima.getNama());
    }
}