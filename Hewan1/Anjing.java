
package Hewan2;

public class Anjing extends Hewan{
    
     boolean statusSuntikRabies;

    
    public Anjing(boolean statusSuntikRabies){
        this.statusSuntikRabies = statusSuntikRabies;
    }

    
     @Override
    public void cetak() {
        System.out.println("---KETERANGAN----");
        System.out.println("ID : " + getId());
        System.out.println("Nama : " + getPemilik());
         System.out.println("Hewan : Anjing");        
        System.out.println("Status Suntik Rabies : "+statusSuntikRabies);
    }
    public static void main(String[] args) {
        Hewan hewan = new Hewan();
        Anjing njing = new Anjing(true);
        hewan.status(true);
        njing.cetak();
        
    }
    


}
