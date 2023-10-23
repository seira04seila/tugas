package segitiga;
public class Segitiga {
    public static void main(String[] args) {
        double tinggi=9;
        double alas=10;
        double luas=(alas*tinggi);
        System.out.println("Luas =" + luas/2);
        
         tiga tiga = new tiga();
         tiga.tinggi =9;
         tiga.alas=10;
        System.out.println(tiga.hitungLuas());
        
        tiga tiga2 = new tiga();
        tiga2.tinggi =90;
        tiga2.alas=100;
        
        limas limas = new limas();
        limas.Luas= 45;
        limas.Tinggi=20;
        System.out.println(limas.hitungVolume());
        
    }
    }
    
 