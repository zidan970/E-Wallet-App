import java.util.ArrayList;
import java.util.List;

// Class Ewallet
class EWallet {
    private double saldo;
    private List<Transaction> transactions;
    private Customer customer;

    // constructor
    public EWallet() {
        this.transactions = new ArrayList<>();
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public double cekSaldo() {
        return saldo;
    }

    // topup
    public void topup(double nominal, String tanggal, String nomorReferensi, String metodePembayaran) {
        if (nominal > 0) {
            saldo += nominal;
            transactions.add(new Topup(nominal, tanggal, customer, nomorReferensi, metodePembayaran));
        } else {
            System.out.println("Nominal tidak valid. Silakan masukkan lebih dari Rp0,00");
        }
    }

    // transfer
    public void transfer(Customer penerima, double nominal, String tanggal) {
        if (nominal > 0 && saldo >= nominal) {
            saldo -= nominal;
            penerima.getEWallet().setSaldo(penerima.getEWallet().getSaldo() + nominal);
            transactions.add(new Transfer(nominal, tanggal, customer, penerima));
        } else {
            System.out.println("Nominal tidak valid. Jumlah yang Anda masukkan kurang dari Rp0,00 atau melebihi saldo.");
        }
    }

    // daftar transaksi
    public List<Transaction> listTransactions() {
        return transactions;
    }
}
