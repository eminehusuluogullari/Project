/*a) ikilik tabanda sayıyı gösteriniz. Örnek: 9 => Sonuc: 1001 
 * b) ikilik tabanda yazılan sayıyı 10luk tabana ceviriniz. 1101 => 13*/

package donguler_cs_2;

import java.util.Scanner;

public class donguler2 
{
	public static void main(String [] args) 
	{
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("ikilik tabanda gosterilecek sayiyi girin..");
		int sayi= scanner.nextLine();
		System.out.println("ikilikte goster " + ikilikTaban(sayi));
		
		Scanner scanner2= new Scanner(System.in);
		System.out.println("onluk tabanda gosterilecek sayiyi girin..");
		int sayi2= scanner2.nextLine();
		System.out.println("10luk tabanda goster " + onlukTaban(sayi));

	}
	
	public static int ikilikTaban(int sayi);
	{
		
	}
	
	public static int onlukTaban(int sayi2);
	{
		
	}
}
