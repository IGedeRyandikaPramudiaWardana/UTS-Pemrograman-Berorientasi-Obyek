public class Mobil extends Kendaraan{
    
    public Mobil(String merkKendaraan, String nopol){
        super(merkKendaraan, nopol);
    }

    public void displayInfo(){
        System.out.println("Mobil - Merk: " + getMerkKendaraan() + ", Nopol: " + getNopol());
        
    }
}
