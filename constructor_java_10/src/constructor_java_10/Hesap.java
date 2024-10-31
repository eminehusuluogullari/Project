package constructor_java_10;

public class Hesap 
{
	private String hesapNo;
	private double bakiye;
	private String isim;
	private String email;
	private String telefonNo;
	
	//constructo rolusturcaz 
	
	public Hesap() 
	{
		System.out.println("kendi yazdigimiz consttructor.... ");
	}
	
	//sımdı bır contrcutor daha yazıcaz yanııı;
	//methot overloadıng yapmıs oluyoruzzz
	
	public Hesap( String hesapNo, double  bakiye, String isim, String email ,String telefonNo) 
	{
		//sımdı bız bu constructorun ıcınde bu 5 tane ozlleıgı dırket sımdı burda gonderdıgımız degerlere eşitliycez 
	
		this.bakiye=bakiye;
		this.email=email;
		this.hesapNo=hesapNo;
		this.isim=isim;
		this.telefonNo=telefonNo;
	}
	
	//bu getter setter metotlarını elımle yazmadım kolay yolu su;
	
	/*
	Sağ tıklama menüsünden Source seçeneğini bul:

	Ekran görüntüsünde Source seçeneği görünüyor. Bu menüden devam edeceğiz.
	Source menüsünden Generate Getters and Setters... seçeneğini bul ve tıkla:

	Source menüsüne tıkladığında açılan alt menüde Generate Getters and Setters... seçeneği olacak.
	ona tıklarsan otomatık olusur 
	 */
	
	//bız setter getter metodu harıcı 2fonskıyon yazcaz paracekme ve yatırma dıye
	
	public void paraYatir(double miktar) 
	{
		this.bakiye = miktar + this.bakiye ;
			
		System.out.println("yeni bakiiye :" + bakiye);
	}
			
	public void paraCek(double miktar) 
	{
		if(miktar > 1500)
		{
			System.out.println("bir günde 1500 tl den fazla para cekemezsınız ...");
		}
			
		if(miktar -  bakiye < 0 )
		{
			System.out.println("yeterli bakiye yok");
		}
		else
		{
			this.bakiye = miktar - this.bakiye ;
				
			System.out.println("yeni bakiiye :" + bakiye);
		}	
	}	
	
	public String getHesapNo() 
	{
		return hesapNo;
	}
	
	public void setHesapNo(String hesapNo) 
	{
		this.hesapNo = hesapNo;
	}
	
	public double getBakiye() 
	{
		return bakiye;
	}
	
	public void setBakiye(double bakiye) 
	{
		this.bakiye = bakiye;
	}
	
	public String getIsim() 
	{
		return isim;
	}
	
	public void setIsim(String isim) 
	{
		this.isim = isim;
	}
	
	public String getEmail() 
	{
		return email;
	}
	
	public void setEmail(String email) 
	{
		this.email = email;
	}
	
	public String getTelefonNo() 
	{
		return telefonNo;
	}
	
	public void setTelefonNo(String telefonNo) 
	{
		this.telefonNo = telefonNo;
	}
	
	
}
