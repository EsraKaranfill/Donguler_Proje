package com.esra;

public class Runner_DoWhile {
    public static void main(String[] args) {
        int toplam = 0;
        int n = 1000000;
        int i = 0;

        long baslangicZamani = System.currentTimeMillis();

        do {
            toplam += i;
            i++;
        } while (i < n);

        long bitisZamani = System.currentTimeMillis();

        System.out.println("Toplam: " + toplam);
        System.out.println("Do-While Döngüsü Süresi: " + (bitisZamani - baslangicZamani) + " milisaniye");
    }
    /*
    do-while döngüsü, koşul testi döngünün sonunda yapılır, bu nedenle döngü en az bir kez çalışır.
Performans: Diğer döngülerle karşılaştırıldığında genellikle bir miktar daha yavaştır, çünkü koşul testi her iterasyondan önce değil, sonra gerçekleşir.
     */
}
