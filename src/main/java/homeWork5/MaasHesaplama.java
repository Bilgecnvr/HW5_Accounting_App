package homeWork5;

public class MaasHesaplama {

    // Maaş hesaplama
    public static int maasHesapla(int calismaGunu) {
        return calismaGunu * 2000;
    }

    // Prim hesaplama
    public static int primHesapla(int calismaGunu) {
        int prim = 0;

        if (calismaGunu > 25) {
            prim += (25 - 20) * 1000;            // 21–25 gün arası
            prim += (calismaGunu - 25) * 3000;   // 25 üstü günler
        } else if (calismaGunu > 20) {
            prim += (calismaGunu - 20) * 1000;
        }

        return prim;
    }

    // Toplam maaş (üçlü operatör örneği)
    public static int toplamMaas(int calismaGunu) {
        int maas = maasHesapla(calismaGunu);
        int prim = primHesapla(calismaGunu);

        return prim > 0 ? maas + prim : maas; // koşul ? değer1 : değer2
    }
}