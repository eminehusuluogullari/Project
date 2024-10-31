/*5. * işareti kullanarak kare, dikdörtgen, eşkenar ve dik üçgen elde ediniz.*/

package donguler_cs_5;

import java.util.Scanner;

public class donguler5 
{
	public static void main(String [] args) 
	{
		//Scanner scanner = new Scanner(System.in);
	
		int kisaKenar=4;
		int uzunKenar=5;
		
		System.out.println("karemiz\n");
		Kare( kisaKenar );
	
		System.out.println("dikdortgenimiz\n");
		Dikdortgen( kisaKenar ,  uzunKenar);
	
		System.out.println("ucgenimiz\n");
		Ucgen( kisaKenar );
	
		System.out.println("eskernar ucgenimiz\n");
		EskenarUcgen( kisaKenar );
	
	}
	
	public static void Kare(int kisaKenar )
	{
		for(int i=0;i<=kisaKenar;i++)
		{
			for(int j=0;j<=kisaKenar;j++)
			{
				System.out.print("*"); //println alta gec demek ya prınt yap
			}
			System.out.println();
		}
	}
	
	public static void Dikdortgen(int kisaKenar , int uzunKenar)
	{
		for(int i=0;i<=kisaKenar;i++)
		{
			for(int j=0;j<=uzunKenar;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void Ucgen(int kisaKenar )
	{
		for(int j=1;j<=kisaKenar;j++)
		{
			for(int i=1;i<=j;i++)
			{
				System.out.print("*");
			}
		System.out.println();
		}
	}
	
	public static void EskenarUcgen(int kisaKenar )
	{
		for(int j=1;j<=kisaKenar;j++)
		{
			for(int i=1;i<=kisaKenar-j;i++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<(2*j-1);k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
}
