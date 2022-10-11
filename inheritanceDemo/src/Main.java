
public class Main {

	public static void main(String[] args) {
		OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		ogretmenKrediManager.hesapla();
		
		KrediUI krediUI = new KrediUI();
		AskerKrediManager askerKrediManager = new AskerKrediManager();
		krediUI.krediHesapla(askerKrediManager);
	}

}
