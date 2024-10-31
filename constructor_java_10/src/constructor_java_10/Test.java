package constructor_java_10;

public class Test 
{
	//hesap clasından obje uretıcez sonrada bu objeyı kullanıcaz 
	
	public static void main(String [] args) 
	{
		
		//bunu calısıtınca artık kendı yazdıgımız consttrctor gelıyor
		
		Hesap hesap1 =  new Hesap(); //bız bunu olusturduk ama ozllıklerı yok 
		//sımdı gırıyruz ozellıklerını 
		
		//set dolduruken ozllıgı 
/*		hesap1.setBakiye(1000.0);
		hesap1.setEmail("eminehusulu@gmail.com");
		hesap1.setHesapNo("123456");                //constuctorla doldurduk hesap cladında
		hesap1.setIsim("emine husulu");
		hesap1.setTelefonNo("123654");
*/		
		//get ekrana getırıp gosterırıken
		System.out.println("bakiye " + hesap1.getBakiye());
		
		//sımdı yukardakı gıbı tek tek ozllıkler vermek angarya gelebılıyor 
		//bunun yerıne constructorlar kullanılabılır
		// hesap clasına gıdıp constructor yazmaya baslıyoruz
		
		//hesap1 cagırılınca yukrdakı gıbı parameresız constructor cagırılıyor 
		//ama bu cagırılınca parametreli
	//	Hesap hesap2 =  new Hesap(1000.0,"sdfgfg@gmail" ,"12122","emine","124587"); //bu sfeer ıcını bos olusturmayacagız burda dolduruyoruz
		
		
	}
}