
public class PersonManager {
	public void list() {
		System.out.println("Kiþi listelendi.");
	}

	public void add() {							
		System.out.println("Kiþi eklendi.");
	}
	// add() metodundan hem extends edilen class içinde hem de kendi classýnýn içinde varsa
	// ve extends edilenin baskýn gelmesini istiyorsak final static yazmamýz gerekmektedir.
	// Eðer yazýlmazsa extends edilse dahi ayný isimli metot varsa kendi classý içindeki çalýþýr.
	
}
