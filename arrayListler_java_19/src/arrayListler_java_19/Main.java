package arrayListler_java_19;

import java.util.ArrayList;

public class Main 
{
	public static void main(String [] args) 
	{
		//biz bır arryın boyutunu belırledıkten sonra genısletme yapamıyorduk o yuzden sıdmı arrlıstlerle yaocaz
		
		ArrayList<String> arraylist = new ArrayList<String>() ;
		//	  arralıstıpı referansı  	arraylistte bır clas ondan boyel ayptık
		
		//arrylıst baska bır pakette onun seyını de ctrl bolsukla al
		
		//suan ArrayList bos bır referans
		
		//index sırasıyla ekleme oluyor
		arraylist.add("metllica");//eleman ekledık - 0.index
		arraylist.add("guns n roses"); //1..index
		arraylist.add("black sabbath"); //2..index
		arraylist.add("Iron maiden");//3..index
		
		//System.out.println(arraylist.get(0)); //0.indexi getır demek
	
		//arraylist.remove(1); //1indexi akldri dedik
		//arraylist.remove("metllica"); //veya ıcınde dırket degrı vererek de kaldırabılrız
		
		System.out.println("ararylist icindeki eleman sayisis : " + arraylist.size());
	
		//elemanın dırrekt yerını ogrenmeye calısalsım
		System.out.println("bastan kacinci indexte : " + arraylist.indexOf("Iron maiden"));
		
		//elamanın sondan kac oldugunu sayar buda 
		System.out.println("sondan kacinci indexte : " + arraylist.lastIndexOf("metllica"));

		//arraylistteki herhangı bır degreı gunelleme fonksıyonu 
		arraylist.set(2, "megated");
		//(kacıncı ındextekı yerle guncellmeek ıstedıgın , yenı guncel olan)
		
		//araylistelri boyle bastıırız
		for(int i=0;i< arraylist.size();i++) 
		{
			System.out.println(arraylist.get(i));
		}
		
		//bır arraylıstı bır fonksıyona gondermeye calaıscaz
		yazdir(arraylist); //arraylıstımızı gonderdık
		
	}
	
	public static void yazdir(ArrayList<String> a) //arrraylist parametresını alarak calısıyor
	{
		for(int i=0;i< a.size();i++) 
		{
			System.out.println("element  " + (i+1) + ": " + a.get(i));
		}
	}
}
