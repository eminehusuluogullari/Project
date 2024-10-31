import java.io.*;
import java.util.ArrayList;
import java.util.List;

import nesneClass_cs.Ogrenci;
import nesneClass_cs.nesne;

class Ogrenci 
{
    private String numara;
    private String adi;
    private double vize;
    private double finalNotu;
    private double ort;
    private String harfNotu;
    private boolean gectiMi;

    // Constructor
    public Ogrenci(String numara, String adi, double vize, double finalNotu) 
    {
        this.numara = numara;
        this.adi = adi;
        this.vize = vize;
        this.finalNotu = finalNotu;
        this.ort = (vize * 0.4) + (finalNotu * 0.6);
        this.harfNotu = hesaplaHarfNotu();
        this.gectiMi = ort >= 50;
    }

    // Harf Notunu Hesaplama
    private String hesaplaHarfNotu() 
    {
        if (ort >= 80) return "AA";
        else if (ort >= 70) return "BB";
        else if (ort >= 50) return "CC";
        else if (ort >= 40) return "DD";
        else return "FF";
    }

    // Getter Metotlar
    public String getNumara() 
    {
        return numara;
    }

    public String getAdi() 
    {
        return adi;
    }

    public double getVize() 
    {
        return vize;
    }

    public double getFinalNotu() 
    {
        return finalNotu;
    }

    public double getOrt() 
    {
        return ort;
    }

    public String getHarfNotu() 
    {
        return harfNotu;
    }

    public boolean isGectiMi() 
    {
        return gectiMi;
    }

    public void puanEkle(boolean vizeMi, int x) 
    {
        if (vizeMi) 
        {
            this.vize += x;
        } 
        else 
        {
            this.finalNotu += x;
        }
        this.ort = (vize * 0.4) + (finalNotu * 0.6); // Yeni ortalama hesapla
        this.harfNotu = hesaplaHarfNotu(); // Yeni harf notunu hesapla
    }

    @Override
    public String toString() 
    {
        return "Numara: " + numara + ", Adı: " + adi + ", Vize: " + vize + 
               ", Final: " + finalNotu + ", Ort: " + ort + 
               ", Harf Notu: " + harfNotu + ", Geçti mi: " + (gectiMi ? "Evet" : "Hayır");
    }
}

public class soru 
{ 
    private List<Ogrenci> ogrenciListesi;

    public soru() // Sınıfın constructor'ı
    { 
        ogrenciListesi = new ArrayList<>();
    }

    // 1. Öğrenci verilerini dosyadan okuma
    public void dosyadanOku(String dosyaAdi) 
    {
        try (BufferedReader br = new BufferedReader(new FileReader(dosyaAdi))) 
        {
            String line;
            while ((line = br.readLine()) != null) 
            {
                String[] parts = line.split(" ");
                String numara = parts[0];
                String adi = parts[1];
                double vize = Double.parseDouble(parts[2]);
                double finalNotu = Double.parseDouble(parts[3]);
                Ogrenci ogrenci = new Ogrenci(numara, adi, vize, finalNotu);
                ogrenciListesi.add(ogrenci);
            }
        } 
        catch (IOException e)  // hata yakalma try 
        {
            e.printStackTrace();
        }
    }
    
    
    
    
 // 2. Sınıf ortalamasını gösterme
    
    public double sinifOrtalamasi() 
    {
    	double toplamOrt=0;
    	
    	for (Ogrenci ogrenci:  ogrenciListesi )
    	{
    		toplamOrt = ogrenci.getOrt() + toplamOrt;
    	}
    	
    	return  (toplamOrt / ogrenciListesi.size()); //return dıgerınde kullanacaz
    }
    
 // 3. Öğrencileri sınıf ortalamasına göre ayırma
    
    public double grupGoster(double sinifOrtalamasi) //boyle kullanabılmek ıcın onun return olması greek
    {
    	List<Ogrenci> yuksekOgrenciler = new ArrayList<>();
    	List<Ogrenci> dusukOgrenciler = new ArrayList<>();
    	
    	for (Ogrenci ogrenci:  ogrenciListesi )
    	{
    		if(ogrenci.getOrt() >  sinifOrtalamasi)
    		{
    			yuksekOgrenciler.add(ogrenci);
    		}
    		else
    		{
    			dusukOgrenciler.add(ogrenci);
    		}
    	}
    	
    	for (Ogrenci ogrenci:  yuksekOgrenciler )
    	{
    		System.out.println(ogrenci);
    	}
    	
    	for (Ogrenci ogrenci:  dusukOgrenciler )
    	{
    		System.out.println(ogrenci);
    	}
    }
    
    
 // 4. Geçme durumunu ayırma
    
    public double gectiKaldıGoster() 
    {
    
	    List<Ogrenci> kalanOgrenciler= new ArrayList<>();
	    List<Ogrenci> gecenOgrenciler= new ArrayList<>();
	    
	    for( Ogrenci ogrenci: ogrenciListesi)
	    {
	    	if(ogrenci.getOrt() <= 49)
	    	{
	    		kalanOgrenciler.add(ogrenci);
	    	}
	    	
	    	else 
	    	{
	    		gecenOgrenciler.add(ogrenci);
	    	}
	    }
	    
	    for (Ogrenci ogrenci:  gecenOgrenciler )
    	{
    		System.out.println(ogrenci);
    	}
    	
    	for (Ogrenci ogrenci:  kalanOgrenciler )
    	{
    		System.out.println(ogrenci);
    	}
    }
    
 // 5. Tek/Çift numaralı öğrencileri gösterme
    
    
    public void tekCiftGoster(boolean tekmi) //ciftleri gosstseıeryoruz aslında
    {
    	for(Ogrenci ogrenci : ogrenciListesi)
    	{
    		String sayi= ogrenci.getNumara();
    		char sonBasamak= sayi.charAt(sayi.length() - 1);
    		
    		if((sonBasamak=='0' || sonBasamak=='2' || sonBasamak=='4'  || sonBasamak=='6' || sonBasamak=='8' ) != tekmi)
    		{
    			System.out.println("ciftler");
    			System.out.println(ogrenci);
    		}
    		
    	}
    }
    
 // 6. En düşük ortalamaya sahip öğrenciye puan ekleme
    
    private double enDusukOgrenciyePuanEkle(List<Ogrenci> kalanOgrenciler)
    {
    	double enDusuk= 100;
    
    	for( Ogrenci ogrenci : ogrenciListesi)
    	{
    		if(ogrenci.getOrt() < enDusuk)
    		{
    			enDusuk =ogrenci.getOrt() ;
    		}
    		
    		// en son en dusuk numara en dsuuk e atanmıs olvval
    		
    		enDusuk = ogrenci.getOrt() + 50;
    		
    		System.out.println("50 puanın eklnemıs halı : " + enDusuk);
    	}
    }
    
    
    
    
 // 7. Öğrencileri ortalama değerine göre sıralama
    
    public void ortalamayaGoreSirala()
    {
    	int n=ogrenciListesi.size();
    	
    	for(int i=0;i<n-1;i++)
    	{
    		for(int j=0;j<n-1-i;j++)
    		{
    			
    			if(ogrenciListesi.get(j).getOrt() > ogrenciListesi.get(j+1).getOrt())
    			{
    				Ogrenci temp = ogrenciListesi.get(j);                      // j. indeksteki öğrenci temp'e alınır
    				ogrenciListesi.set(j, ogrenciListesi.get(j + 1));          // j. indeksteki öğrenci yerine j+1. öğrenci yerleştirilir
    				ogrenciListesi.set(j + 1, temp);                           // j+1. indeksine temp'teki öğrenci yerleştirilir

    			}
    		}
    	}
    	
    	for( Ogrenci ogrenci : ogrenciListesi)
    	{
    		System.out.println(ogrenci);
    	}
    	
    	
    	
    }
    
    
 // 8. Yeni öğrenci ekleyerek sıralama
    public void yeniOgrenciEkle(Ogrenci yeniOgrenci)  // maınden ogrencı bılgılerı gırıyorz
    {
        // Yeni öğrenci listeye ekleniyor
        ogrenciListesi.add(yeniOgrenci);

        // Bubble Sort ile numaraya göre sıralama işlemi
        int n = ogrenciListesi.size();
        for (int i = 0; i < n - 1; i++) 
        {
            for (int j = 0; j < n - i - 1; j++) 
            {
                // Öğrencilerin numaralarını karşılaştırıyoruz
                if (ogrenciListesi.get(j).getNumara().compareTo(ogrenciListesi.get(j + 1).getNumara()) > 0) 
                {
                    // Eğer sıralama yanlışsa öğrencilerin yerini değiştiriyoruz
                    Ogrenci temp = ogrenciListesi.get(j);
                    ogrenciListesi.set(j, ogrenciListesi.get(j + 1));
                    ogrenciListesi.set(j + 1, temp);
                }
            }
        }

        System.out.println("Yeni Öğrenci Eklendi:");
        for (Ogrenci ogrenci : ogrenciListesi) 
        {
            System.out.println(ogrenci);
        }
    }
    
    
    
 // 9. Ort değerine göre tek ve çift en başarılı öğrencilerin yerlerini değiştirme
    
    public void swapEnBasariliOgrenciler()
    {
    	Ogrenci enBasariliTek=null;
    	Ogrenci enBasariliCift=null;
    	
    	for (Ogrenci ogrenci : ogrenciListesi) 
        {
            // Numarayı son karakterine bakarak tek veya çift olduğunu kontrol et
            char sonHarf = ogrenci.getNumara().charAt(ogrenci.getNumara().length() - 1);
            
            // Son karakterin '0', '2', '4', '6', '8' olup olmadığını kontrol et
            boolean ciftMi = (sonHarf == '0' || sonHarf == '2' || sonHarf == '4' || sonHarf == '6' || sonHarf == '8');

            if (!ciftMi) // Tek numara
            {
                if (enBasariliTek == null || ogrenci.getOrt() > enBasariliTek.getOrt()) 
                {
                    enBasariliTek = ogrenci;
                }
            } 
            else // Çift numara
            { 
                if (enBasariliCift == null || ogrenci.getOrt() > enBasariliCift.getOrt()) 
                {
                    enBasariliCift = ogrenci;
                }
            }
        }
    	
    	if (enBasariliTek != null && enBasariliCift != null) 
        {
            // Tek ve çift en başarılı öğrencilerin numaralarını değiştir
            String tempNumara = enBasariliTek.getNumara();
            enBasariliTek.setNumara(enBasariliCift.getNumara()); // Çift öğrencinin numarasını tek öğrenciye ata
            enBasariliCift.setNumara(tempNumara); // Tek öğrencinin numarasını çift öğrenciye ata

            System.out.println("Numara Değişimi Yapıldı:");
            System.out.println("Tek Numaralı En Başarılı: " + enBasariliTek);
            System.out.println("Çift Numaralı En Başarılı: " + enBasariliCift);
        }
    	
    	
    }
    
    
    
    public static void main(String[] args) 
    {
        soru sinif = new soru(); // nesne sınıfı oluşturuldu
        sinif.dosyadanOku("ogrenciler.txt"); // Öğrenci verilerini dosyadan oku
        double sinifOrtalamasi = sinif.sinifOrtalamasi(); // Sınıf ortalamasını hesapla
        sinif.grupGoster(sinifOrtalamasi); // Öğrencileri gruplandır
        sinif.gectiKaldıGoster(); // Geçen ve kalan öğrencileri göster
        sinif.tekCiftGoster(true); // Tek numaralı öğrencileri göster
        sinif.tekCiftGoster(false); // Çift numaralı öğrencileri göster
        sinif.enDusukOgrenciyePuanEkle(List<Ogrenci> kalanOgrenciler); // En düşük ortalamaya sahip öğrenciye puan ekle
        sinif.ortalamayaGoreSirala(); // Öğrencileri ortalamaya göre sırala
        sinif.yeniOgrenciEkle(new Ogrenci("123456", "Yeni Ogrenci", 70, 80)); // Yeni öğrenci ekle
        sinif.swapEnBasariliOgrenciler(); // En başarılı tek ve çift öğrencilerin yerini değiştir
    }
    
}