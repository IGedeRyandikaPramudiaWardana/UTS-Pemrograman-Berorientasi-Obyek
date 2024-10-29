public class Motor extends Kendaraan{
    public Motor(String merkKendaraan, String nopol){
        super(merkKendaraan, nopol);
    }

    

    public void displayInfo(){
        System.out.println("Motor - Merk: " + getMerkKendaraan() + ", Nopol: " + getNopol());
    }
}
