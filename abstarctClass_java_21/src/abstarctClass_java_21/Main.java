/*
inhertance kullanarak ust sınıftan alt sınıflar turetebılıyorduk bu ust sınıfın tum ozllıklerını ve metotlarını kullanabılıyorduk yanı dırekt onları mıras alabılıyorduk ve ıstedıgımıze gorede bu de bu metotlar ovveride edıyorduk yada etmıorduk 
peki ınterfaclerde durum nasıldı biz interfaclere souyt yanı kod blogu ve mtotlarımızı yazıyoruduk ve bu ınterfaceyı ımplament eden her clas bu metotları kendıne gore yazıyordu 
pekı bız kesınlıkle ovverıde edılmes gereken metotları bır clasta bırıktırıp daha sonra bu clastan alt sınıflar turketmek ıstersek abstarct yanı soyut clasları kullanacagz
abstarct clas demek en az bır govdesız metodu var demektır
*/

package abstarctClass_java_21;

public class Main 
{
	public static void main(String[] args) 
	{
		//Sekil sekil =  new Sekil("sekil") ;//boyle hata veıryor cunku abstarctan nesne olusturamayız
	
		Kare kare1 = new Kare("Kare1",5);
		Daire daire1 = new Daire("Daire1",3);
	
		kare1.alan_hesapla();
		daire1.alan_hesapla();
		
		Sekil sekil;
		sekil= new Kare("kare2",6);
	
	}
}
