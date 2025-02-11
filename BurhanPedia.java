import java.util.Scanner;

public class BurhanPedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input awal
        System.out.println("===============================================");
        System.out.println("          _                 _      _       _   ");
        System.out.println("         | |               (_)    | |     | |  ");
        System.out.println("         | |__   __ _ _ __  _  ___| | __ _| |_ ");
        System.out.println("         | '_ \\ / _` | '_ \\| |/ _ \\ |/ _` | __|");
        System.out.println("         | |_) | (_| | | | | |  __/ | (_| | |_ ");
        System.out.println("         |_.__/ \\__,_|_| |_|_|\\___|_|\\__,_|\\__|");
        System.out.println("===============================================");
        System.out.println("        Selamat datang di BurhanPedia!");
        System.out.println("===============================================");
        
        System.out.print("Masukkan stok awal: ");
        int stok = scanner.nextInt();
        
        System.out.print("Masukkan harga barang: ");
        double hargaBarang = scanner.nextDouble();
        
        System.out.print("Masukkan saldo awal: ");
        double saldo = scanner.nextDouble();
        
        boolean running = true;
        
        while (running) {
            System.out.println("\nPilih menu");
            System.out.println("1. Penjual");
            System.out.println("2. Pembeli");
            System.out.println("3. Hari Selanjutnya");
            System.out.println("4. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = scanner.nextInt();
            
            if (pilihan == 1) {
                boolean penjualMenu = true;
                while (penjualMenu) {
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
                            System.out.print("\nMasukkan jumlah stok yang ingin ditambah: ");
                            int tambahStok = scanner.nextInt();
                            stok += tambahStok;
                            System.out.println("Stok berhasil ditambah! Stok saat ini: " + stok);
                            break;
                        case 4:
                            System.out.print("\nMasukkan harga barang yang baru: ");
                            hargaBarang = scanner.nextDouble();
                            System.out.println("Harga barang berhasil diperbarui: " + hargaBarang);
                            break;
                        case 8:
                            penjualMenu = false;
                            break;
                        default:
                            System.out.println("Pilihan tidak valid, coba lagi.");
                            break;
                    }
                }
            } else if (pilihan == 4) {
                running = false;
            } else {
                System.out.println("Fitur ini belum tersedia!");
            }
        }
        
        System.out.println("\nTerima kasih telah menggunakan BurhanPedia!");
        scanner.close();
    }
}
