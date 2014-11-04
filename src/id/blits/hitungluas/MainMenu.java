
package id.blits.hitungluas;


public class MainMenu {

    
    public static void main(String[] args) {
    PersegiPanjang hitung = new PersegiPanjang();
    hitung.panjang = 9;
    hitung.lebar = 6;
    hitung.hitungPersegiPanjang();
    
    Segitiga hitung2 = new Segitiga();
    hitung2.alas = 3;
    hitung2.tinggi = 3;
    hitung2.hitungSegitiga();
    
    Lingkaran hitung3 = new Lingkaran();
    hitung3.jari2= 7;
    hitung3.hitungLingkaran();
    
    Persegi hitung4 = new Persegi();
    hitung4.sisi= 20;
    hitung4.hitungPersegi();
    
    Trapesium hitung5 = new Trapesium();
    hitung5.pnjgsisi= 24;
    hitung5.tinggi=26;
    hitung5.hitungTrapesium();
           
    
    }
    
}
