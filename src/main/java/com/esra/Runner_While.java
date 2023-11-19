package com.esra;

public class Runner_While {
    public static void main(String[] args) {
        int toplam = 0;
        int n = 1000000;
        int i = 0;

        long baslangicZamani = System.currentTimeMillis();

        while (i < n) {
            toplam += i;
            i++;
        }

        long bitisZamani = System.currentTimeMillis();

        System.out.println("Toplam: " + toplam);
        System.out.println("While Döngüsü Süresi: " + (bitisZamani - baslangicZamani) + " milisaniye");
    }
    /*
    while döngüsü, belirli bir koşul doğru olduğu sürece çalışır.
Performans: for döngüsüne benzer şekilde performanslıdır. Ancak, döngü değişkeninin güncellenmesi (örneğin i++) dikkatlice ele alınmalıdır, aksi takdirde sonsuz döngü riski vardır.
     */
}
