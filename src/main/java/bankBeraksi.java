public class bankBeraksi {
    public static void main(String[] args) {
        Bank bankABC = new Bank(100000);

        System.out.println("Selamat Datang di Bank ABC");
        System.out.println("Saldo saat ini: Rp. " + bankABC.getSaldo());

        double simpanUang = 500000;
        bankABC.simpanUang(simpanUang);
        System.out.println("Simpan uang: Rp. " + simpanUang);
        System.out.println("Saldo saat ini: Rp. " + bankABC.getSaldo());

        double ambilUang = 150000;
        bankABC.ambilUang(ambilUang);
        System.out.println("Ambil uang: Rp. " + ambilUang);
        System.out.println("Saldo saat ini: Rp. " + bankABC.getSaldo());
    }
}
