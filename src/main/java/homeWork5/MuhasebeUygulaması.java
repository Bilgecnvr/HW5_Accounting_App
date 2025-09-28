package homeWork5;

public class MuhasebeUygulaması {
    public static void main(String[] args) {
        Personel p1 = new Personel("Ozlem", 18);
        Personel p2 = new Personel("Azize", 22);
        Personel p3 = new Personel("Bilge", 28);

        System.out.println(p1.ad + " maaşı: " + MaasHesaplama.toplamMaas(p1.calismaGunu));
        System.out.println(p2.ad + " maaşı: " + MaasHesaplama.toplamMaas(p2.calismaGunu));
        System.out.println(p3.ad + " maaşı: " + MaasHesaplama.toplamMaas(p3.calismaGunu));
    }
}