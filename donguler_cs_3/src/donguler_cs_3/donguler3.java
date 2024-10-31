/*Bir sayı serisi için serinin ilk elemanı, eleman sayısı ve artış miktarına göre serinin sonucunu hesaplayınız*/

package donguler_cs_3;

import java.util.Scanner;

public class donguler3 
{
	public static void main(String [] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		int ilkEleman=5;
		int elemanSayisi=5;
		int artisMiktari=5;
		
		int adet=0;
		
		while(adet<=5)
		{
			System.out.println(adet + ". elamnin sonucu " + (ilkEleman + adet*artisMiktari));
			adet++;
		}
		
		
		
		
	}
	
	
	
}
