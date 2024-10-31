package odev;
import java.util.ArrayList;
import java.util.Scanner;

public class Main_2216 
{
    public static void main(String[] args) 
    {
        System.out.println("SORU1 ICIN ;");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı girin .. ");
        int X = scanner.nextInt();  

        ArrayList<Integer> sonuc = new ArrayList<>();  // ıstenen bolunmeyen sayıalrı burda tutuyoruz
        int adim = 1;  // sayacaz y aonun ıcın 
        
        // 3 den x e kadarkı kısım
        for (int i = 3; i <= X; i++) 
        {
            boolean bolunmuyor = true;

            // foreach dongusuyle tum sayıları bırıbırıyke karsılastrıcaz
            for (int sayi : sonuc) // foreach döngüsü
            {
                if (i % sayi == 0 || sayi % i == 0) //veya yanıı bolunme durumu varsa
                {  
                    bolunmuyor = false;  // bıızm sartı saglamadı kabul etmıyoz
                    break; //cık
                }
            }

            if (bolunmuyor) 
            {
                sonuc.add(i);  // ıstenenlere lıstemıze ekledık
                System.out.print("Adım "+ adim + ": ");
                
                for (int s :sonuc)  //yıne froecah donguyu komlpe dolanacak
                {
                    System.out.print(s +" ");
                }
                
                System.out.println();  
                adim++;  // bı sonrakı ıcın artıt
            }
        }

        System.out.println("kac sayı sagladı: " + sonuc.size());

        // SORU 2 için
        System.out.println("\nsoru 2 ye geldik ;");
        System.out.println("Sayı giirn .. ");
        int y = scanner.nextInt();  

        ArrayList<Integer> sonuc2 = new ArrayList<>();
        int adim2 = 1; 

        //y den balayıp 3 ekadarı 2 ser bak
        for (int i = y; i >= 3; i -= 2) //2ser azalarak gelıyor bak
        {
            boolean bolunmuyor = true;

            // dıgerlryle karsılastır
            for (int sayi2 : sonuc2) 
            {
                if (i % sayi2 == 0 || sayi2 % i == 0) // bolunurse
                {  
                    bolunmuyor = false;
                    break;
                }
            }

            if (bolunmuyor) 
            {
                sonuc2.add(i);  // listeliycez ya ekkle
                System.out.print("Adım "+adim2 +": ");
                
                for (int s : sonuc2) //ekranda gostercez
                {
                    System.out.print(s + " ");
                }
                
                System.out.println();  
                adim2++; 
            }
        }

        // kac deger saglanmıs onu goster
        System.out.println("Toplam sayı adeti: " + sonuc2.size());

    }
}
