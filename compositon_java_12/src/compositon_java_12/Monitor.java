package compositon_java_12;

public class Monitor 
{
	private String model;
	private String uretici;
	private String boy;
	
	private Resolution resolution; //resolutıon clasından burda bır obje olusturmak ıstıyoruz dıycez
	//monitorun ıcıne resolutıon koymus oldukk

	public Monitor(String model, String uretici, String boy, Resolution resolution) 
	{
		this.model = model;
		this.uretici = uretici;
		this.boy = boy;
		this.resolution = resolution;
	}

	public String getModel() 
	{
		return model;
	}

	public void setModel(String model) 
	{
		this.model = model;
	}

	public String getUretici() 
	{
		return uretici;
	}

	public void setUretici(String uretici) 
	{
		this.uretici = uretici;
	}

	public String getBoy() 
	{
		return boy;
	}

	public void setBoy(String boy) 
	{
		this.boy = boy;
	}

	public Resolution getResolution() 
	{
		return resolution;
	}

	public void setResolution(Resolution resolution) 
	{
		this.resolution = resolution;
	}
	
	public void monitoru_kapat() 
	{
		System.out.println("monitor kapatiliyor ...");
	}
}
