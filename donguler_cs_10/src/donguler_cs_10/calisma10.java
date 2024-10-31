/*10. Aşağıdaki gibi sonuç üretiniz.
 
 * 1 
 * 2 3 
 * 4 5 6 
 * 7 8 9 10
 * */

package donguler_cs_10;

import java.util.Scanner;

public class calisma10 
{
	public static void main(String [] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("satir sayisi girinn..");
		int satir = scanner.nextInt();
		
		Ucgen(satir);
	}
	
	public static void Ucgen(int satir) 
	{
		int sayi = 1; // Başlangıç sayısı

        for (int i = 1; i <= satir; i++) 
        {
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(sayi + " ");
                sayi++;
            }
            System.out.println(); // Her satırın sonunda yeni satıra geç
        }
	}
	/*sayi değişkeni, her sayının yazdırılması ve artırılması için kullanılır.
Dış döngü (for (int i = 1; i <= satir; i++)) her satır için döner.
İç döngü (for (int j = 1; j <= i; j++)) her satırda yazdırılacak sayıların sayısını belirler.
System.out.print(sayi + " "); ile sayılar ekrana yazdırılır.*/
}
