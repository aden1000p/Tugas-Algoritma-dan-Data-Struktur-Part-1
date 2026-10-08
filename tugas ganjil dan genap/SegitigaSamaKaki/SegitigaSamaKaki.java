public class SegitigaSamaKaki {
    // LUAS SEGITIGA SAMA KAKKI 

    // Method untuk Menghitung luas segitiga sama kaki 
    public static float HitungLuasSegitiga(float alas, float tinggi) {
        float luas = 1/2 * alas * tinggi;
        return luas;
    }

    // Tampilan alas kaki dan tinggi segitiga sama kaki 
    public static void segitiga_sama_kaki(String[] args){
        float alas = 5;
        float tinggi = 7;
        float Segitiga_Sama_kaki = HitungLuasSegitiga(alas, tinggi);
        System.out.println("SOAL 1 LUAS SEGITIGA SAMA KAKI ");
        System.out.println("Luas segitiga sama kaki dari alas " + alas + " dan tinggi " + tinggi + " adalah: " + Segitiga_Sama_kaki);
    }
}