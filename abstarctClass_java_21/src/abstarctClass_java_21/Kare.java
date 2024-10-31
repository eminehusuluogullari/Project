package abstarctClass_java_21;

public class Kare extends Sekil //dırket bunu yazınca hata verıyor ımplamet et
{
	//sekıldekı asbatct clasın govdesı yok cunku bız burda karede ve dairede kendımıze gore  doldurcaz
	//cunku 2 sının alanı aynı hesaplanmıyor 	
		
	//ve bıde kednı constructerımızı kendımız yazmak zorundayız
	//kendımız ozellık ekleyebılırz
	
	private int kenar;
	
	public Kare(String isim , int kenar)
	{
		super(isim);
		this.kenar=kenar;
	}
	
	@Override
	void alan_hesapla() 
	{
		System.out.println(getIsim() + " alani " + (kenar*kenar) + " dir");
	}
	
	public void cevre_hesapla() 
	{
		System.out.println(getIsim() + " in cevresi " + (4*kenar));
	}
	
}
