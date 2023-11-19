package com.esra;

public class Runner_Foreach {
    public static void main(String[] args) {
        int[] dizi = new int[1000000];
        int toplam = 0;

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = i;
        }

        long baslangicZamani = System.currentTimeMillis();

        for (int i = 0; i < dizi.length; i++) {
            toplam += dizi[i];
        }

        long bitisZamani = System.currentTimeMillis();

        System.out.println("Toplam: " + toplam);
        System.out.println("For-each Benzeri Döngü Süresi: " + (bitisZamani - baslangicZamani) + " milisaniye");
    }
    /*
    Bu örnek, for döngüsü ile bir diziyi gezmenin geleneksel bir yolunu göstermektedir.
    Performans: Genellikle diğer döngülerle karşılaştırıldığında daha hızlıdır, ancak kodun okunabilirliğine katkıda bulunabilir.
     */
}
