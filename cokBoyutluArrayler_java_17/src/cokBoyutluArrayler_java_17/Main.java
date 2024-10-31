package cokBoyutluArrayler_java_17;

import java.util.Scanner;

public class Main 
{
	public static void main(String [] args) 
	{
		int [] array = {1,2,3,4,5,6}; //tek boyulu
		
		int [][] array2 = new int[2][2] ; //2 satır 2 sutun boytlu olsun
		
		array2[0][0]=10; //0.satırın 0. sutununa deger ekledık
		array2[0][1]=20;
		array2[1][0]=30;
		array2[1][1]=40;
		
		//veya boyle doldurabılırız matrısı
		int [][] array3 = {{10,20},{30,40}};
		
		//System.out.println(array3[0][1]);
		
		int [][] array4 = new int[2][2] ; //bunun elemanlarını kullanıcıdan almak ıstıyoruz
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("degerleri girin..");
		
		for(int i=0;i<2;i++) //satir
		{
			for(int j=0;j<2;j++) //sutun
			{
				//System.out.println("i = " + i + " j= " + j); //indexleri gorelim diye
				array4[i][j] = scanner.nextInt(); //kullanıcı gırcek buraya
			}
		}
		
		System.out.println("sonuclar...");
		
		for(int i=0;i<2;i++) //satir
		{
			for(int j=0;j<2;j++) //sutun
			{
				System.out.print(array4[i][j] + " ");
			}
			
			System.out.println("");
		}
	}
}