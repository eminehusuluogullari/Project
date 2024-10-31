package compositon_java_12;

public class Anakart 
{
	private String model;
	private int yuva_sayisi;
	private String uretici;
	private String isletim_sistemi;
	
	public Anakart(String model  ,String uretici ,int yuva_sayisi,String isletim_sistemi)
	{
		this.isletim_sistemi=isletim_sistemi;
		this.model=model;
		this.yuva_sayisi=yuva_sayisi;
		this.uretici=uretici;
	}

	public String getModel() 
	{
		return model;
	}

	public void setModel(String model) 
	{
		this.model = model;
	}

	public int getYuva_sayisi() 
	{
		return yuva_sayisi;
	}

	public void setYuva_sayisi(int yuva_sayisi) 
	{
		this.yuva_sayisi = yuva_sayisi;
	}

	public String getUretici() 
	{
		return uretici;
	}

	public void setUretici(String uretici) 
	{
		this.uretici = uretici;
	}

	public String getIsletim_sistemi() 
	{
		return isletim_sistemi;
	}

	public void setIsletim_sistemi(String isletim_sistemi) 
	{
		this.isletim_sistemi = isletim_sistemi;
	}
	
	public void isletim_sistemi_yukle (String isletim_sistemi) 
	{
		this.isletim_sistemi=isletim_sistemi;
		System.out.println("isletim sistemi yuklendi:" +isletim_sistemi);
	}
}
