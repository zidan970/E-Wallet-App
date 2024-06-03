import java.util.List;

public class CustomerMain {
    public static void main(String[] args) {
        // create object
        Customer customer = new Customer();
        customer.setNama("itadori yuji");
        customer.setAlamat("sendai city");
        // customer.getEWallet().setSaldo(5000);

        // object ewallet
        EWallet ewallet = new EWallet();
        ewallet.setSaldo(5000);
        customer.setEWallet(ewallet);

        // print data customer
        System.out.println("Nama: " + customer.getNama());
        System.out.println("Alamat: " + customer.getAlamat());
        System.out.println("Saldo: " + customer.getEWallet().cekSaldo());

        // topup
        customer.getEWallet().topup(2500.0, "2024-06-02", "ABC456", "Credit Card");
        System.out.println("Saldo terbaru: " + customer.getEWallet().cekSaldo());

        // Mencetak transaksi yang dilakukan oleh pelanggan
        //System.out.println("Transaksi yang dilakukan oleh " + customer.getNama() + ":");
        List<Transaction> transaksi = customer.getEWallet().listTransactions();
        for (Transaction elemen : transaksi) {
            elemen.cetakInformasiTransaksi(customer.getNama());        }
    }
}