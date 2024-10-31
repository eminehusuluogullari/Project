package arrayler_java_15;

import java.util.Scanner;

public class Main //array = belli veri tipinden verileri depoladigimiz liste 
{
	public static void arrayi_bastir(int [] array) //ben sana ınt arrayı refeansı gondercem send ebunun ustunde ıslem yapaacaksın demek
	{
		for(int i=0; i <array.length ;i++)
		{
			System.out.println("element " + (i+1) + ":" + array[i]);
		}
	}
	
	public static double ortalamabul(int [] array) 
	{
		int toplam=0;
		
		for(int i=0; i <array.length ;i++)
		{
			toplam= toplam + array[i];
		}
		
		System.out.print("ortalama : " );
		return  (double)(toplam/array.length);
		
	}
	
	public static void main(String [] args) 
	{
		// int[] a = new int[10]; //int arrayı cınsınden referansımızı koyduk  ve 10 deger tasiyacagız demek bu
		
		// index = 0, 1 , 2 ...
		
		// a[5]=32; //6.eleman
		
		int [] a= {1,2,3,4,5,6,7,8,9};
		//System.out.println(a[5]); //6.yi yaziyor
		
		int[] b = new int[5]; // bana 5 lik bir yer ayir ben bu dgerleri gircm demisş oluyoz
		
		/*
		Scanner scanner = new Scanner(System.in); //kullanıcıdan alcaz arrylerin degeri
		System.out.println("gir degerleri...");
		
		for(int i=0;i<5;i++)
		{
			b[i]=scanner.nextInt();
		}
		
		/*
		for(int i= 0; i< 5;i++)
		{
			b[i] = i*4 + 2;
		}
		*/
		
		int c[]= {10,20,30,40,50};
		System.out.println("arryin uzunlugu : " + c.length);
		
		//bastir
		/*for(int i= 0; i< 5;i++)
		{
			System.out.println(b[i]);
		}*/
		
		arrayi_bastir(c);
		System.out.println(ortalamabul(c));
	}
}