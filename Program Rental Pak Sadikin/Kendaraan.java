public abstract class Kendaraan{
    private String nopol;
    private String merkKendaraan;

    public Kendaraan(String merkKendaraan, String nopol){
        //this.tipeKendaraan = tipeKendaraan;
        this.merkKendaraan = merkKendaraan;
        this.nopol = nopol;
        //this.ketersediaan = ketersediaan;
    }


    public String getNopol(){
        return nopol;
    }

    /* 
    public String getTipeKendaraan(){
        return tipeKendaraan;
    }
    */

    public String getMerkKendaraan(){
        return merkKendaraan;
    }

    public abstract void displayInfo();

    /* 
    public int getKetersediaan(){
        return ketersediaan;
    }
    */
}