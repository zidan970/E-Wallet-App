public class CustomerMain {
    public static void main(String[] args) {
        // create object
        Customer customer = new Customer();
        customer.setNama("itadori yuji");
        customer.setAlamat("sendai city");

        // print data customer
        System.out.println("Nama: " + customer.getNama());
        System.out.println("Alamat: " + customer.getAlamat());
    }
}