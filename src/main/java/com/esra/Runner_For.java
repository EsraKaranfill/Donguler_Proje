package com.esra;

public class Runner_For {
    public static void main(String[] args) {
        int toplam = 0;
        int n = 1000000;

        long baslangicZamani = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {
            toplam += i;
        }

        long bitisZamani = System.currentTimeMillis();

        System.out.println("Toplam: " + toplam);
        System.out.println("For Döngüsü Süresi: " + (bitisZamani - baslangicZamani) + " milisaniye");

        /**
         * for döngüsü, belirli bir sayıda iterasyonla çalışır ve genellikle bir başlangıç değeri, bir bitiş koşulu ve bir artış miktarı içerir.
         * Performans: Genellikle diğer döngü türlerine göre hızlıdır çünkü döngü değişkeninin değeri sıklıkla bellekte doğrudan yer kaplar ve artış miktarını belirtir,
         * bu nedenle döngü değişkeni her seferinde değerlendirilir.
         */
    }
}
