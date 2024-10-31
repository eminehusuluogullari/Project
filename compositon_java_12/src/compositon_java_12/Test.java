package compositon_java_12;

public class Test 
{
	/*
	Bilgisayar Objesi
	+---------------------------+
	|          					|
	|  +----------+  +--------+ |
	|  | Kasa     |  | Anakart| |
	|  | Objesi   |  | Objesi | |
	|  +----------+  +--------+ |
	|                           |
	|  +-------------------+    |
	|  | Monitor Objesi    |    |
	|  |  +-------------+  |    |        mesela monıtor objesnın  icine revulatıon yerlestırılmıs demek
	|  |  | Resolution  |  |    |
	|  |  | Objesi      |  |    |
	|  |  +-------------+  |    |
	|  +-------------------+    |
	+---------------------------+
	 */
	
	public static void main(String [] args) 
	{
		//resolution objemızı olusturuyoruz
		Resolution resolution = new Resolution(1920, 1080);
		//sımdı bızım resolution objeısnı monıtor objesıne yerlestırmemız gerekıyır 
		
		Monitor monitor = new Monitor("v53gd98", "asus", "18.5", resolution);
		
		Kasa kasa = new Kasa("djsfjhg","jhdgsf","dshkfj");
		
		Anakart anakart =  new Anakart("4578", "asus", 10, "gdshdfl");
		
		//sımdı artık pc objesımzıı olusturmamız gerekıyor 
		
		Bilgisayar pc = new Bilgisayar(monitor, kasa, anakart);
		
		pc.getKasa().bilgisayari_ac();
	}
}
