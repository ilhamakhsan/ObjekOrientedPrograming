
package Hewan2;


public class Ikan extends Hewan{
    boolean statusGantiAir;

    
    
    public Ikan(boolean statusGantiAir){
        this.statusGantiAir = statusGantiAir;
    }

    

     @Override
    public void cetak() {
        System.out.println("---KETERANGAN----");
        System.out.println("ID : " + getId());
        System.out.println("Nama : " + getPemilik());
        System.out.println("Hewan : ikan");
        
        System.out.println("Status gantiAir : "+statusGantiAir);
    }
    public static void main(String[] args) {
        Hewan hewan = new Hewan();
        Ikan kan = new Ikan(true);
        hewan.status(true);
        kan.cetak();
        
    }
}
