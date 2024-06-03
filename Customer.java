class Customer {
    private String nama;
    private String alamat;
    private EWallet ewallet;

    // public Customer() {
    //     this.ewallet = new EWallet();
    // }

    // set get nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    // set get alamat
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    // set get ewallet
    public void setEWallet(EWallet ewallet) {
        this.ewallet = ewallet;
    }

    public EWallet getEWallet() {
        return ewallet;
    }
}
