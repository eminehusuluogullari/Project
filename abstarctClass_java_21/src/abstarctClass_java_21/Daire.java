package abstarctClass_java_21;

public class Daire extends Sekil
{
	@Override
	void alan_hesapla() 
	{
		System.out.println(getIsim() + " alani " + (Math.PI * yaricap * yaricap));
	}
	
	//contucteri kendımız yazmak zorundayız
	
	private int yaricap;
	
	public Daire(String isim , int yaricap) 
	{
		super(isim);
		this.yaricap=yaricap;
	}
	
}
