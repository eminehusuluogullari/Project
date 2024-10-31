package abstarctClass_java_21;

//bızım bu abstarct clasımızı ıcınde hem ozellıklerımız hem normal metorlarımız
//hemde abstacrt metotlarıız aynı anda bulunuyor

public abstract class Sekil 
{
	private String isim;

	public Sekil(String isim) 
	{
		this.isim = isim;
	}
	
	public void ismini_soyle() 
	{
		System.out.println("bu obje " + isim + " objesidir");
	}
	
	//sımdı bız bır abstarct yazcaz ve bu alt sınıftan usrttıgımız 
	//butun clasları burayı kendıne gore yazmak zorunda
	
	abstract void alan_hesapla(); //govdesız abstact metodumzu boyle yazılır

	public String getIsim() 
	{
		return isim;
	}

	public void setIsim(String isim) 
	{
		this.isim = isim;
	}
	
}
