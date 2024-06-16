import java.util.List;

public class CustomerMain {
    public static void main(String[] args) {
        // create object
        Customer customer = new Customer();
        customer.setNama("tom");
        customer.setAlamat("new york");
        // customer.getEWallet().setSaldo(5000);

        // create object
        Customer customer2 = new Customer();
        customer2.setNama("jennifer");
        customer2.setAlamat("london");

        // object ewallet
        EWallet ewallet = new EWallet();
        ewallet.setSaldo(5000);
        customer.setEWallet(ewallet);

        // object ewallet
        EWallet ewallet2 = new EWallet();
        ewallet2.setSaldo(5000);
        customer2.setEWallet(ewallet2);

        // print data customer
        System.out.println("Nama: " + customer.getNama());
        System.out.println("Alamat: " + customer.getAlamat());
        System.out.println("Saldo saat ini: " + customer.getEWallet().cekSaldo()+"\n");

        // print data customer
        System.out.println("Nama: " + customer2.getNama());
        System.out.println("Alamat: " + customer2.getAlamat());
        System.out.println("Saldo saat ini: " + customer2.getEWallet().cekSaldo()+"\n");

        // topup
        customer.getEWallet().topup(2500.0, "2024-06-02", "ABC456", "Credit Card");
        System.out.println("Saldo " + customer.getNama() + " setelah topup: " + customer.getEWallet().cekSaldo());

        // transfer
        customer.getEWallet().transfer(customer2, 500.0, "2024-06-02");
        System.out.println("Saldo " + customer.getNama() + " setelah transfer: " + customer.getEWallet().cekSaldo());
        System.out.println("Saldo " + customer2.getNama() + " setelah ditransfer: " + customer2.getEWallet().cekSaldo());

        // daftar transaksi
        System.out.println("\n" + "Daftar Transaksi:");
        List<Transaction> transaksi = customer.getEWallet().listTransactions();
        for (Transaction elemen : transaksi) {
            elemen.cetakInformasiTransaksi(customer.getNama());
        }
    }
}