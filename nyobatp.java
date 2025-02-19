import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class nyobatp {
    private static Scanner scanner = new Scanner(System.in);
    private static LocalDate hariIni = LocalDate.now();
    private static int stok;
    private static double hargaBarang;
    private static double saldo;
    private static Random random;
    static String kodeBaru;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=============================================================");
        System.out.println("\n  ____             _                 _____         _ _       \r\n" +
                " |  _ \\           | |               |  __ \\       | (_)      \r\n" +
                " | |_) |_   _ _ __| |__   __ _ _ __ | |__) |__  __| |_  __ _ \r\n" +
                " |  _ <| | | | '__| '_ \\ / _` | '_ \\|  ___/ _ \\/ _` | |/ _` |\r\n" +
                " | |_) | |_| | |  | | | | (_| | | | | |  |  __/ (_| | | (_| |\r\n" +
                " |____/ \\__,_|_|  |_| |_|\\__,_|_| |_|_|   \\___|\\__,_|_|\\__,_|\r\n" +
                "                                                             \r\n" +
                "                                                             ");
        System.out.println("=============================================================");
        System.out.println("============== Selamat datang di Burhanpedia! ===============");
        System.out.println("=============================================================");

        //input stok awal
        System.out.print("Masukkan stok awal: ");
        stok = scanner.nextInt();

        //input harga barang
        System.out.print("Masukkan harga barang: ");
        hargaBarang = scanner.nextInt();  
        
        //input saldo awal
        System.out.print("Masukkan saldo awal: ");
        saldo = scanner.nextInt();  

        boolean running = true; 
        while(running){
            tampilkanMenuUtama();
            int pilihan = scanner.nextInt();

            switch(pilihan){
                case 1 -> menuPenjual();
                case 2 -> menuPembeli();
                case 3 -> hariBerikutnya();
                case 4 -> running = false;
                default -> System.out.println("Pilihan tidak valid!");
            }           
        } 
        System.out.println("\nTerima kasih telah menggunakan BurhanPedia!");
        scanner.close();
    }

    public static void tampilkanMenuUtama(){
        System.out.println("\nPilih menu:");
        System.out.println("1. Menu Penjual");
        System.out.println("2. Menu Pembeli");
        System.out.println("3. Hari Selanjutnya");
        System.out.println("4. Keluar");
        System.out.print("Pilihan: ");
    }

    public static void menuPenjual(){
        boolean menuPenjual = true;
        while (menuPenjual) {
            tampilkanMenuPenjual();
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1 -> cekStok();
                case 2 -> cekHargaBarang();
                case 3 -> tambahStok();
                case 4 -> ubahHargaBarang();
                case 5 -> generateVoucher();
                // case 6 -> kirimBarang();
                // case 7 -> lihatLaporanPendapatan();
                case 8 -> menuPenjual = false;
                default -> System.out.println("Pilihan tidak valid!");
            }
        }
    }

    public static void tampilkanMenuPenjual(){
        System.out.println("\n===== MENU PENJUAL =====");
        System.out.println("1. Cek Stok");
        System.out.println("2. Cek Harga Barang");
        System.out.println("3. Tambah Stok");
        System.out.println("4. Ubah Harga Barang");
        System.out.println("5. Generate Voucher");
        System.out.println("6. Kirim Barang");
        System.out.println("7. Lihat Laporan Pendapatan");
        System.out.println("8. Kembali ke menu utama");
        System.out.print("Perintah: ");
    }

    public static void menuPembeli(){
        boolean menuPembeli = true;
        while (menuPembeli) {
            tampilkanMenuPembeli();
            int pilihan = scanner.nextInt();       
            
            switch (pilihan) {
                case 1 -> cekSaldo();
                case 2 -> topUpSaldo();
                case 3 -> cekHargaBarang();
                case 4 -> beliBarang();
                case 5 -> kodeBaru = generateVoucher();
                // case 6 -> lacakBarang();
                // case 7 -> laporanPembelian();
                case 8 -> menuPembeli = false;
                default -> System.out.println("pilihan tidak valid!");
        }
    }
}   

    public static void tampilkanMenuPembeli() {
        System.out.println("\n===== MENU PEMBELI =====");
        System.out.println("1. Cek Saldo");
        System.out.println("2. Top Up Saldo");
        System.out.println("3. Cek Harga Barang");
        System.out.println("4. Beli Barang");
        System.out.println("5. Generate Voucher");
        System.out.println("6. Lacak Barang");
        System.out.println("7. Lihat Laporan Pembelian");
        System.out.println("8. Kembali ke menu utama");
        System.out.print("Perintah: ");
    }

    public static void hariBerikutnya(){
        hariIni = hariIni.plusDays(1);
        System.out.println("Hari ini: " + hariIni.format(DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy", new Locale("id", "ID"))));
        System.out.println("pok pok pok!");
        
    }  
   
    // fungsi untuk mengecek stok
    public static void cekStok() {
        System.out.println("==============================");
        System.out.println("Stok saat ini: " + stok);
        System.out.println("==============================");
    }

    // fungsi untuk mengecek saldo
    public static void cekSaldo() {
        System.out.println("==============================");
        System.out.println("Saldo saat ini: " + saldo);
        System.out.println("==============================");;
    }

    // fungsi untuk top up saldo
    public static void topUpSaldo() {
        System.out.print("\nMasukkan saldo yang ingin ditambah: ");
        int tambahSaldo = scanner.nextInt();
        saldo += tambahSaldo;
        System.out.println("stok berhasil ditambah! stok saat ini: " + saldo);
    }

    // fungsi untuk mengecek harga barang 
    public static void cekHargaBarang() {
        System.out.println("==============================");
        System.out.println("Harga barang saat ini: " + hargaBarang);
        System.out.println("==============================");
    }

    // fungsi untuk menambah stok barang
    public static void tambahStok(){
        System.out.print("\nMasukkan jumlah stok yang ingin ditambah: ");
        int tambahStok = scanner.nextInt();
        stok += tambahStok;
        System.out.println("stok berhasil ditambah! stok saat ini: " + stok);
    }
    
    // fungsi untuk mengubah harga barang
    public static void ubahHargaBarang() {
        System.out.print("\nMasukkan barang yang baru: ");
        hargaBarang = scanner.nextInt();       
        System.out.println("Harga barang berhasil diubah! Harga barang saat ini: " + hargaBarang);
        }

    // fungsi untuk generate voucher
    public static String generateVoucher() {
    String kode = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    StringBuilder voucher = new StringBuilder(10);
    StringBuilder kodeBaru = new StringBuilder(10);
    Random random = new Random();

    for (int i = 0; i < 10; i++) {
        voucher.append(kode.charAt(random.nextInt(kode.length())));
    }

       for (int i = 0; i < voucher.length(); i++) {
        char karakter = voucher.charAt(i);
        int nilai = karakter + 10;
        int newDigit = (nilai * i) % 10;
        kodeBaru.append(newDigit);
    }
    System.out.println("voucher berhasil dibuat: " + kodeBaru);

    return kodeBaru.toString();
    }

    // fungsi untuk menghitung diskon berdasarkan voucher
    public static double hitungDiskon(String kodeBaru) {
        int diskon = 0;
        int n = kodeBaru.length();

        // lakukan perkalian
        for (int i = 0; i < n; i++){
            int digit1 = Character.getNumericValue(kodeBaru.charAt(i));
            int digit2 = Character.getNumericValue(kodeBaru.charAt(n - 1 - i));
            diskon += digit1*digit2;           
        }

        if (diskon > 100){
            return hitungDiskon(String.valueOf(diskon));
        }

        return diskon;
    }

    // fungsi untuk melakukan transaksi pembelian
    public static void beliBarang() {
        System.out.print("Masukkan jumlah barang yang ingin dibeli: ");
        int jumlahBeli = scanner.nextInt();

        if (jumlahBeli <= 0) {
            System.out.println("Jumlah tidak valid!");
            return;
        } else if (jumlahBeli > stok) {
            System.out.println("Stok tidak mencukupi");
            return;
        }

        double totalHarga = jumlahBeli * hargaBarang;
        double diskon = 0;
        String kodeVoucher;

        while (true) {
            System.out.println("Masukkan kode voucher");
            System.out.println("Jika ingin buat, ketik 'generate'");
            System.out.println("Jika tidak ada, ketik 'skip'");
            System.out.print("Masukkan kode: ");
            kodeVoucher = scanner.next();

            if (kodeVoucher.equals("generate")) {
                // Generate voucher baru jika diminta
                kodeBaru = generateVoucher();
                System.out.print("Gunakan voucher ini atau masukkan kode lain.");
            } else if (kodeVoucher.equals(kodeBaru)) {
                // Hitung diskon jika kode voucher valid
                diskon = hitungDiskon(kodeVoucher);  // Menghitung diskon dalam bentuk persen
                System.out.println("Kode voucher diterima! Diskon " + diskon + "% diberikan.");
                break;
            } else if (kodeVoucher.equals("skip")) {
                break;

            } else if (!kodeVoucher.equals(String.valueOf(kodeBaru))){
                System.out.println("voucher yang dimasukkan salah!");
            } 
        }

        // Menghitung harga akhir setelah diskon
        double hargaAkhir = (totalHarga - (diskon / 100.0 * totalHarga));
        double hargaFinal = hargaAkhir - hargaAkhir*3/100; // dipotong pajak sebesar 3%

        if (saldo < hargaAkhir) {
            System.out.println("Saldo tidak mencukupi!");
            return;
        }

        // Update saldo dan stok
        saldo -= hargaAkhir;
        stok -= jumlahBeli;

        System.out.println("==============================");
        System.out.println("Pembelian berhasil!");
        System.out.println("Total harga: " + totalHarga);
        System.out.println("Diskon: " + diskon + "%");
        System.out.println("Harga akhir: " + hargaFinal);
        System.out.println("Saldo tersisa: " + saldo);
        System.out.println("Stok tersisa: " + stok);
        System.out.println("==============================");
    }
}
    


