
public class PersonManager {
	public void list() {
		System.out.println("Ki�i listelendi.");
	}

	public void add() {							
		System.out.println("Ki�i eklendi.");
	}
	// add() metodundan hem extends edilen class i�inde hem de kendi class�n�n i�inde varsa
	// ve extends edilenin bask�n gelmesini istiyorsak final static yazmam�z gerekmektedir.
	// E�er yaz�lmazsa extends edilse dahi ayn� isimli metot varsa kendi class� i�indeki �al���r.
	
}
