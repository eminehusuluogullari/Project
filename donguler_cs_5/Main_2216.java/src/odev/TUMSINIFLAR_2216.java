/*package odev;

public class TUMSINIFLAR_2216 {

}*/


/*
package odev;
import java.util.ArrayList;
import java.util.Scanner;

public class Main_2216 {
    public static void main(String[] args) {
        System.out.println("SORU1 ICIN ;");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı girin .. ");
        int X = scanner.nextInt();  // Kullanıcıdan X sayısını alıyoruz

        ArrayList<Integer> sonuc = new ArrayList<>();  // Bölünmeyen sayıları tutan liste
        int adim = 1;  // Adım sayacını başlatıyoruz

        // 3'ten başlayarak X'e kadar olan sayıları kontrol edeceğiz
        for (int i = 3; i <= X; i++) {
            boolean bolunmuyor = true;

            // Her yeni sayıyı daha önce bulunan sayılarla karşılaştırıyoruz
            for (int sayi : sonuc) // foreach döngüsü
            {
                if (i % sayi == 0 || sayi % i == 0) {  // Eğer herhangi biri diğerine bölünüyorsa
                    bolunmuyor = false;  // Sayı bölünebilir, bu yüzden listeye eklenmeyecek
                    break;
                }
            }

            if (bolunmuyor) {
                sonuc.add(i);  // Bölünmeyen sayıyı listeye ekle
                System.out.print("Adım " + adim + ": ");
                
                for (int s : sonuc) {
                    System.out.print(s + " ");
                }
                
                System.out.println();  // Adım tamamlandı
                adim++;  // Sonraki adım için artış
            }
        }

        // Sonuç olarak toplam sayıyı ekrana yazdırıyoruz
        System.out.println("Toplam sayı adeti: " + sonuc.size());

        // SORU 2 için
        System.out.println("\nSORU2 ICIN ;");
        System.out.println("Sayı girin .. ");
        int y = scanner.nextInt();  // İlk scanner'ı kullanabilirsiniz, scanner2'ye gerek yok

        ArrayList<Integer> sonuc2 = new ArrayList<>();
        int adim2 = 1; // İkinci adım için sayaç

        // Y'den başlayıp 3'e kadar olan sayıları 2 azaltarak kontrol ediyoruz
        for (int i = y; i >= 3; i -= 2) {
            boolean bolunmuyor = true;

            // Daha önce eklenen sayılarla karşılaştır
            for (int sayi2 : sonuc2) {
                if (i % sayi2 == 0 || sayi2 % i == 0) {  // Eğer biri diğerine bölünüyorsa
                    bolunmuyor = false;
                    break;
                }
            }

            if (bolunmuyor) {
                sonuc2.add(i);  // Bölünmeyen sayıyı ekle
                System.out.print("Adım " + adim2 + ": ");
                
                for (int s : sonuc2) {
                    System.out.print(s + " ");
                }
                
                System.out.println();  // Adım tamamlandı
                adim2++;  // Sonraki adım
            }
        }

        // Toplam sayı adedi ekrana yazdırılıyor
        System.out.println("Toplam sayı adeti: " + sonuc2.size());

        scanner.close();  // Scanner'ı kapatmak iyi bir alışkanlıktır
    }
}
*/