import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class coba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menampilkan menu utama
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
        // input stok
        System.out.print("Masukkan stok awal: ");
        int stok = scanner.nextInt();

        // input harga
        System.out.print("Masukkan harga barang: ");
        double hargaBarang = scanner.nextDouble();

        // input saldo
        System.out.print("Masukkan saldo awal: ");
        double saldo = scanner.nextDouble();    

        // 
        boolean running  = true;

        while (running) {
            System.out.println("pilih menu: ");
            System.out.println("1. Penjual");
            System.out.println("2. Pembeli");
            System.out.println("3. Hari Selanjutnya");
            System.out.println("4. keluar");
            System.out.print("Perintah: ");
            int pilihan = scanner.nextInt();

            if (pilihan == 1) {
                
                boolean penjualmenu = true;

                while (penjualmenu) {
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
                    int perintah = scanner.nextInt();

                    switch (perintah) {
                        case 1:
                        System.out.println("\n=================================");
                        System.out.println("Stok saat ini: " + stok);
                        System.out.println("=================================");                            
                            break;
                        case 2:
                        System.out.println("\n=================================");
                        System.out.println("Harga barang saat ini: " + hargaBarang);
                        System.out.println("=================================");                            
                            break;
                        case 3:
                        System.out.println("\n=================================");
                        System.out.print("Masukkan jumlah stok yang ingin ditambahkan: ");
                        int tambahStok = scanner.nextInt();
                        stok += tambahStok;
                        System.out.println("Stok berhasil ditambah! Stok saat ini: " + stok);
                        case 4:
                        System.out.println("\n=================================");
                        System.out.print("Masukkan harga baru: ");
                        hargaBarang = scanner.nextDouble();
                        System.out.println("Harga barang berhasil diperbarui! Harga saat ini: " + hargaBarang);
                        case 8:
                        penjualmenu = false;
                            break;

                        default:
                            break;
                    }
                    
                }
            } else if(pilihan == 4){
                running = false;
            } else {
                System.out.println("Menu belom tersedia");
             

        }
    }
}
}
