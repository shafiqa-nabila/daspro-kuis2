import java.util.Scanner;
public class Kuis_20_Fika {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] penjualan20 = {
            {5, 8, 6, 7, 5, 10, 9}, //Fiksi
            {3, 5, 4, 6, 7, 6, 8}, //Non Fiksi
            {7, 6, 5, 8, 9, 7, 10}, //Pendidikan
            {6, 4, 5, 6, 8, 9, 11} //Komik 
        };

        double[][] harga20 = {
            {45.000,  45.000, 45.000, 45.000, 45.000, 55.000, 55.000}, //Fiksi
            {55.000, 55.000, 55.000, 55.000, 55.000, 65.000, 65.000}, //Non Fiksi
            {40.000, 40.000, 40.000, 40.000, 40.000, 50.000, 50.000},  //Pendidikan
            {35.000, 35.000, 35.000, 35.000, 35.000, 45.000 , 45.000 } //Komik
        };
        
        String[] kategori20 = {"Fiksi", "Non-Fiksi", "Pendidikan", "Komik"};
        String[] hari20 = {"Senin", "Selasa", "Rabu", "Kamis", "Jumay", "Sabtu", "Minggu"};

        
        //a.
        int[] totalPenjualanPerHari20 = new int[7];
        for (int i = 0; i < penjualan20.length; i++) {
            for (int j = 0; j < penjualan20[i].length; j++) {
                totalPenjualanPerHari20[j] += penjualan20[i][j];
            }
        }
        System.out.println("Banyak buku yang terjual setiap harinya:");
        for (int j = 0; j < totalPenjualanPerHari20.length; j++) {
            System.out.println(hari20[j] + ": " + totalPenjualanPerHari20[j]);
        }

        //b.
        int kategoriPilihan20 = 20 % 4;
        int totalPenjualanKategori20 = 0;

        for (int j = 0; j < penjualan20[kategoriPilihan20].length; j++) {
            totalPenjualanKategori20 += penjualan20[kategoriPilihan20][j];
        }

        double rataRataPenjualan20 = totalPenjualanKategori20 / 7.0;
        System.out.println("\nRata-rata penjualan buku pada kategori " + kategori20[kategoriPilihan20] + ": " + rataRataPenjualan20);

        //c.
        int totalPemasukan20 = 0;
        for (int i = 0; i < penjualan20.length; i++) {
            for (int j = 0; j < penjualan20[i].length; j++) {
                totalPemasukan20 += penjualan20[i][j] * harga20[i][j];
            }
        }

        //d.
        int nim20 = 221; 
        boolean nimGanjil20 = nim20 % 2 != 0;

        int minPenjualan20 = 0;
        int maxPenjualan20 = 0;
        String kategoriMin20 = "";
        String kategoriMax20 = "";
        String hariMin20 = "";
        String hariMax20 = "";

        for (int i = 0; i < penjualan20.length; i++) {
            for (int j = 0; j < penjualan20[i].length; j++) {
                if (penjualan20[i][j] < minPenjualan20) {
                    minPenjualan20 = penjualan20[i][j];
                    kategoriMin20 = kategori20[i];
                    hariMin20 = hari20[j];
                }
                if (penjualan20[i][j] > maxPenjualan20) {
                    maxPenjualan20 = penjualan20[i][j];
                    kategoriMax20 = kategori20[i];
                    hariMax20 = hari20[j];
                }
            }
        }

        System.out.println("\nTotal pemasukan toko buku selama seminggu: Rp " + totalPemasukan20);
    }
}

