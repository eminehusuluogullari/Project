/*Girilen sayıdan küçük en büyük 3. Asal sayıyı bulunuz. Örnek : 25 => 23 , 19, 17 , Sonuc: 17*/

package donguler_cs_4;

import java.util.Scanner;

public class donguler4 
{
	
	
	public static boolean asalMi(int sayi) 
	{
		int sayac=0;
		for(int i=2;i<sayi;i++)
		{
			if(sayi % i==0) //tam bolerse asal degıldır
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String [] args) 
	{
		int sayac=0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("sayi girin..");
		int sayi=scanner.nextInt();
		
		for(int i= sayi;i>1;i--)
		{
			if(asalMi(i)) //asal ise 
			{
				System.out.println("asal: " + i);
				sayac++;
				
				if(sayac==3)
				{
					System.out.println("istenen: " + i);
					break;
				}
			}
		}
	}
}