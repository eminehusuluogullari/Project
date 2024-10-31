/*Döngü kullanarak bir fibonacci fonksiyonu (Fib_Hesapla(int sira)) 
 * yazınız ve istenilen sıradaki elemanı ekrana yazdırınız. 
 * Fibonacci Dizisi: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 Fib_Hesapla(8)=21*/

package donguler_cs_1;

public class calisma1 
{
	public static void main(String [] args) 
	{
		int sira=9;
		System.out.println("fibhesappla(" + sira + ")="+ Fib_Hesapla(sira));
	}
	
	public static int Fib_Hesapla(int sira) 
	{
		if(sira <= 1)
		{
			return 1;
		}
		
		int birOnceki = 1;
		int ikiOnceki =1;
		int simdiki=1;
		
		for(int i=2 ; i<=sira  ;i++)
		{
			simdiki = birOnceki + ikiOnceki;
            ikiOnceki = birOnceki;
            birOnceki = simdiki;
		}
		
		return simdiki;
	}
}
