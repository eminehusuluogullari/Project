package compositon_java_12;

public class Bilgisayar 
{
	//monıtor claısndan bır tane monıtor referansı almısız demek oluyor bu 
	private Monitor monitor;
	//bılgisayarın ıcıne bu dıger 2 sını de eklıyoruz test javadakı gorusntuyu saglayabılmek ıcın
	private Kasa kasa;
	private Anakart anakart;
	
	public Bilgisayar(Monitor monitor, Kasa kasa, Anakart anakart) 
	{
		this.monitor = monitor;
		this.kasa = kasa;
		this.anakart = anakart;
	}

	public Monitor getMonitor() 
	{
		return monitor;
	}

	public void setMonitor(Monitor monitor) 
	{
		this.monitor = monitor;
	}

	public Kasa getKasa() 
	{
		return kasa;
	}

	public void setKasa(Kasa kasa) 
	{
		this.kasa = kasa;
	}

	public Anakart getAnakart() 
	{
		return anakart;
	}

	public void setAnakart(Anakart anakart) 
	{
		this.anakart = anakart;
	}
}
