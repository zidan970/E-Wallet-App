// Abstract class Transaction
abstract class Transaction {
    private double nominal;
    private String tanggal;
    private Customer customer;

    // constructor
    public Transaction(double nominal, String tanggal, Customer customer) {
        this.nominal = nominal;
        this.tanggal = tanggal;
        this.customer = customer;
    }

    // set get nominal
    public void setNominal(double nominal) {
        this.nominal = nominal;
    }

    public double getNominal() {
        return nominal;
    }

    // set get tanggal
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getTanggal() {
        return tanggal;
    }

    // set get customer
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    // method cetak
    //public abstract void cetakInformasiTransaksi();
    public abstract void cetakInformasiTransaksi(String namaCustomer); 
}