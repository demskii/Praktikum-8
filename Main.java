import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String pilih;
        Scanner masukan = new Scanner(System.in);

        // membuat object orderan pada pada kelas Order
        Order orderan1 = new Order(121123, "Menunggu Pembayaran", new OrderDetail("10%"));
        Cash COD = new Cash(10000, 0);
        Credit Ngutang = new Credit(10000F, " 12121212828362863826", " Credit");
        Check PC = new Check(10000, "BRI", "111222666");

        // object OrderDetail
        OrderDetail barang = new OrderDetail("10%");
        barang.setQuantity(new Item("harga barang           : 30000", (float) 2));

        // List data customer menggunakan setter
        orderan1.setDataCustomer(new Customer("Tri", "semarang,Jawa Tengah,16633"));

        /*
         * callmethod menggunakan for dan Arrsday.asList pada infoOrderan
         * beserta operasi class lain
         */
        orderan1.infoOrderan();
        orderan1.SubTotal();
        orderan1.TotalWeight();
        orderan1.Total();
        barang.calcSubTotal();
        barang.calcWeight();
        orderan1.calcTax();

        System.out.println("=== PILIH METODE PEMBAYARAN====");
        System.out.println("Cash");
        System.out.println("Check");
        System.out.println("Credit");
        System.out.println("===KETIK METODE PEMBAYARAN 2 KALI===");
        masukan.next();
        pilih = masukan.next();

        switch (pilih) {
            case "Cash": {
                System.out.println("Cash On Delivery");
                COD.Pembayaran();
                System.out.println("Bayar ketika barang sudah diterima");
            }
            case "Credit": {
                System.out.println("Paylatter");
                Ngutang.Pembayaran();
                System.out.println("jangan lupa untuk membayar tagihan");
            }

            case "Check": {
                System.out.println("Masukan Nama bank");
                PC.Pembayaran();

                System.out.println("Terima kasih");

            }
        }

    }
}