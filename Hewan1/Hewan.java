
package Hewan2;


public class Hewan {
    private String id;
    private String pemilik;
    private boolean statusPenitipan;

    public Hewan() {
        id = "18090044";
        pemilik = "Ilham Akhsani";
    }

    public Hewan(String nik, String nama) {
        this.id = id;
        this.pemilik = pemilik;
    }
    
    public void cetak() {
        System.out.println(id + " : " + pemilik);
    }

    // -- getter and setter

    public void setId(String id) {
        this.id = id;
    }

    public void setPemilik (String pemilik) {
        this.pemilik = pemilik;
    }

    public String getId() { return id; }

    public String getPemilik() { return pemilik; } 
    
    boolean status(boolean StatusPenitipan){
        this.statusPenitipan = statusPenitipan;
        return true;       
    }
    public void setStatus(boolean statusPenitipan) {
        this.statusPenitipan = statusPenitipan;
    }
  
}
