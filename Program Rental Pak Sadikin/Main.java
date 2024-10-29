import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("PROGRAM UTS");
        System.out.println("Nama  : I Gede Ryandika Pramudia Wardana");
        System.out.println("NIM   : 2315101012");
        
        Rental rental = new Rental();
        Scanner scanner = new Scanner(System.in);

        Mobil mobil1 = new Mobil("Toyota Alphard 2013", "DK 1234 UD");
        Mobil mobil2 = new Mobil("Toyota Avanza veloz 2018", "DK 1423 VW");
        Motor motor1 = new Motor("Yamaha Tmax 2018", "DK 4623 AF"); 
        Motor motor2 = new Motor("Honda All New Vario 125 2020", "DK 4562 FE");

        rental.tambahKendaraan(mobil1);
        rental.tambahKendaraan(mobil2);
        rental.tambahKendaraan(motor1);
        rental.tambahKendaraan(motor2);

        System.out.println("");
        System.out.println("SELAMAT DATANG DI RENTAL PAK SADIKIN");
        System.out.println("");
        
        ArrayList<Pelanggan> pelanggans = new ArrayList<>();

        System.out.print("Masukkan jumlah pelanggan yang ingin meminjam: ");
        int jmlPelanggan =  scanner.nextInt();
        scanner.nextLine();

        for(int i = 1; i <= jmlPelanggan; i++){
            System.out.println("Masukkan data pelanggan " + i + ":");
            System.out.print("Nama: ");
            String nama = scanner.nextLine();

            System.out.print("KTP: ");
            String ktp = scanner.nextLine();

            
            //error check mencegah data yang sama
            boolean isDuplicate = false;
            for(Pelanggan pelanggan : pelanggans){
                if(pelanggan.getKtp().equals(ktp)){
                    System.out.println("Anda memasukkan ktp yang sama berulang, mohon masukkan ktp yang lain.");
                    i--;
                    isDuplicate = true;
                    break;
                }
            }

            if(isDuplicate){
                continue;
            }

            Pelanggan pelangganBaru = new Pelanggan(nama, ktp);
            pelanggans.add(pelangganBaru);

            boolean selesaiSewa = false;
            do { 
                System.out.println("");
                rental.displayKetersediaan();

                System.out.print("Masukkan nopol kendaraan yang ingin disewa: ");
                String nopol = scanner.nextLine();
                //System.out.println("Pilihan: ");
                //String[] pilihan = scanner.nextLine().split(",");

                Kendaraan kendaraanDipinjam = rental.cekKetersediaan(nopol);

                if(kendaraanDipinjam != null){
                    pelangganBaru.tambahSewaKendaraan(kendaraanDipinjam);
                    rental.hapusKendaraan(kendaraanDipinjam);
                    System.out.println("Kendaraan berhasil disewa!");
                } else {
                    System.out.println("Kendaraan tersebut tidak tersedia, silahkan pilih kendaraan lain.");
                }

                System.out.print("Apakah anda ingin menyewa kendawaan lain?(y/n): ");
                String jawaban = scanner.nextLine();
                if (jawaban.equalsIgnoreCase("n")) {
                    selesaiSewa = true;
                }

            } while (!selesaiSewa);
        }

        System.out.println("\n--- Daftar Pelanggan dan Kendaraan yang Disewa ---");
        for (Pelanggan p : pelanggans) {
            p.displayInfoPelanggan();
        }

        scanner.close();

    }
}
