import java.util.ArrayList;

public class Pelanggan {
    private String nama;
    private String ktp;
    private ArrayList<Kendaraan> kendaraanDisewa;

    public Pelanggan(String nama, String ktp){
        this.nama = nama;
        this.ktp = ktp;
        this.kendaraanDisewa = new ArrayList<>();
    }

    public String getNama(){
        return nama;
    }

    public String getKtp(){
        return ktp;
    }

    public ArrayList<Kendaraan> kendaraanDisewa(){
        return kendaraanDisewa;
    }

    public void tambahSewaKendaraan (Kendaraan kendaraan){
        kendaraanDisewa.add(kendaraan);
    }

    public void displayInfoPelanggan(){
        System.out.println("Nama Pelanggan: " + nama + ", ktp: " + ktp);
        System.out.println("Kendaraan yang disewa: ");
        for(Kendaraan kendaraan : kendaraanDisewa){
            kendaraan.displayInfo();
        }
    }

}
