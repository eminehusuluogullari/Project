package arraylerdeIslemler_java_16;

import java.util.Arrays;
import java.util.Scanner;

public class Main 
{
	//sayi=arayin boyu 
	public static int[] arrayiDoldur( int sayi)//bu bize bır array referansı doncek
	{
		Scanner scanner =  new Scanner(System.in);
		
		int [] cikti = new int [sayi]; //sayi kadar yer almıs olduk
		
		System.out.println("degerleri girin..");
		for(int i=0; i<sayi;i++)
		{
			cikti[i] = scanner.nextInt(); //degerlerimizi kullanıcıdan alalım
		
			//cikti arryu boylece dolmus olvak
		}
		return cikti;
	}
	
	public static void arrayiBastir(int [] array) 
	{
		for(int i=0; i <array.length ;i++)
		{
			System.out.println("element " + (i+1) + ":" + array[i]);
		}
	}
	
	//array a nın yerıne gecıyor ve sıralama yapıyor
	public static void array_sort(int [] array) //siralama metodu
	{
		Arrays.sort(array); //bu sort kısmı arayımızı sıralayacak 
		arrayiBastir(array);
	}
	
	public static void main(String [] args) 
	{
		//refernas olusturalım
		int []a = arrayiDoldur(5); //sımdı arryı kullanıcıdan aldıgımız bılgılerle doldurcaz
		
		// a miz olusan arryı gostermıs oluyor  
	
		//arrayiBastir(a);
		//array_sort(a);
		
		int []a1 = {1,2,3,4,5,6};
		int []a2 = {1,2,3,4,5,6};
		
		 if(a1 == a2)//icerigi aynı olmasına ragmen farklı yerlerı gostermlerınden dolayı esit degillerdir
		 {
			 System.out.println("esittir..");
		 }
		 else
		 {
			 System.out.println("esit degiller..");
		 }
		
		 //eger ıcerıgını kıyaslamak ıstersek sadece 
		 
		 if(Arrays.equals(a1, a2))
		 {
			 System.out.println("esittir..");
		 }
		 else
		 {
			 System.out.println("esit degiller..");
		 }
	}
}
