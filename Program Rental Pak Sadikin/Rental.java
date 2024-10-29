import java.util.ArrayList;

public class Rental {
    private ArrayList<Pelanggan> pelanggan;
    private ArrayList<Kendaraan> kendaraans;

    public Rental(){
        pelanggan =  new ArrayList<>();
        kendaraans = new ArrayList<>();
    }

    public void tambahKendaraan (Kendaraan kendaraan){
        kendaraans.add(kendaraan);
    }

    public void tambahPelanggan (Pelanggan p){
        pelanggan.add(p);
    }

    public void hapusKendaraan(Kendaraan kendaraan){
        kendaraans.remove(kendaraan);
    }

    public Kendaraan cekKetersediaan(String nopol) {
        for (Kendaraan kendaraan : kendaraans) {
            if (kendaraan.getNopol().equalsIgnoreCase(nopol)) {
                return kendaraan;
            }
        }
        return null;
    }

    public void displayKetersediaan(){
        System.out.println("Kendaraan tersedia: ");
        for(Kendaraan kendaraan : kendaraans){
            kendaraan.displayInfo();
        }
    }
}
